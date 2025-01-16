package decretiserver;

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
        className = "org.apache.derby.jdbc.ClientDataSource40",
        databaseName = "EsameDB",
        user = "simo", password = "simo"
)
public class DatabasePopulator {
    
    @EJB
    private DecretoEJB ejb;
    
    private Decreto d1, d2, d3;
    
    @PostConstruct
    public void populateDB(){
        d1 = new Decreto(1, "Decreto CoronaVirus", "Covid", "Sanitaria", 1, 12);
        d2 = new Decreto(2, "Fine del Mondo", "Diluvio", "Fine del Mondo", 1, 1);
        d3 = new Decreto(3, "Peste Nera", "Peste", "Sanitaria", 2, 8);
        
        ejb.inserisci(d1);
        ejb.inserisci(d2);
        ejb.inserisci(d3);
    }
    
    @PreDestroy
    public void clearDB(){
        ejb.elimina(d1);
        ejb.elimina(d2);
        ejb.elimina(d3);
    }
}
