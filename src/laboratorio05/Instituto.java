/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio05;

import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author krypt97
 */
public class Instituto {

    private Alumno alumnos[];
    private final int TAM_TABLA = 20;
    private Alumno misAlumnos[][];

    public Instituto() {
        // Inicializa arreglo normal
        alumnos = new Alumno[TAM_TABLA];
        for (int i = 0; i < TAM_TABLA; i++) {
            alumnos[i] = new Alumno(0, "", 0);
        }

        // Inicializa matriz para reorganización con arreglos anidados.
        misAlumnos = new Alumno[TAM_TABLA][3];
        for (int i = 0; i < TAM_TABLA; i++) {
            for (int j = 0; j < 3; j++) {
                misAlumnos[i][j] = new Alumno(0, "", 0);
            }
        }
    }
    
    
    /*---------------------------------------------------------------------------------------------------*/
    // CODIGO DEL EJEMPLO - SE APLICA EN EL ARREGLO NORMAL
    public void setCodigoDelAlumno(int codigo, int i) {
        alumnos[i].setCodigoDelAlumno(codigo);
    }

    public int getCodigoDelAlumno(int i) {
        return alumnos[i].getCodigoDelAlumno();
    }

    public void setNombreDelAlumno(String nombre, int i) {
        alumnos[i].setNombreDelAlumno(nombre);
    }

    public String getNombreDelAlumno(int i) {
        return alumnos[i].getNombreDelAlumno();
    }
    
    public void setPensionDelAlumno(float pension, int i) {
        alumnos[i].setPensionDelAlumno(pension);
    }

    public float getPensionDelAlumno(int i) {
        return alumnos[i].getPensionDelAlumno();
    }
    
    public int getNumeroDeAlumnos() {
        return TAM_TABLA;
    }
    
    
    /*---------------------------------------------------------------------------------------------------*/
    // METODOS ACCESORES - SE APLICAN EN REASIGNACION POR ARREGLOS ANIDADOS
    public void setNombreDelAlumnoMatriz(String nombre, int i, int j) {
        misAlumnos[i][j].setNombreDelAlumno(nombre);
    }
    
    public int getCodigoDelAlumnoMatriz(int i, int j) {
        return misAlumnos[i][j].getCodigoDelAlumno();
    }
    
    public void setCodigoDelAlumnoMatriz(int codigo, int i, int j) {
        misAlumnos[i][j].setCodigoDelAlumno(codigo);
    }
    
    public void setPensionDelAlumnoMatriz(float pension, int i, int j) {
        misAlumnos[i][j].setPensionDelAlumno(pension);
    }

    public float getPensionDelAlumnoMatriz(int i, int j) {
        return misAlumnos[i][j].getPensionDelAlumno();
    }

    public String getNombreDelAlumnoMatriz(int i, int j) {
        return misAlumnos[i][j].getNombreDelAlumno();
    }
    
    /*---------------------------------------------------------------------------------------------------*/
    // METODOS ACCESORES - SE APLICAN EN REASIGNACIÓN POR ENCADENAMIENTO (ARRAY + LINSTA ENZALADA)
    public void setMiAlumnoSgte(Alumno miNuevoAlumno, int i) {
        alumnos[i].setMiAlumnoSgte(miNuevoAlumno);
    }

    public LinkedList<Alumno> getMiAlumnoSgte(int i) {
        return alumnos[i].getMiAlumnoSgte();
    }
    
    public void setRemoverMiAlumnoSgte(int index, int i) {
        alumnos[i].removerMiAlumnoSgte(index);
    }
    
    public int getCodigoDelAlumnoArrayLinkedList(int[] pos) {
        int codigo = 0;
        if (pos[0] != -1) {
            if (pos[1] == -1) {
                codigo = getCodigoDelAlumno(pos[0]);
            } else {
                codigo = getMiAlumnoSgte(pos[0]).get(pos[1]).getCodigoDelAlumno();
            }
        }
        return codigo;
    }
    
    public String getNombreDelAlumnoArrayLinkedList(int[] pos) {
        String nombre = "";
        if (pos[0] != -1) {
            if (pos[1] == -1) {
                nombre = getNombreDelAlumno(pos[0]);
            } else {
                nombre = getMiAlumnoSgte(pos[0]).get(pos[1]).getNombreDelAlumno();
            }
        }
        return nombre;
    }
    
    public float getPensionDelAlumnoArrayLinkedList(int[] pos) {
        float pension = 0.0f;
        if (pos[0] != -1) {
            if (pos[1] == -1) {
                pension = getPensionDelAlumno(pos[0]);
            } else {
                pension = getMiAlumnoSgte(pos[0]).get(pos[1]).getPensionDelAlumno();
            }
        }
        return pension;
    }
    

    /*---------------------------------------------------------------------------------------------------*/
    // PREGUNTA 02 - PASAR CODIGO ALFANÚMERICO A SOLO NUMERICO.
    public static String convertirEntero(String cod) {
        String cadena = "";
        char[] aCaracteres = cod.toCharArray();
        boolean flag = false;
        //int[] arr={0,1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < aCaracteres.length; i++) {
            for (int j = 0; j < 10; j++) {
                //char car = Integer.toString(j).charAt(0);    
                char car = Character.forDigit(j, 10);
                char var = aCaracteres[i];
                if (Character.compare(var, car) == 0) {
                    //if(Character.getNumericValue(aCaracteres[i])==j){
                    cadena = cadena + aCaracteres[i];
                    flag = true;
                }
            }
            if (!(flag && true)) {
                int num = cod.charAt(i);
                cadena = cadena + String.valueOf(num);
            }
            flag = false;
        }
        return cadena;
    }

    public int hash(int clave) {
        return clave % 19;
    }

    /*---------------------------------------------------------------------------------------------------*/
    // REASIGNACIOÓN LINEAL
    public boolean insertarLineal(int codigo, String nombre, float pension) {
        int pos, pos_sigte;
        pos = hash(codigo);
        if (getCodigoDelAlumno(pos) == 0) {
            setCodigoDelAlumno(codigo, pos);
            setNombreDelAlumno(nombre, pos);
            setPensionDelAlumno(pension, pos);
            return true;
        } else { //Se produce colisión: Solución por reasignación por prueba lineal
            pos_sigte = pos + 1;
            while (pos_sigte < getNumeroDeAlumnos() && getCodigoDelAlumno(pos_sigte) != 0 && pos_sigte != pos) {
                pos_sigte++;
                if (pos_sigte == getNumeroDeAlumnos()) {
                    pos_sigte = 0;
                }
            }
            if (getCodigoDelAlumno(pos_sigte) == 0) {
                setCodigoDelAlumno(codigo, pos_sigte);
                setNombreDelAlumno(nombre, pos_sigte);
                setPensionDelAlumno(pension, pos_sigte);
                return true;
            } else {
                return false;
            }
        }
    }

    public int buscarLineal(int codigo) {
        int pos, pos_sigte;
        pos = hash(codigo);
        if (getCodigoDelAlumno(pos) == codigo) {
            return pos;
        } else { //Se produce colisión: Solución por reasignación por prueba lineal
            pos_sigte = pos + 1;
            while (pos_sigte < getNumeroDeAlumnos()) {
                if (getCodigoDelAlumno(pos_sigte) == codigo) {
                    return pos_sigte;
                }
                pos_sigte++;
            }
            return -1; //código no existe
        }
    }

    public void eliminarUniversal(int pos) {
        if (pos != -1) {
            setCodigoDelAlumno(0, pos);
            setNombreDelAlumno("", pos);
            setPensionDelAlumno(0.0f, pos);
        } else {
            JOptionPane.showMessageDialog(null, "Codigo no existe");
        }
    }

    /*---------------------------------------------------------------------------------------------------*/
    // REASIGNACIÓN POR PRUEBA CUADRATICA
    public void insertarCuadratica(int codigo, String nombre, float pension) {
        int pos = hash(codigo);
        if (getCodigoDelAlumno(pos) == 0) {
            setCodigoDelAlumno(codigo, pos);
            setNombreDelAlumno(nombre, pos);
            setPensionDelAlumno(pension, pos);
        } else {
            int i = 1;
            int posNew = pos + (i * i);
            boolean flag = false;
            while (posNew < getNumeroDeAlumnos() && flag == false) {
                if (getCodigoDelAlumno(posNew) == 0) {
                    setCodigoDelAlumno(codigo, posNew);
                    setNombreDelAlumno(nombre, posNew);
                    setPensionDelAlumno(pension, posNew);
                    flag = true;
                }
                i = i + 1;
                posNew = pos + (i * i);
            }
            if (!flag) {
                posNew = 0;
                while (posNew < getNumeroDeAlumnos() && getCodigoDelAlumno(posNew) != 0) {
                    posNew = posNew + 1;
                }
                if (getCodigoDelAlumno(posNew) == 0) {
                    setCodigoDelAlumno(codigo, posNew);
                    setNombreDelAlumno(nombre, posNew);
                    setPensionDelAlumno(pension, posNew);
                }
            }
        }
    }

    public int buscarCuadratica(int codigo) {
        int pos = hash(codigo);
        if (getCodigoDelAlumno(pos) == codigo) {
            return pos;
        } else {
            int i = 1;
            int posNew = pos + (i * i);
            while (posNew < getNumeroDeAlumnos()) {
                if (getCodigoDelAlumno(posNew) == codigo) {
                    return posNew;
                }
                i = i + 1;
                posNew = pos + (i * i);
            }
            posNew = 0;
            while (posNew < getNumeroDeAlumnos()) {
                if (getCodigoDelAlumno(posNew) == codigo) {
                    return posNew;
                }
                posNew = posNew + 1;
            }
            return -1;
        }
    }

    /*---------------------------------------------------------------------------------------------------*/
    // REASIGNACION ANIDADOS
    public boolean insertarAnidados(int codigo, String nombre, float pension) {
        int pos = hash(codigo);
        if (getCodigoDelAlumnoMatriz(pos, 0) == 0) {
            setCodigoDelAlumnoMatriz(codigo, pos, 0);
            setNombreDelAlumnoMatriz(nombre, pos, 0);
            setPensionDelAlumnoMatriz(pension, pos, 0);
            return true;
        } else {
            int posSgte = 1;
            while (posSgte < 3) {
                if (getCodigoDelAlumnoMatriz(pos, posSgte) == 0) {
                    setCodigoDelAlumnoMatriz(codigo, pos, posSgte);
                    setNombreDelAlumnoMatriz(nombre, pos, posSgte);
                    setPensionDelAlumnoMatriz(pension, pos, posSgte);
                    return true;
                }
                posSgte++;
            }
            return false;
        }
    }

    public int[] buscarAnidados(int codigo) {
        int[] posMatriz = {-1, -1};
        int pos = hash(codigo);
        if (getCodigoDelAlumnoMatriz(pos, 0) == codigo) {
            posMatriz[0] = pos;
            posMatriz[1] = 0;
            return posMatriz;
        } else {
            int posSgte = 1;
            while (posSgte < 3) {
                if (getCodigoDelAlumnoMatriz(pos, posSgte) == codigo) {
                    posMatriz[0] = pos;
                    posMatriz[1] = posSgte;
                    return posMatriz;
                }
                posSgte++;
            }
            return posMatriz;
        }
    }

    public void eliminarAnidados(int[] pos) {
        if (pos[0] != -1) {
            setCodigoDelAlumnoMatriz(0, pos[0], pos[1]);
            setNombreDelAlumnoMatriz("", pos[0], pos[1]);
            setPensionDelAlumnoMatriz(0.0f, pos[0], pos[1]);
        } else {
            JOptionPane.showMessageDialog(null, "Codigo no existe");
        }
    }

    /*---------------------------------------------------------------------------------------------------*/
    // REASIGNACION ENCADENAMIENTO
    public void insertarEncadenamiento(int codigo, String nombre, float pension) {
        int pos = hash(codigo);
        if (getCodigoDelAlumno(pos) == 0) {
            setCodigoDelAlumno(codigo, pos);
            setNombreDelAlumno(nombre, pos);
            setPensionDelAlumno(pension, pos);
        } else {
            Alumno miNuevoAlumno = new Alumno(codigo, nombre, pension);
            setMiAlumnoSgte(miNuevoAlumno, pos);
        }
    }
    
    public int[] buscarEncadenamiento(int codigo) {
        int[] posVector = {-1, -1};
        int pos = hash(codigo);
        if (getCodigoDelAlumno(pos) == codigo) {
            posVector[0] = pos;
            return posVector;
        }
        else {
            LinkedList<Alumno> miLinkedList = getMiAlumnoSgte(pos);
            if (miLinkedList != null) {
                int posLinkedList = 0;
                for (Alumno alumno : miLinkedList) {
                    if (alumno.getCodigoDelAlumno() == codigo) {
                        posVector[0] = pos; 
                        posVector[1] = posLinkedList; 
                        return posVector;
                    }
                    posLinkedList++;
                }
            }
            return posVector;
        }
    }
    
    public void eliminarEncadenamiento(int[] pos) {
        if (pos[0] != -1) {
            if (pos[1] == -1) {
                setCodigoDelAlumno(0, pos[0]);
                setNombreDelAlumno("", pos[0]);
                setPensionDelAlumno(0.0f, pos[0]);
            }
            else {
                setRemoverMiAlumnoSgte(pos[1], pos[0]);
            }
        }
    }
    
    /*---------------------------------------------------------------------------------------------------*/
    // REASIGNACIÓN POR DOBLE DIRECCIÓN
    // To Do.
}
