/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio04;

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
        
        // Instancia objeto empresa y crea arreglos.
        Empresa miEmpresa = new Empresa();
        
        //Ejercicio 01
        // Busqueda secuencial con arreglo desordenado.
        System.out.println("===========================================");
        System.out.println("Busqueda secuencial con arreglo desordenado");
        System.out.println("-------------------------------------------");
        System.out.print("Ingrese valor a buscar: ");
        
        int valor1 = in.nextInt();
        int pos1 = BusquedaSecuencialAD.buscar(miEmpresa, valor1);
        
        System.out.println(miEmpresa.ImprimeDatoDeArregloDesordenado(pos1));
        System.out.println("Tiempo de ejecución: " + BusquedaSecuencialAD.getContador());

        
        //Ejercicio 02
        // Busqueda secuencial con arreglo ordenado.
        System.out.println("========================================");
        System.out.println("Busqueda secuencial con arreglo ordenado");
        System.out.println("----------------------------------------");
        System.out.print("Ingrese valor a buscar: ");
        
        int valor2 = in.nextInt();
        int pos2 = BusquedaSecuencialAO.buscar(miEmpresa, valor2);
        
        System.out.println(miEmpresa.ImprimeDatoDeArregloOrdenado(pos2));
        System.out.println("Tiempo de ejecución: " + BusquedaSecuencialAO.getContador());
        
        //Ejercicio 03
        System.out.println("========================================");
        System.out.println("Busqueda binaria");
        System.out.println("----------------------------------------");
        System.out.print("Ingrese valor a buscar: ");
        
        int valor3 = in.nextInt();
        int pos3 = BusquedaBinaria.buscar(miEmpresa, valor3);
        
        System.out.println(miEmpresa.ImprimeDatoDeArregloDesordenado(pos3));
        System.out.println("Tiempo de ejecución: " + BusquedaBinaria.getContador());
        
        //Ejercicio 
        System.out.println("========================================");
        System.out.println("Busqueda Secuencia por Bloques");
        System.out.println("----------------------------------------");
        System.out.print("Ingrese valor a buscar: ");
        int valor4 = in.nextInt();
        int pos4 = BusquedaSecuencialBloques.buscar(miEmpresa, valor4);
        
        System.out.println(miEmpresa.ImprimeDatoDeArregloDesordenado(pos4));
        System.out.println("Tiempo de ejecución: " + BusquedaSecuencialBloques.getContador());

        //Ejercicio 
        System.out.println("========================================");
        System.out.println("Busqueda Secuencia por Indexada");
        System.out.println("----------------------------------------");
        System.out.print("Ingrese valor a buscar: ");
        int valor5 = in.nextInt();
        int pos5 = BusquedaIndexada.buscar(miEmpresa, valor5);
        
        System.out.println(miEmpresa.ImprimeDatoDeArregloDesordenado(pos5));
        System.out.println("Tiempo de ejecución: " + BusquedaIndexada.getContador());
    }
    
}
