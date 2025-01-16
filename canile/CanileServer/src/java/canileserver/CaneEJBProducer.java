package canileserver;

import jakarta.ejb.EJB;
import jakarta.enterprise.inject.Produces;

public class CaneEJBProducer {
    @Produces
    @EJB
    private CaneEJB ejb;
}
