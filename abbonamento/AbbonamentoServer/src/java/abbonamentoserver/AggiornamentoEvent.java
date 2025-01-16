package abbonamentoserver;

import jakarta.enterprise.event.Observes;

public class AggiornamentoEvent {
    public void notifica(@Observes @AggiornamentoQualifier Abbonato a){
        System.out.println("abbonamento rinnovato per " + a.getNome() + " " + a.getCognome());
    }
    
}
