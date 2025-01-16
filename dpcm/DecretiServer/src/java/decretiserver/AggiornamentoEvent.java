package decretiserver;

import jakarta.enterprise.event.Observes;

public class AggiornamentoEvent {
    public void notifica(@Observes Decreto d){
        System.out.println("aggiornamento avvenuto per il decreto " + d.getNome());
    }
    
}
