package decretijmsclient;

import decretiserver.DecretoDTO;
import jakarta.jms.ConnectionFactory;
import jakarta.jms.Destination;
import jakarta.jms.JMSContext;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class DecretiJmsClient {

    public static void main(String[] args) throws NamingException {
        Context ctx = new InitialContext();
        
        ConnectionFactory cf = (ConnectionFactory) ctx.lookup("jms/jakartaee10/ConnectionFactory");
        Destination topic = (Destination) ctx.lookup("jms/jakartaee10/Topic");
        
        DecretoDTO m = new DecretoDTO(1, 20);
        
        try(JMSContext jms = cf.createContext()){
            jms.createProducer().send(topic, m);            
        }
    }
    
}
