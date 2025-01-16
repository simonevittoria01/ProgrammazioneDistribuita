package immobilewebclient;

public class Main {

    public static void main(String[] args) {
        java.util.List<immobileserver.Immobile> immobili = venduti();
        for(immobileserver.Immobile i : immobili)
            System.out.println(i.getId());
    }
    
    private static java.util.List<immobileserver.Immobile> venduti(){
        immobileserver.ImmobileEJBService service = new immobileserver.ImmobileEJBService();
        immobileserver.ImmobileEJB port = service.getImmobileEJBPort();
        return port.trovaPerStato("venduto");
    }
    
}
