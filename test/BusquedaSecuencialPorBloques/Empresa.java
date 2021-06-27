/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusquedaSecuencialPorBloques;

/**
 *
 * @author Rodrigo QP
 */
public class Empresa {

    private Empleado empleados[];
    private final int NUMERO_EMPLEADOS = 20;
    private int intercambios = 0;
    private int comparaciones = 0;

    public Empresa() {
        int codigos[] = {204, 305, 105, 204, 415, 106, 500, 100, 540, 420,
            100, 215, 340, 180, 600, 312, 147, 165, 510, 601};
        String nombres[] = {"Juan", "Ana", "Rosa", "Carlos", "Raúl",
            "Pedro", "Rosario", "Martha", "Saúl", "Karen", "Rosa", "Francis", "Ricardo", "Luis", "Dámaris", "Diana", "Pablo", "Marcelo", "Carolina", "Ingrid"};
        float sueldos[] = {1500, 800, 2000, 550, 1200, 3500, 1800, 900, 750, 4000,
            750, 1500, 1200, 3500, 4000, 1800, 950, 1400, 600, 5500};
        empleados = new Empleado[NUMERO_EMPLEADOS];
        for (int i = 0; i < empleados.length; i++) {
            empleados[i] = new Empleado(codigos[i], nombres[i], sueldos[i]);
        }
    }

    public int getCodigoDelEmpleado(int i) {
        return empleados[i].getCodigoDelEmpleado();
    }

    public void setCodigoDelEmpleado(int codigo, int i) {
        empleados[i].setCodigoDelEmpleado(codigo);
    }

    public String getNombreDelEmpleado(int i) {
        return empleados[i].getNombreDelEmpleado();
    }

    public void setNombreDelEmpleado(String nombre, int i) {
        empleados[i].setNombreDelEmpleado(nombre);
    }

    public float getSueldoDelEmpleado(int i) {
        return empleados[i].getSueldoDelEmpleado();
    }

    public void setSueldoDelEmpleado(float sueldo, int i) {
        empleados[i].setSueldoDelEmpleado(sueldo);
    }

    public int getNumeroDeEmpleados() {
        return NUMERO_EMPLEADOS;
    }

    public int getIntercambios() {
        return intercambios;
    }

    public int getComparaciones() {
        return comparaciones;
    }

    /*public void OrdenBurbuja() {
        Empleado temp = new Empleado(0, "", 0);
     //   comparaciones = 0;
     //   intercambios = 0;
        for (int i = 1; i < empleados.length; i++) {
            for (int j = empleados.length - 1; j >= i; j--) {
              //  comparaciones++;
                if (empleados[j - 1].getCodigoDelEmpleado() > empleados[j].getCodigoDelEmpleado()) {
                    temp.setCodigoDelEmpleado(empleados[j - 1].getCodigoDelEmpleado());
                    empleados[j - 1].setCodigoDelEmpleado(empleados[j].getCodigoDelEmpleado());
                    empleados[j].setCodigoDelEmpleado(temp.getCodigoDelEmpleado());
                    temp.setNombreDelEmpleado(empleados[j - 1].getNombreDelEmpleado());
                    empleados[j - 1].setNombreDelEmpleado(empleados[j].getNombreDelEmpleado());
                    empleados[j].setNombreDelEmpleado(temp.getNombreDelEmpleado());
                    temp.setSueldoDelEmpleado(empleados[j - 1].getSueldoDelEmpleado());
                    empleados[j - 1].setSueldoDelEmpleado(empleados[j].getSueldoDelEmpleado());
                    empleados[j].setSueldoDelEmpleado(temp.getSueldoDelEmpleado());
                  //  intercambios++;
                }
            }
        }
    }*/

    public void OrdenInsercionDirecta() {
        Empleado temp = new Empleado(0, "", 0);
      //  comparaciones = 0;
     //   intercambios = 0;
        int k;
        for (int i = 1; i < empleados.length; i++) {
          //  comparaciones++;
            temp.setCodigoDelEmpleado(empleados[i].getCodigoDelEmpleado());
            temp.setNombreDelEmpleado(empleados[i].getNombreDelEmpleado());
            temp.setSueldoDelEmpleado(empleados[i].getSueldoDelEmpleado());
            k = i - 1;
            while (k >= 0 && temp.getCodigoDelEmpleado() < empleados[k].getCodigoDelEmpleado()) {
                empleados[k + 1].setCodigoDelEmpleado(empleados[k].getCodigoDelEmpleado());
                empleados[k + 1].setNombreDelEmpleado(empleados[k].getNombreDelEmpleado());
                empleados[k + 1].setSueldoDelEmpleado(empleados[k].getSueldoDelEmpleado());
                k--;
               // intercambios++;
            }
            empleados[k + 1].setCodigoDelEmpleado(temp.getCodigoDelEmpleado());
            empleados[k + 1].setNombreDelEmpleado(temp.getNombreDelEmpleado());
            empleados[k + 1].setSueldoDelEmpleado(temp.getSueldoDelEmpleado());
        }
    }

    int busquedaSecuencialPorBloques(int valor) {

        int k, n, m, ini, fin, i;

        comparaciones = 0;
        //  comparaciones1 = 0;
        n = empleados.length;
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
        while (i <= m && empleados[fin].getCodigoDelEmpleado() <= valor) {
            comparaciones++;
            // setComparaciones(getComparaciones() + 1);
            if (valor == empleados[fin].getCodigoDelEmpleado()) {
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
        comparaciones=comparaciones+1;
        int j = ini;
        while (j <= fin - 1 && empleados[j].getCodigoDelEmpleado() <= valor) { //Busca desde el inicio hasta el penultimo de cada bloque
            // comparaciones1++;
            // setComparaciones(getComparaciones() + 1);
            comparaciones++;
            if (valor == empleados[j].getCodigoDelEmpleado()) {
                return j;

            }
            j = j + 1;
           // comparaciones++;
            // comparaciones++;
            // setComparaciones(getComparaciones() + 1);
        }
        return -1; //Si no se encontro
    }
}

