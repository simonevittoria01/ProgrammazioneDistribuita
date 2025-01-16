package canilewebclient;

public class CanileWebClient {


    public static void main(String[] args) {
        java.util.List<canileserver.Cane> cani = stampaAdottati();
        for(canileserver.Cane c : cani)
            System.out.println(c.getNome());
    }
    
    private static java.util.List<canileserver.Cane> stampaAdottati(){
        canileserver.CaneEJBService service = new canileserver.CaneEJBService();
        canileserver.CaneEJB port = service.getCaneEJBPort();
        return port.trovaPerStato(true);
    }
    
}
