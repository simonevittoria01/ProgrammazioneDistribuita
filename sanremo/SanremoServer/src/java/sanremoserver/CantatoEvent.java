package sanremoserver;

import jakarta.enterprise.event.Observes;

public class CantatoEvent {
    public void notificaCantato(@Observes Canzone c){
        System.out.println(c.getNome() + " ha cantato");
    }
    
}
