package sanremoserver;

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
    private CanzoneEJB ejb;
    
    private Canzone c1, c2, c3;
    
    @PostConstruct
    public void populateDB(){
        c1 = new Canzone(1, "Diodato", "Pop", "Sai che cosa penso, che non dovrei pensare, che se poi penso sono un animale", false, 1000);
        c2 = new Canzone(2, "Piero Pelù", "Rock", "Spingi forte spingi forte salta fuori da quel buio", false, 13);
        c3 = new Canzone(3, "Morgan e Bugo", "Pop", "Le buone intenzioni, l'educazione", false, 5000);
        
        ejb.inserisci(c1);
        ejb.inserisci(c2);
        ejb.inserisci(c3);   
    }
     
    @PreDestroy
    public void clearDB(){
        ejb.elimina(c1);
        ejb.elimina(c2);
        ejb.elimina(c3);
    }
      
}
