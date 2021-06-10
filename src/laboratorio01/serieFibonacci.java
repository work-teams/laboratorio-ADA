package laboratorio01;

/**
 *
 * @author Vladnn100
 */
public class serieFibonacci {
    
    private static int contadorTiempo;
    
    public static int getContadorTiempo(){
        return contadorTiempo;
    }
    
    public static int nFibonacci(int n){
        contadorTiempo = 0;
        int i = 1;
        int fib = 0, anterior = 1, actual = 0;
        
        while(i<=n){
            fib = anterior + actual;
            anterior = actual;
            actual = fib;
            contadorTiempo++;
            i++;
        }
        return fib;
    }
    
}
