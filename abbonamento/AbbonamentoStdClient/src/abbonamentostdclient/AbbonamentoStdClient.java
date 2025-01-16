package abbonamentostdclient;

import abbonamentoserver.Abbonato;
import abbonamentoserver.AbbonatoEJBRemote;
import java.time.LocalDate;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.List;

public class AbbonamentoStdClient {

    public static void main(String[] args) throws NamingException {
        Context ctx = new InitialContext();
        AbbonatoEJBRemote ejb = (AbbonatoEJBRemote) ctx.lookup("java:global/AbbonamentoServer/AbbonatoEJB!abbonamentoserver.AbbonatoEJBRemote");
        
        System.out.println("abbonati con abbonamento non scaduto");
        List<Abbonato> abbonati = ejb.trovaPerScadenza(LocalDate.now());
        for(Abbonato a : abbonati)
            System.out.println(a);
        
        System.out.println("abbonati con abbonamento valido, non scaduto e di tipo premium");
        abbonati = ejb.trovaPerTipo("valido", LocalDate.now(), "premium");
        for(Abbonato a : abbonati)
            System.out.println(a);        
    }
    
}
