/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusquedaSecuencialPorBloques;

import java.util.Scanner;

/**
 *
 * @author Rodrigo QP
 */
public class BusquedaSecuencialPorBloques {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
     
        Empresa miEmpresa3 = new Empresa();
   
        System.out.println("\nMetodo Insercion Directa");
        System.out.println("--------------------------");
        miEmpresa3.OrdenInsercionDirecta();
        System.out.println();
        for (int i = 0; i < miEmpresa3.getNumeroDeEmpleados(); i++) {
            System.out.printf("%10d%10s%10.2f\n",
                    miEmpresa3.getCodigoDelEmpleado(i),
                    miEmpresa3.getNombreDelEmpleado(i),
                    miEmpresa3.getSueldoDelEmpleado(i));
        }
    
      
        System.out.println("\nMETODO DE BUSQUEDA SECUENCIAL POR BLOQUES\n");
        System.out.println("Ingrese el codigo del empleado :");
        int cod = entrada.nextInt();
        int pos = miEmpresa3.busquedaSecuencialPorBloques(cod);

        if (pos == -1) {
            System.out.println("Codigo no encontrado");
        } else {
            System.out.println("\n--------------------------------");
            System.out.printf("%10d%10s%10.2f\n",
                    miEmpresa3.getCodigoDelEmpleado(pos),
                    miEmpresa3.getNombreDelEmpleado(pos),
                    miEmpresa3.getSueldoDelEmpleado(pos));
            System.out.println("--------------------------------\n");
        }

        System.out.printf("Numero de comparaciones: %d\n",
                miEmpresa3.getComparaciones());
    }
}
