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
public class BusquedaSecuencialBloques {
    
    private static int contador = 0;
    
    public static int buscar(Empresa miEmpresa, int valor) {
        int k, n, m, ini, fin, i;
        //  comparaciones1 = 0;
        n = miEmpresa.arregloEmpleadosOrdenado.length;
        //k: tamaño del bloque
        k = (int) Math.sqrt(n);
        //ini: posición del primer bloque
        ini = 0;
        //fin: posición final del primer bloque
        fin = k - 1;
        i = 1;
        //m : numero de bloques
        if (n % k == 0) {
            m = n / k;
        } else {
            m = n / (k + 1);
        }
        // int comparaciones = 0;
        // Busqueda al final de cada bloque
        // while(){
            
        // }
        while (i <= m && miEmpresa.arregloEmpleadosOrdenado[fin].getCodigo() <= valor) {
            contador++;
            // setComparaciones(getComparaciones() + 1);
            if (valor == miEmpresa.arregloEmpleadosOrdenado[fin].getCodigo()) {
                return fin;

            }
            i = i + 1;
            // setComparaciones(getComparaciones() + 1);
            ini = ini + k; // inicio del siguiente bloque
            fin = fin + k; // final del siguiente bloque
            //setComparaciones(getComparaciones() + 1);
            if (fin > n - 1) { //si el tamaño del ultimo bloque es diferente de k
                fin = n - 1;
            }
            //
            // setComparaciones(getComparaciones() + 1);
        }
       //Busqueda en cada bloque
        contador=contador+1;
        int j = ini;
        while (j <= fin - 1 && miEmpresa.arregloEmpleadosOrdenado[j].getCodigo() <= valor) { //Busca desde el inicio hasta el penultimo de cada bloque
            // comparaciones1++;
            // setComparaciones(getComparaciones() + 1);
            contador++;
            if (valor == miEmpresa.arregloEmpleadosOrdenado[j].getCodigo()) {
                return j;

            }
            j = j + 1;
           // comparaciones++;
            // comparaciones++;
            // setComparaciones(getComparaciones() + 1);
        }
        return -1; //Si no se encontro
    }
    public static int getContador() {
        return contador;
    }
}
