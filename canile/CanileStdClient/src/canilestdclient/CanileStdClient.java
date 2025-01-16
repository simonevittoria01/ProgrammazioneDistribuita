package canilestdclient;

import canileserver.Cane;
import canileserver.CaneEJBRemote;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.List;

public class CanileStdClient {

    public static void main(String[] args) throws NamingException{
        Context ctx = new InitialContext();
        
        CaneEJBRemote ejb = (CaneEJBRemote) ctx.lookup("java:global/CanileServer/CaneEJB!canileserver.CaneEJBRemote");
        
        System.out.println("cani di taglia piccola e di età maggiore o uguale a 8 anni");
        List<Cane> cani = ejb.trovaPerTagliaEeta("Piccola", "8+");
        for(Cane c : cani)
            System.out.println(c);
        
        System.out.println("cani non ancora adottati");
        cani = ejb.trovaPerStato(false);
        for(Cane c : cani)
            System.out.println(c); 
    }
    
}
