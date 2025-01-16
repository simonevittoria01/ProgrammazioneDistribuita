package partiteserver;

import jakarta.ejb.EJB;
import jakarta.ejb.MessageDriven;
import jakarta.enterprise.event.Event;
import jakarta.inject.Inject;
import jakarta.jms.JMSException;
import jakarta.jms.Message;
import jakarta.jms.MessageListener;

@MessageDriven(mappedName = "jms/jakartaee10/Topic")
public class PartitaMDB implements MessageListener{
    
    @EJB
    private PartitaEJB ejb;
    
    @Inject @AggiornamentoQualifier
    private Event<Partita> aggiornamento;
    
    @Inject @ItaliaQualifier
    private Event<Partita> italia;

    public void onMessage(Message msg){
        try{
            PartitaDTO dto = msg.getBody(PartitaDTO.class);
            Partita p = ejb.trovaPerId(dto.getId());
            p.setGoalCasa(p.getGoalCasa()+dto.getGolCasa());
            p.setGoalOspite(p.getGoalOspite()+dto.getGolOspite());
            
            aggiornamento.fire(p);
            
            if((p.getSquadraCasa().equalsIgnoreCase("italia") && dto.getGolCasa()>0)
                    || (p.getSquadraOspite().equalsIgnoreCase("italia") && dto.getGolOspite()>0))
                italia.fire(p);     
        }catch(JMSException ex){
            ex.printStackTrace();
        }       
    }   
}
