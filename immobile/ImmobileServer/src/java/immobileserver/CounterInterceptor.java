package immobileserver;

import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;
import java.util.HashMap;

@Interceptor
@Counter
public class CounterInterceptor {
    
    private HashMap<String, Integer> counterMap = new HashMap<String, Integer>();
    
    private int maxNum = 0;
    private String maxMethod;
    
    @AroundInvoke
    public Object counterMethod(InvocationContext ic) throws Exception{
        
        String method = ic.getMethod().getName();
        
        if(!counterMap.containsKey(method))
            counterMap.put(method, 0);
        
        counterMap.put(method, counterMap.get(method)+1);
        
        if(counterMap.get(method) > maxNum){
            maxNum = counterMap.get(method);
            maxMethod = method;
        }
        
        System.out.println("invocato " + method + ", n. " + counterMap.get(method) + ""
                + "; metodo più invocato: " + maxMethod + ", n. " + maxNum);
                   
        return ic.proceed();
    }
    
}
