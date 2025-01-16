package immobileserver;

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
        databaseName = "EsameDB",
        className = "org.apache.derby.jdbc.ClientDataSource40"
)
public class DatabasePopulator {

    @EJB
    private ImmobileEJB ejb;
    
    private Immobile i1, i2, i3, i4;
    
    @PostConstruct
    public void populateDB(){
        //date fittizie
        i1 = new Immobile(1, "Via Garibali, Salerno", 600000, LocalDate.of(2024, 03, 01), LocalDate.of(2023, 10, 01), "in vendita");
        i2 = new Immobile(2, "Via Posidonia, Salerno", 400000, LocalDate.of(2024, 11, 01), LocalDate.of(2023, 10, 01), "in vendita");
        i3 = new Immobile(3, "Via dei Greci, Salerno", 200000, LocalDate.of(2023, 11, 01), LocalDate.of(2023, 10, 01), "venduto");
        i4 = new Immobile(4, "Via Porto, Salerno", 300000, LocalDate.of(2023, 11, 01), LocalDate.of(2023, 10, 01), "in trattativa");
        
        ejb.inserisci(i1);
        ejb.inserisci(i2);
        ejb.inserisci(i3);
        ejb.inserisci(i4);
    }
    
    @PreDestroy
    public void clearDB(){
        ejb.elimina(i1);
        ejb.elimina(i2);
        ejb.elimina(i3);
        ejb.elimina(i4);
    }
}
