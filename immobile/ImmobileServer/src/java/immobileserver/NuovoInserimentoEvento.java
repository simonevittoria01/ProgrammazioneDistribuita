package immobileserver;

import jakarta.enterprise.event.Observes;

public class NuovoInserimentoEvento {
    public void notificaInserimento(@Observes @NuovoInserimentoQualifier Immobile i){
        System.out.println(i.getCaricamentoDati() + ":inserimento immobile in " + i.getIndirizzo());
    }
}
