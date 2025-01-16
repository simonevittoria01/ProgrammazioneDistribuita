package abitantewebclient;

public class AbitanteWebClient {

    public static void main(String[] args) {
        java.util.List<abitanteserver.Abitante> abitanti = trovaTutti();
        for(abitanteserver.Abitante a : abitanti)
            System.out.println(a.getNome());
    }
    
    private static java.util.List<abitanteserver.Abitante> trovaTutti(){
        abitanteserver.AbitanteEJBService service = new abitanteserver.AbitanteEJBService();
        abitanteserver.AbitanteEJB port = service.getAbitanteEJBPort();
        return port.trovaTutto();
    }
    
}
