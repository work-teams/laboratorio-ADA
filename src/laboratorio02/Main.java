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
        int n;
        
         //Probando RecursivoFactorial
        System.out.println("Probando Factorial recursivo");
        System.out.println("-------------------------");
        System.out.println("Ingrese un numero entero positivo: ");
        n = in.nextInt();
        System.out.println("Factorial de " + n + ": " + RecursivoFactorial.calRecFactorial(n));
        System.out.println("Tiempo de ejecución: "+ RecursivoFactorial.getContadorTiempo());
        
        
        //MCD de un número usando el algoritmo de Euclides
        System.out.println("==================================================");
        System.out.println("Recursividad: MCD de dos numeros");
        System.out.println("--------------------------------------------------");
        int numero_1, numero_2;
        
        do{
            System.out.println("Introduzca el primer numero: ");
            numero_1 = in.nextInt();
        }while(numero_1 <= 0);
        do{
            System.out.println("Introduzca el segundo numero: ");
            numero_2 = in.nextInt();
        }while(numero_2 <= 0);
        
        System.out.println("El MCD de dos numeros es: " + Recursividad_MCD.maximoComunDivisor(numero_1,numero_2));
        System.out.println("Tiempo de ejecución: " + Recursividad_MCD.getContadorTiempo());
        

        // Probando recursive fibonacci
        System.out.println("==============================");
        System.out.println("Probando recursive fibonacci");
        System.out.println("------------------------------");
        int termino;
        
        System.out.println("Recursive Fibonacci");
        System.out.print("Ingresa termino a calcular: ");
        termino = in.nextInt();
        
        System.out.println("El termino " + termino + " es, " + RecursiveFibonacci.calculaRecursiveFibonacci(termino));
        System.out.println("Tiempo de ejecución: " + RecursiveFibonacci.getContadorTiempo());
        
    }
    
}
