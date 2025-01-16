package abbonamentoserver;

import jakarta.ejb.EJB;
import jakarta.ejb.MessageDriven;
import jakarta.enterprise.event.Event;
import jakarta.inject.Inject;
import jakarta.jms.JMSException;
import jakarta.jms.Message;
import jakarta.jms.MessageListener;

@MessageDriven(mappedName = "jms/jakartaee10/Topic")
public class AbbonatoMDB implements MessageListener{
    @EJB
    private AbbonatoEJB ejb;
    
    @Inject @AggiornamentoQualifier
    private Event<Abbonato> aggiornamento;
    
    @Inject @InserimentoQualifier
    private Event<Abbonato> inserimento;
    
    public void onMessage(Message msg){
        try{
            Abbonato mess = msg.getBody(Abbonato.class);
            Abbonato a = ejb.trovaPerId(mess.getId());
            
            if( a != null && !(a.getDataScadenza().equals(mess.getDataScadenza())) ){
                ejb.aggiorna(mess);
                aggiornamento.fire(a);
            }            
            if(a == null){
                ejb.inserisci(mess);
                inserimento.fire(mess);
            }         
        }catch(JMSException ex){
            ex.printStackTrace();
        }
        
    }
    
    
}
