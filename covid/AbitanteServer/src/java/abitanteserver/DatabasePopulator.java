package abitanteserver;

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
    private AbitanteEJB ejb;
    
    private Abitante a1, a2, a3;
    
    @PostConstruct
    public void populateDB(){
        
        a1 = new Abitante(1, "Luigi", "Rossi", "Pensionato", 65, "M", 2, true, "no", "media");
        a2 = new Abitante(2, "Maria", "Bianchi", "Docente", 45, "F", 0, false, "no", "bassa");
        a3 = new Abitante(3, "Giovanni", "Verdi", "Pensionato", 67, "M", 1, false, "si", "alta");
        
        ejb.inserisci(a1);
        ejb.inserisci(a2);
        ejb.inserisci(a3); 
    }
    
    @PreDestroy
    public void clearDB(){
        ejb.elimina(a1);
        ejb.elimina(a2);
        ejb.elimina(a3);  
    }   
}
