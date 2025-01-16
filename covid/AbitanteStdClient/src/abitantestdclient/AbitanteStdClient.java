package abitantestdclient;

import abitanteserver.Abitante;
import abitanteserver.AbitanteEJBRemote;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.List;

public class AbitanteStdClient {

    public static void main(String[] args) throws NamingException{
        Context ctx = new InitialContext();
        AbitanteEJBRemote ejb = (AbitanteEJBRemote) ctx.lookup("java:global/AbitanteServer/AbitanteEJB!abitanteserver.AbitanteEJBRemote");
        
        System.out.println("tutti gli individui che hanno contratto il covid:");
        List<Abitante> abitanti = ejb.trovaPerContrattoCovid(true);
        for(Abitante a : abitanti)
            System.out.println(a);
        
        System.out.println("tutti i docenti che hanno meno di 55 anni:");
        abitanti = ejb.trovaPerCategoriaEeta("Docente", 55);
        for(Abitante a : abitanti)
            System.out.println(a);
        
        System.out.println("tutti i pensionati che sono interessati a fare il vaccino:");
        abitanti = ejb.trovaPerCategoriaEinteresseVaccino("Pensionato", "si");
        for(Abitante a : abitanti)
            System.out.println(a);    
    }
    
}
