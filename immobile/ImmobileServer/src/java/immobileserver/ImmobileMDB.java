package immobileserver;

import jakarta.ejb.EJB;
import jakarta.ejb.MessageDriven;
import jakarta.enterprise.event.Event;
import jakarta.inject.Inject;
import jakarta.jms.JMSException;
import jakarta.jms.Message;
import jakarta.jms.MessageListener;

@MessageDriven(mappedName = "jms/jakartaee10/Topic")
public class ImmobileMDB implements MessageListener{
    
    @EJB
    private ImmobileEJB ejb;
    
    @Inject @NuovoInserimentoQualifier
    private Event<Immobile> e1;
    
    @Inject @AggiornamentoQualifier
    private Event<Immobile> e2;

    @Override
    public void onMessage(Message msg){
        try{
            Immobile mess = msg.getBody(Immobile.class);

            if((ejb.trovaPerId(mess.getId())) == null){
                ejb.inserisci(mess);
                e1.fire(mess);
            }
            else{
                ejb.aggiorna(mess);
                e2.fire(mess);
            }
        }catch(JMSException ex){
            ex.printStackTrace();
        }
    }
    
    
}
