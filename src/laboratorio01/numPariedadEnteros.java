/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio01;

/**
 *
 * @author Rodrigo QP
 */
public class numPariedadEnteros {
    //Objeto
    private static int contadorTiempo;
    //Metodo getter
    public static int getContadorTiempo() {
        return contadorTiempo;
    }
    //Metodo de paridad
    public static boolean esPar(int n){
        contadorTiempo = 0;
        int resto = n;
        while (resto > 1){
            resto = resto -2;
            contadorTiempo++;
        }
        if (resto == 0){
            return true; 
        }          
        else{
            return false;        
        }
    }

}
