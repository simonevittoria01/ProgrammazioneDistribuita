package ricambiautoserver;

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
        databaseName = "EsameDB"
)
public class DatabasePopulator {

    @EJB
    private ProdottoEJB ejb;
    
    private Prodotto p1, p2, p3;
    
    @PostConstruct
    public void populateDB(){

        p1 = new Prodotto(1, "Sensore Temperatura", "Motore", 18.22, 100, 1000);
        p2 = new Prodotto(2, "Fap", "Filtri", 188.47, 9, 1);
        p3 = new Prodotto(3, "Dischi Freni", "Freni", 18.15, 2000, 5000);

        ejb.inserisci(p1);
        ejb.inserisci(p2);
        ejb.inserisci(p3);  
    }
    
    @PreDestroy
    public void clearDB(){
        ejb.elimina(p1);
        ejb.elimina(p2);
        ejb.elimina(p3);
    }     
}
