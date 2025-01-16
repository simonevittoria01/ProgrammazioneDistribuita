package ricambiautoserver;

import jakarta.enterprise.event.Observes;

public class AggiornamentoEvent {
    public void notifica(@Observes Prodotto p){
        System.out.println("vendite aggiornate per " + p.getNome());
    }
}
