package canileserver;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.annotation.sql.DataSourceDefinition;
import jakarta.ejb.EJB;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;

@Singleton
@Startup
@DataSourceDefinition(
        name = "java:global/jdbc/EsameDS",
        className = "org.apache.derby.jdbc.ClientDataSource",
        databaseName = "EsameDB"
)
public class DatabasePopulator {
    
    @EJB
    private CaneEJB ejb;
    
    private Cane c1, c2, c3, c4;
    
    @PostConstruct
    public void populateDB(){
        c1 = new Cane(1, "Meticcio", "Leo", "Piccola", "M", "0-2", "941000001156168", true);
        c2 = new Cane(2, "Meticcio", "Luna", "Piccola", "F", "8+", "380260041762325", true);
        c3 = new Cane(3, "Boston", "Eros", "Media", "M", "8+", "941000001581506", false);
        c4 = new Cane(4, "Pastore", "Pan", "Grande", "F", "3-7", "981100000297746", true);

        ejb.inserisci(c1);
        ejb.inserisci(c2);
        ejb.inserisci(c3);
        ejb.inserisci(c4); 
    }
    
    @PreDestroy
    public void clearDB(){
        ejb.elimina(c1);
        ejb.elimina(c2);
        ejb.elimina(c3);
        ejb.elimina(c4);
    } 
}
