package immobilejmsclient;

import immobileserver.Immobile;
import jakarta.jms.ConnectionFactory;
import jakarta.jms.Destination;
import jakarta.jms.JMSContext;
import java.time.LocalDate;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class ImmobileJmsClient {

    public static void main(String[] args) throws NamingException {
        Context ctx = new InitialContext();
        
        ConnectionFactory cf = (ConnectionFactory) ctx.lookup("jms/jakartaee10/ConnectionFactory");
        Destination topic = (Destination) ctx.lookup("jms/jakartaee10/Topic");
        
        //nuovo immobile
        Immobile i1 = new Immobile(5, "Via Recanati, Salerno", 350000, LocalDate.of(2024, 12, 1), LocalDate.of(2024, 12, 1), "in vendita");
        
        //aggiornamento di un immobile esistente
        Immobile i2 = new Immobile(2, "Via Posidonia, Salerno", 400000, LocalDate.of(2024, 12, 1), LocalDate.of(2023, 10, 01), "venduto");

        
        try(JMSContext jms = cf.createContext()){
            jms.createProducer().send(topic, i1);
            jms.createProducer().send(topic, i2);
        }

    }
    
}
