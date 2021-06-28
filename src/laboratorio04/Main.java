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
        
        // Busqueda secuencial con arreglo ordenado.
        System.out.println("Busqueda secuencial con arreglo ordenado");
        System.out.println("----------------------------------------");
        System.out.print("Ingrese valor a buscar: ");
        
        int valor = in.nextInt();
        int pos = BusquedaSecuencialAO.buscar(miEmpresa, valor);
        
        System.out.println(miEmpresa.ImprimeDatoDeArregloOrdenado(pos));
        System.out.println("Tiempo de ejecución: " + BusquedaSecuencialAO.getContador());
        
    }
    
}
