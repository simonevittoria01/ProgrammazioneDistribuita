package abitanteserver;

import jakarta.enterprise.event.Observes;

public class NotificaAggiornamentoEvento {
    public void notifica(@Observes Abitante a){
        System.out.println("dati aggiornati");
        if(a.getInteresseVaccino().equalsIgnoreCase("si") && a.getCategoria().equalsIgnoreCase("Pensionato"))
            System.out.println("ecco un altro individuo che ha la precedenza sul piano vaccinale");           
    }
    
}
