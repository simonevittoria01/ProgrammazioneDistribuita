package sanremoserver;

import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Interceptor
@Counter
public class CounterInterceptor {
    
    private int categoria = 0, tutto = 0;
    
    @AroundInvoke
    public Object counterMethod(InvocationContext ic) throws Exception{
        if(ic.getMethod().getName().equalsIgnoreCase("trovaPerCategoria")){
            categoria++;
            System.out.println("chiamata n. " + categoria + ": metodo trovaPerCategoria");
        }
        else{
            tutto++;
            System.out.println("chiamata n. " + tutto + ": metodo trovaTutto");
        }
        
        return ic.proceed();       
    }
    
}
