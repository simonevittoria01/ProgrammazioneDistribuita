package ricambiautowebclient;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("inserisci l'id del prodotto da modificare:");
        int id = in.nextInt();
        in.nextLine();
        System.out.println("inserisci il nuovo prezzo:");
        double prezzo = in.nextDouble();
        in.nextLine();
        
        aggiorna(id, prezzo);
              
    }
    
    private static void aggiorna(int arg0, double arg1){
        ricambiautoserver.ProdottoEJBService service = new ricambiautoserver.ProdottoEJBService();
        ricambiautoserver.ProdottoEJB port = service.getProdottoEJBPort();
        port.modificaPrezzo(arg0, arg1);    
    }
    
}
