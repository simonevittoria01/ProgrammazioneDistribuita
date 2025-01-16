package sanremoserver;

import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Interceptor
@Validate
public class ValidateInterceptor {
    
    @AroundInvoke
    public Object validate(InvocationContext ic) throws Exception{
        Object[] params = ic.getParameters();
        int voti = (int) params[0];
        if(voti < 10)
            return null;
        else
            return ic.proceed();        
    }    
}
