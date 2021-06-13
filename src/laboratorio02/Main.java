/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio02;

import java.util.Scanner;

/**
 *
 * @author krypt97
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        int termino;
        
        // Probando recursive fibonacci
        System.out.println("Recursive Fibonacci");
        System.out.print("Ingresa termino a calcular: ");
        termino = in.nextInt();
        
        System.out.println("El termino " + termino + " es, " + RecursiveFibonacci.calculaRecursiveFibonacci(termino));
        System.out.println("Tiempo de ejecución: " + RecursiveFibonacci.getContadorTiempo());
    }
    
}
