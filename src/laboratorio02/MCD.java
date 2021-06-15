/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio02;

/**
 *
 * @author Rodrigo QP
 */
public class MCD {
    
    private static int contadorTiempo;
    
    public static int maximoComunDivisor(int numero_Mayor, int numero_Menor){
        
        int num_1=numero_Mayor;
        int num_2=numero_Menor;
        int mcd;
        
        if(num_1 == num_2){
            mcd = num_1;
        }
        else if(num_1>num_2){
            mcd = maximoComunDivisor(num_1- num_2, num_2);
        } 
        else{
            mcd = maximoComunDivisor(num_1, num_2 - num_1);
        }
        contadorTiempo++;
        return mcd;
    }
    
    public static int getContadorTiempo() {
        return contadorTiempo;
    }
    
    
}
