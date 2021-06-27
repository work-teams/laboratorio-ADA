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
public class Empleado {
private int codigoDelEmpleado;
private String nombreDelEmpleado;
private float sueldoDelEmpleado;

public Empleado(int codigo, String nombre, float sueldo) {
codigoDelEmpleado = codigo;
nombreDelEmpleado = nombre;
sueldoDelEmpleado = sueldo;
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