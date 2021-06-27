
package laboratorio03;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author Fiorella
 */
public final class Empleado {
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

