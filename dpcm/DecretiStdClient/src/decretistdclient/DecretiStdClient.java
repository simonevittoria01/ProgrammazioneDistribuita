package decretistdclient;

import decretiserver.Decreto;
import decretiserver.DecretoEJBRemote;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.List;
import java.util.Scanner;

public class DecretiStdClient {

    public static void main(String[] args) throws NamingException{
        Context ctx = new InitialContext();
        Scanner in = new Scanner(System.in);
        
        DecretoEJBRemote ejb = (DecretoEJBRemote) ctx.lookup("java:global/DecretiServer/DecretoEJB!decretiserver.DecretoEJBRemote");
        
        System.out.println("tutti i decreti in archivio:");
        List<Decreto> decreti = ejb.trovaTutto();
        for(Decreto d : decreti)
            System.out.println(d);
        
        System.out.println("inserisci una categoria:");
        String categoria = in.nextLine();
        decreti = ejb.trovaPerCategoria(categoria);
        System.out.println("decreti di categoria " + categoria);
        for(Decreto d : decreti)
            System.out.println(d);
        
        System.out.println("inserisci un numero minimo di presentazioni alla stampa:");
        int num = in.nextInt();
        in.nextLine();
        decreti = ejb.trovaPerPresentazioni(num);
        System.out.println("decreti con numero di presentazioni maggiore di " + num);
        for(Decreto d : decreti)
            System.out.println(d);  
    }
    
}
