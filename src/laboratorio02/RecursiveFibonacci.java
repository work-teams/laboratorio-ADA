/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio02;

/**
 *
 * @author krypt97
 */
public class RecursiveFibonacci {
    private static int contadorTiempo;
    
    public static int calculaRecursiveFibonacci(int n) {
        int enesimoTermino;
        
        if (n < 3) {
            enesimoTermino = 1;
        }
        else {
            enesimoTermino = calculaRecursiveFibonacci(n-1) + calculaRecursiveFibonacci(n-2);
        }
        contadorTiempo++;
        
        return enesimoTermino;
    }

    public static int getContadorTiempo() {
        return contadorTiempo;
    }
    
}
