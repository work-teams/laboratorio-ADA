/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusquedaIndexada;

import java.util.Scanner;

/**
 *
 * @author Rodrigo QP
 */
public class Buscar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
     
        BusquedaIndexada.Empresa miEmpresa = new BusquedaIndexada.Empresa();
         System.out.println("\nBusqueda Indexada");
          System.out.println("--------------------------");
          System.out.println("Ingrese el orden del índice");
         int m=entrada.nextInt();
         miEmpresa.BIndexada(m, miEmpresa);
         int y=miEmpresa.getComparaciones();
         System.out.println("El número de comparaciones es:"+y);
        
         } 
}

