package sanremowebclient;

public class Main {

    public static void main(String[] args) {
        aggiornaVoti(2, 1000);      
    }
    
    private static void aggiornaVoti(int arg1, int arg2){
        sanremoserver.CanzoneEJBService service = new sanremoserver.CanzoneEJBService();
        sanremoserver.CanzoneEJB port = service.getCanzoneEJBPort();
        port.modificaVoti(arg1, arg2);     
    }
    
}
