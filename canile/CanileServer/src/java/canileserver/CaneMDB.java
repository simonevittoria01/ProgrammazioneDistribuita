package canileserver;

import jakarta.ejb.EJB;
import jakarta.ejb.MessageDriven;
import jakarta.jms.JMSException;
import jakarta.jms.Message;
import jakarta.jms.MessageListener;

@MessageDriven(mappedName = "jms/jakartaee10/Topic")
public class CaneMDB implements MessageListener{
    
    @EJB
    private CaneEJB ejb;
    
    public void onMessage(Message msg){
        try{
            CaneDTO m = msg.getBody(CaneDTO.class);
            Cane c = ejb.trovaPerId(m.getId());
            ejb.adotta(c.getId());          
        }catch(JMSException ex){
            ex.printStackTrace();
        }
        
    }
    
}
