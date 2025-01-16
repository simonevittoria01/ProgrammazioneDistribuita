package ricambiautoserver;

import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;
import java.util.HashMap;

@Interceptor
@Counter
public class CounterInterceptor {
    
    private HashMap<String, Integer> counterMap = new HashMap<String, Integer>();
    
    @AroundInvoke
    public Object counterMethod(InvocationContext ic) throws Exception{
        
        String method = ic.getMethod().getName();
        
        if(!counterMap.containsKey(method))
            counterMap.put(method, 0);
        counterMap.put(method, counterMap.get(method)+1);
        
        System.out.println("il metodo " + method + " è stato eseguito n. " + counterMap.get(method));
            
        return ic.proceed();        
    }
    
}
