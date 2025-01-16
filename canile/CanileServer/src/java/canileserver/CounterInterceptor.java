package canileserver;

import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;
import java.util.HashMap;

@Interceptor
@Counter
public class CounterInterceptor {
    
    private HashMap<String, Integer> map = new HashMap<String, Integer>();
    
    private int maxInvocation = 0;
    private String maxMethod = "";
    
    @AroundInvoke
    public Object log(InvocationContext ic) throws Exception{
        String name = ic.getMethod().getName();
        
        if(!map.containsKey(name))
            map.put(name, 0);
        
        map.put(name, map.get(name)+1);
        
        if(map.get(name) > maxInvocation){
            maxInvocation = map.get(name);
            maxMethod = name;
        }
        
        System.out.println("invocato metodo " + name + "(), numero invocazioni " + map.get(name) + ""
                + "; metodo con massimo numero di invocazioni " + maxMethod + "(), numero invocazioni " + maxInvocation);
        
        return ic.proceed();
    }
    
    
}
