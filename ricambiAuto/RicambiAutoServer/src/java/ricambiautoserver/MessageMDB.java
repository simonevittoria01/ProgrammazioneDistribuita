package ricambiautoserver;

import jakarta.ejb.EJB;
import jakarta.ejb.MessageDriven;
import jakarta.enterprise.event.Event;
import jakarta.inject.Inject;
import jakarta.jms.JMSException;
import jakarta.jms.Message;
import jakarta.jms.MessageListener;
import java.util.logging.Level;
import java.util.logging.Logger;


@MessageDriven(mappedName = "jms/jakartaee10/Topic")
public class MessageMDB implements MessageListener{
    
    @EJB
    private ProdottoEJB ejb;
    
    @Inject
    private Event<Prodotto> e;
    
    public void onMessage(Message msg){
        try {
            MessageDTO m = msg.getBody(MessageDTO.class);
            Prodotto p = ejb.trovaPerId(m.getId());
            p.setVenduti(p.getVenduti()+m.getVendite());
            ejb.aggiorna(p);            
            e.fire(p);   
        } catch (JMSException ex) {
            Logger.getLogger(MessageMDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
}
