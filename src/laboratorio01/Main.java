/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio01;

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
        
        Scanner in = new Scanner(System.in);
        
        int sizeVector;
        int[] vector;
        int valor;
        
        //Probando busqueda secuencial
        System.out.println("Probando busqueda secuencial");
        System.out.print("Ingrese tamaño vector: ");
        sizeVector = in.nextInt();
        vector = new int[sizeVector];
        BusquedaSecuencialVector.setRellenarVector(vector); //Rellena con valores desde el 1 hasta el tamaño del vector
        
        System.out.print("Ingrese valor a buscar: ");
        valor = in.nextInt();
        
        System.out.println("Encontrado, "+ BusquedaSecuencialVector.buscar(vector, valor));
        System.out.println("Tiempo de ejecución: " + BusquedaSecuencialVector.getContadorTiempo());
        
     
        //Probando paridad
        int numero;
        System.out.println("====================================");
        System.out.println("Paridad de un número entero positivo");
        System.out.println("------------------------------------");
        System.out.print("Ingrese un numero entero positivo: ");
        numero = in.nextInt();
        if (numPariedadEnteros.esPar(numero)){ //return True
            System.out.println(numero +" es par");        
        }
        else{
            System.out.println(numero +" es impar");        
        }
        System.out.println("Tiempo de ejecución: "+ numPariedadEnteros.getContadorTiempo());
    }
    
}
