package ricambiautoclientstd;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import ricambiautoserver.ProdottoEJBRemote;
import java.util.List;
import java.util.Scanner;
import ricambiautoserver.Prodotto;

public class RicambiAutoClientStd {

    public static void main(String[] args) throws NamingException{
        Context ctx = new InitialContext();
        Scanner in = new Scanner(System.in);
        
        ProdottoEJBRemote ejb = (ProdottoEJBRemote) ctx.lookup("java:global/RicambiAutoServer/ProdottoEJB!ricambiautoserver.ProdottoEJBRemote");
        
        System.out.println("lista di tutti i prodotti disponibili in archivio:");
        List<Prodotto> prodotti = ejb.trovaTutti();
        for(Prodotto p : prodotti)
            System.out.println(p);
        
        System.out.println("inserisci una categoria:");
        String categoria = in.nextLine();
        prodotti = ejb.trovaPerCategoria(categoria);
        System.out.println("lista di tutti i prodotti " + categoria);
        for(Prodotto p : prodotti)
            System.out.println(p);
        
        System.out.println("lista di tutti i prodotti con disponibilità inferiore a 10 (da ordinare):");
        prodotti = ejb.trovaDaOrdinare();
        for(Prodotto p : prodotti)
            System.out.println(p);
    }
    
}
