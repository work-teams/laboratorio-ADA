/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio04;

/**
 *
 * @author Rodrigo QP
 */
public class BusquedaIndexada {
    
    private static int contador = 0;
    
    public static int buscar(Empresa miEmpresa, int valor) {
        int i = 0;
        int index = 0;
        System.out.println(miEmpresa.arregloEmpleadosDesordenado.length);
        for (i = 0; i < miEmpresa.arregloEmpleadosDesordenado.length; i += 1) {
            if(miEmpresa.arregloEmpleadosDesordenado[i].getCodigo()==valor){
                index = i;
            }
        }
        return index;
    }
    
    public static int getContador() {
        return contador + 1;
    }

}

