package sanremoserver;

import jakarta.enterprise.event.Observes;

public class MorganBugoEvent {
    public void notificaMorganBugo(@Observes @MorganBugoQualifier Canzone c){
        System.out.println("dov'è andato Bugo?");
    }
    
}
