package abbonamentoserver;

import static abbonamentoserver.Abbonato.TROVA_PER_ID;
import static abbonamentoserver.Abbonato.TROVA_PER_SCADENZA;
import static abbonamentoserver.Abbonato.TROVA_PER_STATO;
import static abbonamentoserver.Abbonato.TROVA_PER_TIPO;
import static abbonamentoserver.Abbonato.TROVA_TUTTO;
import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import jakarta.jws.WebService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import java.time.LocalDate;
import java.util.List;

@Stateless
@LocalBean
@WebService
public class AbbonatoEJB implements AbbonatoEJBRemote {

    @Inject
    private EntityManager em;
    
    public void inserisci(Abbonato a){
        em.persist(a);
    }
    public void elimina(Abbonato a){
        em.remove(em.merge(a));
    }
    public void aggiorna(Abbonato a){
        em.merge(a);
    }
    
    public List<Abbonato> trovaPerStato(String stato){
        TypedQuery<Abbonato> q = em.createNamedQuery(TROVA_PER_STATO, Abbonato.class);
        q.setParameter("stato", stato);
        return q.getResultList();
    }
    public List<Abbonato> trovaTutto(){
        TypedQuery<Abbonato> q = em.createNamedQuery(TROVA_TUTTO, Abbonato.class);
        return q.getResultList();        
    }
    public List<Abbonato> trovaPerScadenza(LocalDate data){
        TypedQuery<Abbonato> q = em.createNamedQuery(TROVA_PER_SCADENZA, Abbonato.class);
        q.setParameter("data", data);
        return q.getResultList();
    }
    public List<Abbonato> trovaPerTipo(String stato, LocalDate data, String tipo){
        TypedQuery<Abbonato> q = em.createNamedQuery(TROVA_PER_TIPO, Abbonato.class);
        q.setParameter("stato", stato);
        q.setParameter("data", data);
        q.setParameter("tipo", tipo);
        return q.getResultList();
    }
    public Abbonato trovaPerId(int id){
        try{
            TypedQuery<Abbonato> q = em.createNamedQuery(TROVA_PER_ID, Abbonato.class);
            q.setParameter("id", id);
            return q.getSingleResult();
        }catch(Exception ex){
            return null;          
        }
    }    
}
