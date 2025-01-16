package abbonamentoserver;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.annotation.sql.DataSourceDefinition;
import jakarta.ejb.EJB;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;
import java.time.LocalDate;

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
    private AbbonatoEJB ejb;
    
    private Abbonato a1, a2, a3, a4;
    
    @PostConstruct
    public void populateDB(){
        a1 = new Abbonato(1, "leo", "rossi", "normale", LocalDate.of(2025, 01, 30), LocalDate.of(2024, 12, 01), "sospeso");
        a2 = new Abbonato(2, "sofia", "ferrari", "premium", LocalDate.of(2025, 01, 30), LocalDate.of(2024, 12, 01), "valido");
        a3 = new Abbonato(3, "tom", "esposito", "studente", LocalDate.of(2025, 01, 30), LocalDate.of(2024, 12, 01), "valido");
        a4 = new Abbonato(4, "simo", "bianchi", "premium", LocalDate.of(2024, 01, 30), LocalDate.of(2024, 01, 01), "non valido");
        
        ejb.inserisci(a1);
        ejb.inserisci(a2);
        ejb.inserisci(a3);
        ejb.inserisci(a4);
    }
    
    @PreDestroy
    public void clearDB(){
        ejb.elimina(a1);
        ejb.elimina(a2);
        ejb.elimina(a3);
        ejb.elimina(a4);
    }
    
}
