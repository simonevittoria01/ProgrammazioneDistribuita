package canileserver;

import jakarta.inject.Inject;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Interceptor
@Validate
public class ValidateInterceptor {
    
    @Inject
    private CaneEJBRemote ejb;
    
    @AroundInvoke
    public Object validate(InvocationContext ic) throws Exception{
        Object[] params = ic.getParameters();
        int id = (int) params[0];
        
        Cane c = ejb.trovaPerId(id);
        
        if(c.isStato()){
            System.out.println("l'operazione non è andata a buon fine");
            return false;
        }
        else
            return ic.proceed();
        
    }
    
}
