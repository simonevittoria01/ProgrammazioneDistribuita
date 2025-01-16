package abitanteserver;

import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;
import java.util.HashMap;

@Interceptor
@Counter
public class CounterInterceptor {
    
    private HashMap<String, Integer> map = new HashMap<String, Integer>();
    
    @AroundInvoke
    public Object counterMethod(InvocationContext ic) throws Exception{
        String name = ic.getMethod().getName();
        if(!map.containsKey(name))
            map.put(name, 0);
        map.put(name, map.get(name)+1);
        
        System.out.println("invocato il metodo " + name + "; n. " + map.get(name));
        
        return ic.proceed();
    }
    
}
