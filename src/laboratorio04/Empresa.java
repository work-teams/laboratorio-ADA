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
public class Empresa {

    // Crea arreglos de empleado de 20 elementos.
    public Empleado[] arregloEmpleadosDesordenado = new Empleado[20];
    public Empleado[] arregloEmpleadosOrdenado = new Empleado[20];

    // Datos a ingresar en los arreglos.
    int codigosDesordenados[] = {204, 305, 105, 205, 415, 106, 500, 100, 540, 420, 101, 215, 340, 180, 600, 312, 147, 165, 510, 601};
    String nombresDesordenados[] = {"Juan", "Ana", "Rosa", "Carlos", "Raúl", "Pedro", "Rosario", "Martha", "Saúl", "Karen", "Rosa", "Francis", "Ricardo", "Luis", "Dámaris", "Diana", "Pablo", "Marcelo", "Carolina", "Ingrid"};
    float sueldosDesordenados[] = {1500, 800, 2000, 550, 1200, 3500, 1800, 900, 750, 4000, 750, 1500, 1200, 3500, 4000, 1800, 950, 1400, 600, 5500};

    int codigosOrdenados[] = {100, 101, 105, 106, 147, 165, 180, 204, 205, 215, 305, 312, 340, 415, 420, 500, 510, 540, 600, 601};
    String nombresOrdenados[] = {"Martha", "Rosa", "Rosa", "Pedro", "Pablo", "Marcelo", "Luis", "Juan", "Carlos", "Fracis", "Ana", "Diana", "Ricardo", "Raul", "Karen", "Rosario", "Carolina", "Saul", "Damaris", "Ingrid"};
    float sueldosOrdenados[] = {900, 750, 2000, 3500, 950, 1400, 3500, 1500, 550, 1500, 800, 1800, 1200, 1200, 4000, 1800, 600, 750, 4000, 5500};

    // Constructor
    public Empresa() {
        creaArregloEmpleadosDesordenados();
        creaArregloEmpleadosOrdenados();
    }

    // Llena el arreglo de arregloEmpleadosDesordenado.
    private void creaArregloEmpleadosDesordenados() {
        Empleado empleado;
        for (int i = 0; i < 20; i++) {
            empleado = new Empleado(codigosDesordenados[i], nombresDesordenados[i], sueldosDesordenados[i]);
            arregloEmpleadosDesordenado[i] = empleado;
        }
    }

    // Llena el arreglo de arregloEmpleadosOrdenado.
    private void creaArregloEmpleadosOrdenados() {
        Empleado empleado;
        for (int i = 0; i < 20; i++) {
            empleado = new Empleado(codigosOrdenados[i], nombresOrdenados[i], sueldosOrdenados[i]);
            arregloEmpleadosOrdenado[i] = empleado;
        }
    }

    // Imprime datos del arreglo de arregloEmpleadosDesordenado.
    public String ImprimeDatoDeArregloDesordenado(int pos) {
        if (pos != -1) {
            return arregloEmpleadosDesordenado[pos].toString();
        }
        else {
            return "No existe";
        }
    }

    // Imprime datos del arreglo de arregloEmpleadosOrdenado.
    public String ImprimeDatoDeArregloOrdenado(int pos) {
        if (pos != -1) {
            return arregloEmpleadosOrdenado[pos].toString();
        }
        else {
            return "No existe";
        }
    }

}
