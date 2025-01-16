package sanremostdclient;

import java.util.ArrayList;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import sanremoserver.CanzoneEJBRemote;
import java.util.List;
import java.util.Scanner;
import sanremoserver.Canzone;

public class SanremoStdClient {

    public static void main(String[] args) throws NamingException{
        Context ctx = new InitialContext();
        Scanner in = new Scanner(System.in);
        
        CanzoneEJBRemote ejb = (CanzoneEJBRemote) ctx.lookup("java:global/SanremoServer/CanzoneEJB!sanremoserver.CanzoneEJBRemote");
        
        List<Canzone> canzoni = new ArrayList();
        
        printAll(ejb, canzoni);
        printByCategory(ejb, canzoni, in);
        printByVotes(ejb, canzoni, in);          
    }
    
    private static void printAll(CanzoneEJBRemote ejb, List<Canzone> canzoni){
        System.out.println("tutte le canzoni disponibili in archivio:");
        canzoni = ejb.trovaTutto();
        for(Canzone c : canzoni)
            System.out.println(c);    
    }
    
    private static void printByCategory(CanzoneEJBRemote ejb, List<Canzone> canzoni, Scanner in){
        System.out.println("inserisci una categoria:");
        String cat = in.nextLine();
        canzoni = ejb.trovaPerCategoria(cat);
        System.out.println("canzoni con categoria " + cat);
        for(Canzone c : canzoni)
            System.out.println(c); 
    }
    
    private static void printByVotes(CanzoneEJBRemote ejb, List<Canzone> canzoni, Scanner in){
        System.out.println("inserisci un numero di voti:");
        int voti = in.nextInt();
        in.nextLine();
        canzoni = ejb.trovaPerVoti(voti);
        if(canzoni != null){
            System.out.println("canzoni con voti superiori a " + voti);
            for(Canzone c : canzoni)
                System.out.println(c); 
        }
        else
            System.out.println("hai inserito un parametro inferiore a 10");
    }
}
