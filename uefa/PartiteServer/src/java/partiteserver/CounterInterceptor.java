package partiteserver;

import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;
import java.util.HashMap;

@Interceptor
@Counter
public class CounterInterceptor {
    
    private HashMap<String, Integer> map = new HashMap<String, Integer>();
    
    private int numMax = 0;
    private String methodMax = "";
    
    @AroundInvoke
    public Object log(InvocationContext ic) throws Exception{
        String nome = ic.getMethod().getName();
        
        if(!map.containsKey(nome))
            map.put(nome, 0);
        
        map.put(nome, map.get(nome)+1);
        
        if(map.get(nome)>numMax){
            numMax = map.get(nome);
            methodMax = nome;
        }
        
        System.out.println("invocato il metodo " + nome + " n. " + map.get(nome) + ""
                + ". Il metodo con più invocazioni è " + methodMax + " n. " + numMax);
        
        return ic.proceed();
    }  
}
