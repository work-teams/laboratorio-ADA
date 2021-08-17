/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio09;

/**
 *
 * @author Rodrigo QP
 */

public class PruebaBacktracking {

    public static void main(String[] args) {
        int valores[] = {12, 23, 1, 8, 33, 7, 22};
        int suma = 20;

        Backtracking sumaDada = new Backtracking(valores, suma);
        sumaDada.hallarSubconjunto();
        sumaDada.mostrarSolucion(); 
    }
}
/*Modifica la aplicación para que muestre todas las soluciones que sumen
exactamente un valor dado y un mensaje en caso no encuentre ningún subconjunto.*/
