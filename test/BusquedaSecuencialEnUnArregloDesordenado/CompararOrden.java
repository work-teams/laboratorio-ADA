/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusquedaSecuencialEnUnArregloDesordenado;

import java.util.Scanner;

/**
 *
 * @author Rodrigo QP
 */
public class CompararOrden {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Empresa miEmpresa5 = new Empresa();
        System.out.println("\nMetodo de Busqueda Secuencial Desordenado");
        int opc;
        do {
            System.out.println("\nIngrese Código del Empleado a buscar: ");
            int c = sc.nextInt();
            int p = miEmpresa5.busquedaSecuencialDesordenada(c);
            if (p >= 0) {
                System.out.println("--------Código-----------");
                System.out.println(miEmpresa5.getCodigoDelEmpleado(p));
                System.out.println("--------Nombre-----------");
                System.out.println(miEmpresa5.getNombreDelEmpleado(p));
                System.out.println("--------Sueldo-----------");
                System.out.println(miEmpresa5.getSueldoDelEmpleado(p));
                System.out.println("--------Comparaciones Realizadas-----------");
                System.out.println(miEmpresa5.getComparaciones());
            } else {
                System.out.println("No encontrado");
            }
            System.out.printf("Numero de comparaciones: %d\n",
                    miEmpresa5.getComparaciones());

            System.out.println("\nDesea Continuar? si=1,no=0:  ");
            int o = sc.nextInt();
            opc = o;
        } while (opc == 1);

        /*System.out.println("\nMetodo de la Burbuja");
System.out.println("--------------------------------");
miEmpresa1.OrdenBurbuja();
for (int i = 0; i < miEmpresa1.getNumeroDeEmpleados(); i++)
{
System.out.printf("%10d%10s%10.2f\n",
miEmpresa1.getCodigoDelEmpleado(i),
miEmpresa1.getNombreDelEmpleado(i),
miEmpresa1.getSueldoDelEmpleado(i));
}
System.out.printf("Numero de comparaciones: %d\n",
miEmpresa1.getComparaciones());
System.out.printf("Numero de intercambios: %d\n",
miEmpresa1.getIntercambios());

System.out.println("\nMetodo Insercion Directa");
System.out.println("--------------------------");
miEmpresa2.OrdenInsercionDirecta();
System.out.println();
for (int i = 0; i < miEmpresa2.getNumeroDeEmpleados(); i++)
{
System.out.printf("%10d%10s%10.2f\n",
miEmpresa2.getCodigoDelEmpleado(i),
miEmpresa2.getNombreDelEmpleado(i),
miEmpresa2.getSueldoDelEmpleado(i));
}
System.out.printf("Numero de comparaciones: %d\n",
miEmpresa2.getComparaciones());
System.out.printf("Numero de intercambios: %d\n",
miEmpresa2.getIntercambios());

System.out.println("\nMetodo QUICKSORT");
System.out.println("--------------------------------");

miEmpresa4.QuickSort(0,19);
for (int i = 0; i < miEmpresa4.getNumeroDeEmpleados(); i++)
{
System.out.printf("%10d%10s%10.2f\n",
miEmpresa4.getCodigoDelEmpleado(i),
miEmpresa4.getNombreDelEmpleado(i),
miEmpresa4.getSueldoDelEmpleado(i));
}
System.out.printf("Numero de comparaciones: %d\n",
miEmpresa4.getComparaciones1());
System.out.printf("Numero de intercambios: %d\n",
miEmpresa4.getIntercambios1());*/
    }

}
