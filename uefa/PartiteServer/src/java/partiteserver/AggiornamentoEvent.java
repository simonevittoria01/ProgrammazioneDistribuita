package partiteserver;

import jakarta.enterprise.event.Observes;

public class AggiornamentoEvent {
    public void notificaAggiornamento(@Observes @AggiornamentoQualifier Partita p){
        System.out.println("aggiornamento effettuato in " + p.getSquadraCasa() + "-" + p.getSquadraOspite());
    }
}
