package abbonamentojmsclient;

import abbonamentoserver.Abbonato;
import jakarta.jms.ConnectionFactory;
import jakarta.jms.Destination;
import jakarta.jms.JMSContext;
import java.time.LocalDate;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class AbbonamentoJmsClient {

    public static void main(String[] args) throws NamingException {
        Context ctx = new InitialContext();
        ConnectionFactory cf = (ConnectionFactory) ctx.lookup("jms/jakartaee10/ConnectionFactory");
        Destination topic = (Destination) ctx.lookup("jms/jakartaee10/Topic");
        
        Abbonato m1 = new Abbonato(4, "simo", "bianchi", "premium", LocalDate.of(2025, 01, 30), LocalDate.of(2025, 01, 01), "valido");
        Abbonato m2 = new Abbonato(5, "anto", "napoli", "premium", LocalDate.of(2025, 03, 30), LocalDate.of(2025, 11, 01), "valido");

        try(JMSContext jms = cf.createContext()){
            jms.createProducer().send(topic, m1);
            jms.createProducer().send(topic, m2);
        }
    }
    
}
