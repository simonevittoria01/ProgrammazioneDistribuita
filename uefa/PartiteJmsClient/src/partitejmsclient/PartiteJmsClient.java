package partitejmsclient;

import jakarta.jms.ConnectionFactory;
import jakarta.jms.Destination;
import jakarta.jms.JMSContext;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import partiteserver.PartitaDTO;

public class PartiteJmsClient {


    public static void main(String[] args) throws NamingException{
        Context ctx = new InitialContext();
        
        ConnectionFactory cf = (ConnectionFactory) ctx.lookup("jms/jakartaee10/ConnectionFactory");
        Destination topic = (Destination) ctx.lookup("jms/jakartaee10/Topic");
        
        PartitaDTO p1 = new PartitaDTO(1, 0, 2);
        PartitaDTO p2 = new PartitaDTO(3, 1, 0);
        
        try(JMSContext jms = cf.createContext()){
            jms.createProducer().send(topic, p1);
            jms.createProducer().send(topic, p2);
        }  
    }   
}
