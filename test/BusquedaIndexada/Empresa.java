/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusquedaIndexada;

/**
 *
 * @author Rodrigo QP
 */
public class Empresa {
    private BusquedaIndexada.Empleado empleados[];
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
        int indices[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
            11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        
        empleados = new BusquedaIndexada.Empleado[NUMERO_EMPLEADOS];
        for (int i = 0; i < empleados.length; i++) {
            empleados[i] = new BusquedaIndexada.Empleado(codigos[i], nombres[i], sueldos[i],indices[i]);
        }
    }

     public int getIndiceDelEmpleado(int i) {
        return empleados[i].getIndiceDelEmpleado();
    }

    public void setIndiceDelEmpleado(int indice, int i) {
        //empleados[i].setCodigoDelEmpleado(indice);
        empleados[i].setIndiceDelEmpleado(indice);
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

    public void BIndexada(int m,BusquedaIndexada.Empresa x){
        comparaciones = 0;
        boolean s=false;
        int i=0;
        while( i < x.getNumeroDeEmpleados()&& !s ){
           // for(int i = 0; i < x.getNumeroDeEmpleados(); i++){
            
             if(m==x.getIndiceDelEmpleado(i)){
               System.out.printf("%10d%10s%10.2f\n",
                    x.getCodigoDelEmpleado(i),
                    x.getNombreDelEmpleado(i),
                    x.getSueldoDelEmpleado(i));
               s=true;
             }
              i++;
              comparaciones++;      
        }
        
    }   
}
