/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio04;

/**
 *
 * @author krypt97
 */
public class BusquedaSecuencialAO {
    
    private static int contador = 0;
    
    public static int buscar(Empresa miEmpresa, int valor) {
        int i = 0;
        int pos = -1;
        boolean encontrado = false;
        
        while (i <= miEmpresa.arregloEmpleadosOrdenado.length-1 && encontrado == false && miEmpresa.arregloEmpleadosOrdenado[i].getCodigo() <= valor) {
            if (miEmpresa.arregloEmpleadosOrdenado[i].getCodigo() == valor) {
                pos = i;
                encontrado = true;
            }
            i = i + 1;
            
            contador++;
        }
        return pos;
    }

    public static int getContador() {
        return contador;
    }
    
}
