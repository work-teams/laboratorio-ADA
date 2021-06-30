/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio04;

/**
 *
 * @author Usuario
 */
public class BusquedaBinaria {
    
    private static int contador = 0;
    
    public static int buscar(Empresa miEmpresa, int valor) {
        
        int ini = 0;
        int fin = miEmpresa.arregloEmpleadosOrdenado.length - 1;
        int medio;
   
        while (ini <= fin) {
            
            
            medio = (ini + fin) / 2;
            if (valor == miEmpresa.arregloEmpleadosOrdenado[medio].getCodigo()) {
                return medio;
            } else {
                if (valor < miEmpresa.arregloEmpleadosOrdenado[medio].getCodigo()) {
                    fin = medio - 1;
                } 
                else {
                    ini = medio + 1;
                }
            }
            
            contador++;
            
        }
        return -1;
    }

    public static int getContador() {
        return contador + 1;
    }
    
}
