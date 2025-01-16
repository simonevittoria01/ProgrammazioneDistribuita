package partiteserver;

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
        databaseName = "EsameDB",
        user = "simo", password = "simo",
        properties = {"connectionAttributes=;create=true"}
)
public class DatabasePopulator {
    
    @EJB
    private PartitaEJB ejb;
    
    private Partita p1, p2, p3, p4;
    
    @PostConstruct
    public void populateDB(){
        p1 = new Partita(1, "Girone 1", "Turchia", "Italia", 0, 3, 0, 0, true);
        p2 = new Partita(2, "Girone 2", "Italia", "Svizzera", 3, 0, 1, 1, true);
        p3 = new Partita(3, "Ottavi", "Inghilterra", "Germania", 2, 0, 3, 1, true);
        p4 = new Partita(4, "Quarti", "belgio", "Italia", 0, 0, 0, 0, false);
        
        ejb.inserisci(p1);
        ejb.inserisci(p2);
        ejb.inserisci(p3);
        ejb.inserisci(p4);   
    }
    
    @PreDestroy
    public void clearDB(){
        ejb.elimina(p1);
        ejb.elimina(p2);
        ejb.elimina(p3);
        ejb.elimina(p4);
    }  
}
