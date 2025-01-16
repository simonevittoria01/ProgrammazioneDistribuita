package abbonamentoserver;

import jakarta.enterprise.event.Observes;

public class InserimentoEvent {
    public void notifica(@Observes @InserimentoQualifier Abbonato a){
        System.out.println(a.getDataCaricamentoDati() + ": inserimento abbonamento per " + a.getNome() + " " + a.getCognome() + " di tipo " + a.getTipoAbbonamento());
    }    
}
