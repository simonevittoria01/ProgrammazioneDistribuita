package ricambiautojmsclient;

import jakarta.jms.ConnectionFactory;
import jakarta.jms.Destination;
import jakarta.jms.JMSContext;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import ricambiautoserver.MessageDTO;

public class RicambiAutoJmsClient {

    public static void main(String[] args) throws NamingException{
        Context ctx = new InitialContext();
        
        ConnectionFactory cf = (ConnectionFactory) ctx.lookup("jms/jakartaee10/ConnectionFactory");
        Destination topic = (Destination) ctx.lookup("jms/jakartaee10/Topic");
        
        MessageDTO m = new MessageDTO(2, 100);
        MessageDTO m2 = new MessageDTO(1, 200);

        
        try(JMSContext jms = cf.createContext()){
            jms.createProducer().send(topic, m);
            jms.createProducer().send(topic, m2);
        }
           
    }
    
}
