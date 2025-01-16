package sanremojmsclient;

import jakarta.jms.ConnectionFactory;
import jakarta.jms.Destination;
import jakarta.jms.JMSContext;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import sanremoserver.MessageDTO;

public class SanremoJmsClient {

    public static void main(String[] args) throws NamingException{
        Context ctx = new InitialContext();
        
        ConnectionFactory cf = (ConnectionFactory) ctx.lookup("jms/jakartaee10/ConnectionFactory");
        Destination topic = (Destination) ctx.lookup("jms/jakartaee10/Topic");
        
        MessageDTO m1 = new MessageDTO(1, "Sai che cosa penso, che non dovrei pensare, che se poi penso sono un animale");
        MessageDTO m2 = new MessageDTO(3, "Le brutte intenzioni, la maleducazione");
        
        try(JMSContext jms = cf.createContext()){
            jms.createProducer().send(topic, m1);
            jms.createProducer().send(topic, m2);
        }
        
    }
    
}
