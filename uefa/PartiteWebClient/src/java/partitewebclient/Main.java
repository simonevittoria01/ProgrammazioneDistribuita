package partitewebclient;

public class Main {

    public static void main(String[] args) {
        java.util.List<partiteserver.Partita> partite = trovaGiocate();
        for(partiteserver.Partita p : partite)
            System.out.println(p.getSquadraCasa()+"-"+p.getSquadraOspite());
    }
    
    private static java.util.List<partiteserver.Partita> trovaGiocate(){
        partiteserver.PartitaEJBService service = new partiteserver.PartitaEJBService();
        partiteserver.PartitaEJB port = service.getPartitaEJBPort();
        return port.trovaPerPartiteGiocate(true);     
    }
    
}
