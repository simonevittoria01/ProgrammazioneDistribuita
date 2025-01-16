package partiteserver;

import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import jakarta.jws.WebService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import java.util.List;
import static partiteserver.Partita.TROVA_PER_GOAL;
import static partiteserver.Partita.TROVA_PER_ID;
import static partiteserver.Partita.TROVA_PER_NUM_AMMONIZIONI;
import static partiteserver.Partita.TROVA_PER_NUM_ESPULSIONI;
import static partiteserver.Partita.TROVA_PER_PARTITE_GIOCATE;
import static partiteserver.Partita.TROVA_PER_TIPO;
import static partiteserver.Partita.TROVA_TUTTO;

@Stateless
@LocalBean
@WebService
@Counter
public class PartitaEJB implements PartitaEJBRemote {
    
    @Inject
    private EntityManager em;
    
    public void inserisci(Partita p){
        em.persist(p);
    }
    public void elimina(Partita p){
        em.remove(em.merge(p));
    }
    public void aggiorna(Partita p){
        em.merge(p);
    }
    
    public List<Partita> trovaPerTipo(String tipo){
        TypedQuery<Partita> q = em.createNamedQuery(TROVA_PER_TIPO, Partita.class);
        q.setParameter("tipo", tipo);
        return q.getResultList();
    }
    public List<Partita> trovaPerNumAmmonizioni(int ammonizioni){
        TypedQuery<Partita> q = em.createNamedQuery(TROVA_PER_NUM_AMMONIZIONI, Partita.class);
        q.setParameter("numAmmonizioni", ammonizioni);
        return q.getResultList();
    }
    public List<Partita> trovaPerNumEspulsioni(int espulsioni){
        TypedQuery<Partita> q = em.createNamedQuery(TROVA_PER_NUM_ESPULSIONI, Partita.class);
        q.setParameter("numEspulsioni", espulsioni);
        return q.getResultList();
    }
    public List<Partita> trovaTutto(){
        TypedQuery<Partita> q = em.createNamedQuery(TROVA_TUTTO, Partita.class);
        return q.getResultList();
    }
    public List<Partita> trovaPerGoal(int goalTotali){
        TypedQuery<Partita> q = em.createNamedQuery(TROVA_PER_GOAL, Partita.class);
        q.setParameter("goalTotali", goalTotali);
        return q.getResultList();
    }
    public Partita trovaPerId(int id){
        TypedQuery<Partita> q = em.createNamedQuery(TROVA_PER_ID, Partita.class);
        q.setParameter("id", id);
        return q.getSingleResult();
    }
    public List<Partita> trovaPerPartiteGiocate(boolean giocata){
        TypedQuery<Partita> q = em.createNamedQuery(TROVA_PER_PARTITE_GIOCATE, Partita.class);
        q.setParameter("giocata", giocata);
        return q.getResultList();
    }   
}
