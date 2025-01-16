package partitestdclient;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import partiteserver.PartitaEJBRemote;
import java.util.List;
import partiteserver.Partita;

public class PartiteStdClient {

    public static void main(String[] args) throws NamingException{
        Context ctx = new InitialContext();
        PartitaEJBRemote ejb = (PartitaEJBRemote) ctx.lookup("java:global/PartiteServer/PartitaEJB!partiteserver.PartitaEJBRemote");
        
        System.out.println("tutte le partite finite con numero di goal maggiore di 2");
        List<Partita> partite = ejb.trovaPerGoal(2);
        for(Partita p : partite)
            System.out.println(p);
        
        System.out.println("tutte le partite con 0 espulsioni");
        partite = ejb.trovaPerNumEspulsioni(0);
        for(Partita p : partite)
            System.out.println(p);
    }
    
}
