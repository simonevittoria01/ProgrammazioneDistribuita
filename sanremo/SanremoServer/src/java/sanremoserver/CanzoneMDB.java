package sanremoserver;

import jakarta.ejb.EJB;
import jakarta.ejb.MessageDriven;
import jakarta.enterprise.event.Event;
import jakarta.inject.Inject;
import jakarta.jms.JMSException;
import jakarta.jms.Message;
import jakarta.jms.MessageListener;

@MessageDriven(mappedName = "jms/jakartaee10/Topic")
public class CanzoneMDB implements MessageListener{

    @EJB
    private CanzoneEJB ejb;
    
    @Inject @MorganBugoQualifier
    private Event<Canzone> morganEbugo;
    
    @Inject
    private Event<Canzone> aggiornamento;
    
    public void onMessage(Message msg){
        try {
            MessageDTO m = msg.getBody(MessageDTO.class);
            Canzone c = ejb.trovaPerId(m.getId());
            
            if(c.getNome().equalsIgnoreCase("Morgan e Bugo") && m.getIncipit().equalsIgnoreCase("Le brutte intenzioni, la maleducazione")){
                c.setNome("Morgan");
                c.setCantato(true);
                morganEbugo.fire(c);
                return;
            }
            
            if(m.getIncipit().equalsIgnoreCase(c.getIncipit())){
                c.setCantato(true);
                aggiornamento.fire(c);
            }
                                                
        } catch (JMSException e){
            e.printStackTrace();
        }
                
    }   
}
