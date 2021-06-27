/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusquedaSecuencialEnUnArregloDesordenado;

/**
 *
 * @author Rodrigo QP
 */
public class Empresa {

    private Empleado empleados[];
    private final int NUMERO_EMPLEADOS = 20;
    //private int intercambios = 0;
    private int comparaciones = 0;

    /*private int intercambios1 = 0;
private int comparaciones1 = 0;*/
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

    /*public int getIntercambios() {
        return intercambios;
    }*/

    public int getComparaciones() {
        return comparaciones;
    }

    /*
public int getIntercambios1()
{
return intercambios1;
}
public int getComparaciones1()
{
return comparaciones1;
}*/

 /*public void OrdenBurbuja()
{
Empleado temp = new Empleado(0,"",0);
comparaciones = 0;
intercambios = 0;
for (int i = 1; i< empleados.length; i++ )
for (int j = empleados.length-1 ; j >= i; j--)
{
comparaciones++;
if(empleados[j-1].getCodigoDelEmpleado() > empleados[j].getCodigoDelEmpleado())
{
temp.setCodigoDelEmpleado(empleados[j-1].getCodigoDelEmpleado());
empleados[j-1].setCodigoDelEmpleado (empleados[j].getCodigoDelEmpleado());
empleados[j].setCodigoDelEmpleado(temp.getCodigoDelEmpleado());
temp.setNombreDelEmpleado(empleados[j-1].getNombreDelEmpleado());
empleados[j-1].setNombreDelEmpleado(empleados[j].getNombreDelEmpleado());
empleados[j].setNombreDelEmpleado(temp.getNombreDelEmpleado());
temp.setSueldoDelEmpleado(empleados[j-1].getSueldoDelEmpleado());
empleados[j-1].setSueldoDelEmpleado(empleados[j].getSueldoDelEmpleado());
empleados[j].setSueldoDelEmpleado(temp.getSueldoDelEmpleado());
intercambios++;
}
}
}
public void OrdenInsercionDirecta()
{
Empleado temp = new Empleado(0,"",0);
comparaciones = 0;
intercambios = 0;
int k;
for (int i = 1; i < empleados.length; i++)
{
comparaciones++;
temp.setCodigoDelEmpleado(empleados[i].getCodigoDelEmpleado());
temp.setNombreDelEmpleado(empleados[i].getNombreDelEmpleado());
temp.setSueldoDelEmpleado(empleados[i].getSueldoDelEmpleado());
k = i - 1;
while ( k >= 0 && temp.getCodigoDelEmpleado()<empleados[k].getCodigoDelEmpleado())
{
empleados[k+1].setCodigoDelEmpleado(empleados[k].getCodigoDelEmpleado());
empleados[k+1].setNombreDelEmpleado(empleados[k].getNombreDelEmpleado());
empleados[k+1].setSueldoDelEmpleado(empleados[k].getSueldoDelEmpleado());
k--;
intercambios++;
}
empleados[k+1].setCodigoDelEmpleado(temp.getCodigoDelEmpleado());
empleados[k+1].setNombreDelEmpleado(temp.getNombreDelEmpleado());
empleados[k+1].setSueldoDelEmpleado(temp.getSueldoDelEmpleado());
}
}

public void QuickSort(int ini, int fin){
Empleado temp = new Empleado(0,"",0);

int izq=ini;         // i realiza la búsqueda de izquierda a derecha
int der=fin;         // j realiza la búsqueda de derecha a izquierda  (9,10,5,6,12,32,6,9)
int pos=ini;


boolean flag = true;
    while(flag){   
        flag=false;
        comparaciones1++;
        while((empleados[pos].getCodigoDelEmpleado()<=empleados[der].getCodigoDelEmpleado()) && (pos!=der))
        {der--;}
        if(pos!=der){
         comparaciones1++; 
         temp.setCodigoDelEmpleado(empleados[pos].getCodigoDelEmpleado());
         empleados[pos].setCodigoDelEmpleado (empleados[der].getCodigoDelEmpleado());
         empleados[der].setCodigoDelEmpleado(temp.getCodigoDelEmpleado());
         temp.setNombreDelEmpleado(empleados[pos].getNombreDelEmpleado());
         empleados[pos].setNombreDelEmpleado(empleados[der].getNombreDelEmpleado());
         empleados[der].setNombreDelEmpleado(temp.getNombreDelEmpleado());
         temp.setSueldoDelEmpleado(empleados[pos].getSueldoDelEmpleado());
         empleados[pos].setSueldoDelEmpleado(empleados[der].getSueldoDelEmpleado());
         empleados[der].setSueldoDelEmpleado(temp.getSueldoDelEmpleado());
         pos=der;intercambios1++;
         while(empleados[pos].getCodigoDelEmpleado()>=empleados[izq].getCodigoDelEmpleado()&& pos!=izq){
                izq++;
         }
         if(pos!=izq){
            comparaciones++; 
            temp.setCodigoDelEmpleado(empleados[pos].getCodigoDelEmpleado());
            empleados[pos].setCodigoDelEmpleado (empleados[izq].getCodigoDelEmpleado());
            empleados[izq].setCodigoDelEmpleado(temp.getCodigoDelEmpleado());
            temp.setNombreDelEmpleado(empleados[pos].getNombreDelEmpleado());
            empleados[pos].setNombreDelEmpleado(empleados[izq].getNombreDelEmpleado());
            empleados[izq].setNombreDelEmpleado(temp.getNombreDelEmpleado());
            temp.setSueldoDelEmpleado(empleados[pos].getSueldoDelEmpleado());
            empleados[pos].setSueldoDelEmpleado(empleados[izq].getSueldoDelEmpleado());
            empleados[izq].setSueldoDelEmpleado(temp.getSueldoDelEmpleado());
            pos=izq;intercambios1++;
            flag=true;
         }
        }
    }
    comparaciones1++;
    if(pos>ini){
         
        QuickSort(ini,pos-1);
    } comparaciones1++; 
    if(fin>pos){
        
        QuickSort(pos+1,fin);
    }
    

}*/
    public int busquedaSecuencialDesordenada(int valor) {
        Empleado temp = new Empleado(0, "", 0);
       
        comparaciones = 0;
        int i = 0;
        int pos = -1;
        boolean enc = false;
        
 
        while ((i <= empleados.length - 1) && (enc == false)) {
   
            if (empleados[i].getCodigoDelEmpleado() == valor) {
                pos = i;
                enc = true;
            }
            i++;
            comparaciones++;
        }

        return pos;
    }
}
