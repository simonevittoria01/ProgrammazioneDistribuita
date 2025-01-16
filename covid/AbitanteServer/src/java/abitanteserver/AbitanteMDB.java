package abitanteserver;

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
public class AbitanteMDB implements MessageListener{
    
    @EJB
    private AbitanteEJB ejb;
    
    @Inject
    private Event<Abitante> e;
    
    public void onMessage(Message msg){
        try {
            AbitanteDTO m = msg.getBody(AbitanteDTO.class);
            Abitante a = ejb.trovaPerId(m.getId());
            a.setInteresseVaccino("si");
            ejb.aggiorna(a);
            e.fire(a);           
            if(a.getNumMalattiePregresse() >= 2)
                a.setPriorita("alta");
        } catch (JMSException ex) {
            Logger.getLogger(AbitanteMDB.class.getName()).log(Level.SEVERE, null, ex);
        }
  
    }
    
}
