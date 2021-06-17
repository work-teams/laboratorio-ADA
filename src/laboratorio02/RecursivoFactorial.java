/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio02;

/**
 *
 * @author vladnn100
 */
public class RecursivoFactorial {
    private static int contadorTiempo;
    
    public RecursivoFactorial(){
        contadorTiempo = 0;
    }
    
    public static int getContadorTiempo(){
        return contadorTiempo;
    }
    
    public void setContadorTiempo(int contadorTiempo){
        contadorTiempo = contadorTiempo;
    }
    
    public static int calRecFactorial(int n){
        int fact = 0;
        contadorTiempo = 0;
        if(n==0){
            fact = 1;
        }
        else{
            fact = n*calRecFactorial(n-1);
        }
        contadorTiempo++;
        return fact;
    }
}
