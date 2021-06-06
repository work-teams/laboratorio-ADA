/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio01;

/**
 *
 * @author krypt97
 */
public class BusquedaSecuencialVector {
    
    private static int contadorTiempo;
    
    public static boolean buscar(int[] vector, int valor) {
        contadorTiempo = 0;
        boolean encontrado = false;
        
        //Utiliza contadorTiempo tambien como indice, para recorrer el vector.
        while (contadorTiempo < vector.length && encontrado == false) {
            if (vector[contadorTiempo] == valor) {
                encontrado = true;
            }
            contadorTiempo++;
        }
        
        return encontrado;
    }

    public static int getContadorTiempo() {
        return contadorTiempo;
    }
    
    //Rellena el vector desde 1 hasta el tamaño máximo de este.
    public static void setRellenarVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = i + 1;
        }
        
        System.out.println("*Vector rellenado desde el 1 al " + vector.length);
    }
    
}
