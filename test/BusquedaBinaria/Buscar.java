/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusquedaBinaria;

import java.util.Scanner;

/**
 *
 * @author Rodrigo QP
 */
public class Buscar {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        Empresa miEmpresa1 = new Empresa();
        System.out.println("\nMetodo de Busqueda Binaria");    
        int opc;
        do{
        System.out.println("\nIngrese Código del Empleado a buscar: ");
        int c = sc.nextInt();
        miEmpresa1.QuickSort(0, 19);
        int p=miEmpresa1.BusquedaBinariaIterativa(c);
        if(p>=0){
            System.out.println("--------Código-----------");
            System.out.println(miEmpresa1.getCodigoDelEmpleado(p));
            System.out.println("--------Nombre-----------");
            System.out.println(miEmpresa1.getNombreDelEmpleado(p));
            System.out.println("--------Sueldo-----------");
            System.out.println(miEmpresa1.getSueldoDelEmpleado(p));
            System.out.println("--------Comparaciones Realizadas-----------");
            System.out.println(miEmpresa1.getComparaciones());
        }
        else{
            System.out.println("No encontrado");
        }
        System.out.println("\nDesea Continuar? si=1,no=0:  ");
        int o = sc.nextInt();
        opc=o;}
        while(opc == 1); 
    }
}