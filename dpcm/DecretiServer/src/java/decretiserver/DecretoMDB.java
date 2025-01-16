package decretiserver;

import jakarta.ejb.EJB;
import jakarta.ejb.MessageDriven;
import jakarta.enterprise.event.Event;
import jakarta.inject.Inject;
import jakarta.jms.JMSException;
import jakarta.jms.Message;
import jakarta.jms.MessageListener;

@MessageDriven(mappedName = "jms/jakartaee10/Topic")
public class DecretoMDB implements MessageListener{
    
    @EJB
    private DecretoEJB ejb;
    
    @Inject
    private Event<Decreto> e;
    
    public void onMessage(Message msg){
        try{
            DecretoDTO mess = msg.getBody(DecretoDTO.class);
            Decreto d = ejb.trovaPerId(mess.getId());
            d.setNumeroPresentazioni(d.getNumeroPresentazioni()+mess.getNumPresentazioni());
            ejb.aggiorna(d);
            e.fire(d);
        }catch(JMSException e){
            e.printStackTrace();
        }
        
    }
    
}
