package immobilestdclient;

import immobileserver.Immobile;
import immobileserver.ImmobileEJBRemote;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class ImmobileStdClient {

    public static void main(String[] args) throws NamingException{
        Context ctx = new InitialContext();
        
        ImmobileEJBRemote ejb = (ImmobileEJBRemote) ctx.lookup("java:global/ImmobileServer/ImmobileEJB!immobileserver.ImmobileEJBRemote");
        
        System.out.println("lista di tutti gli immobili in vendita:");
        List<Immobile> immobili = ejb.trovaPerStato("in vendita");
        for(Immobile i : immobili)
            System.out.println(i);
    
        //uso di date fittizie
        System.out.println("lista di tutti gli immobili in vendita da non più di due mesi:");
        //LocalDate dataAttuale = LocalDate.now();
        LocalDate dataAttuale = LocalDate.of(2024, 12, 1);
        LocalDate dataDueMesiPrima = dataAttuale.minusMonths(2);
        immobili = ejb.trovaPerDataVendita(dataDueMesiPrima);
        for(Immobile i : immobili)
            System.out.println(i);
        
    }
    
}
