/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio05;

import java.util.LinkedList;

/**
 *
 * @author krypt97
 */
public class Alumno {
    private int codigoDelAlumno;
    private String nombreDelAlumno;
    private float pensionDelAlumno;
    
    // Lista enlanza para REASIGNACIÓN POR ENCADENAMIENTO
    private LinkedList<Alumno> miAlumnoSgte = new LinkedList<>();

    /*---------------------------------------------------------------------------------------------------*/
    // CODIGO DEL EJEMPLO
    public Alumno(int codigoDelAlumno, String nombreDelAlumno, float pensionDelAlumno) {
        this.codigoDelAlumno = codigoDelAlumno;
        this.nombreDelAlumno = nombreDelAlumno;
        this.pensionDelAlumno = pensionDelAlumno;
    }

    public int getCodigoDelAlumno() {
        return codigoDelAlumno;
    }

    public void setCodigoDelAlumno(int codigoDelAlumno) {
        this.codigoDelAlumno = codigoDelAlumno;
    }

    public String getNombreDelAlumno() {
        return nombreDelAlumno;
    }

    public void setNombreDelAlumno(String nombreDelAlumno) {
        this.nombreDelAlumno = nombreDelAlumno;
    }

    public float getPensionDelAlumno() {
        return pensionDelAlumno;
    }

    public void setPensionDelAlumno(float pensionDelAlumno) {
        this.pensionDelAlumno = pensionDelAlumno;
    }

    /*---------------------------------------------------------------------------------------------------*/
    // METODOS AUXILIARES NECESARIOS - APLICADOS EN REASIGNACIÓN POR ENCADENAMIENTO (ARREGLO + LISTAS ENLAZADAS)
    public LinkedList<Alumno> getMiAlumnoSgte() {
        return miAlumnoSgte;
    }

    public void setMiAlumnoSgte(Alumno miAlumnoSgte) {
        this.miAlumnoSgte.add(miAlumnoSgte);
    }
    
    public void removerMiAlumnoSgte(int index) {
        this.miAlumnoSgte.remove(index);
    }
}
