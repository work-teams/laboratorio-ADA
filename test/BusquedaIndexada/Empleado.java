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
public class Empleado {
    private int codigoDelEmpleado;
private String nombreDelEmpleado;
private float sueldoDelEmpleado;
private int indiceDelEmpleado;
public Empleado(int codigo, String nombre, float sueldo, int indice) {
codigoDelEmpleado = codigo;
nombreDelEmpleado = nombre;
sueldoDelEmpleado = sueldo;
indiceDelEmpleado = indice;
}

    public int getIndiceDelEmpleado() {
        return indiceDelEmpleado;
    }

    public void setIndiceDelEmpleado(int indiceDelEmpleado) {
        this.indiceDelEmpleado = indiceDelEmpleado;
    }


public void setCodigoDelEmpleado(int codigo)
{
codigoDelEmpleado = codigo;
}
public int getCodigoDelEmpleado()
{
return codigoDelEmpleado;
}
public void setNombreDelEmpleado(String nombre)
{
nombreDelEmpleado = nombre;
}
public String getNombreDelEmpleado()
{
    return nombreDelEmpleado;
}
public void setSueldoDelEmpleado(float sueldo)
{
sueldoDelEmpleado = sueldo;
}
public float getSueldoDelEmpleado()
{
return sueldoDelEmpleado;
} 
}
