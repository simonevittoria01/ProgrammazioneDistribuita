package partiteserver;

import jakarta.enterprise.event.Observes;

public class ItaliaEvent {
    public void italiaNotifica(@Observes @ItaliaQualifier Partita p){
        System.out.println("nella partita " + p.getSquadraCasa() + "-" + p.getSquadraOspite() + " ha segnato l'Italia");
        System.out.println("Aleee :-)");
    }
    
}
