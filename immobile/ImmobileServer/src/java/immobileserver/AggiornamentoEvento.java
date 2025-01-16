package immobileserver;

import jakarta.enterprise.event.Observes;

public class AggiornamentoEvento {
    public void notificaAggiornamento(@Observes @AggiornamentoQualifier Immobile i){
        if(i.getStato().equalsIgnoreCase("venduto"))
            System.out.println("immobile venduto a " + i.getIndirizzo());
    }
    
}
