/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio09;

/**
 *
 * @author Rodrigo QP
 */

import javax.swing.JOptionPane;

public class Backtracking {

    private int s[];
    private int v[];
    private int tact;
    private int p;
   
    

    public Backtracking(int valores[], int suma) {
        v = new int[valores.length];
        s = new int[valores.length];
        v = valores;
        tact = 0;
        p = suma;

    }

    public void hallarSubconjunto() {
        int nivel = 0;
        boolean fin = false;
        
        
        //Inicializa arreglo solucion s
        for (int i = 0; i < s.length; i++) {
            s[i] = -1;
        }
        
        do {
            generar(nivel);
            if (solucion(nivel, p)) {
               fin = true;
               //Almacenar();
            } else if (criterio(nivel, p)) {
                nivel++;
            } else {
                while (!masHermanos(nivel) && nivel>-1) {
                    nivel = retroceder(nivel);
                }
            }
        } while (fin == false && nivel>-1);
        
        
        

    }

    public void generar(int nivel) {
        s[nivel] = s[nivel] + 1;
        if (s[nivel] == 1) {
            tact = tact + v[nivel];
        }

    }

    public boolean solucion(int nivel, int p) {
        int n = s.length;
        return (nivel == n-1 && tact == p);

    }

    public boolean criterio(int nivel, int p) {
        int n = s.length;
        return (nivel < n-1 && tact <= p);

    }

    public boolean masHermanos(int nivel) {
        return (s[nivel] < 1);

    }

    public int retroceder(int nivel) {
        tact-= v[nivel] * s[nivel];
        s[nivel]= -1;
        nivel--;
        return nivel;

    }

    public void mostrarSolucion() {
        String mensaje = "";
        mensaje = "Valores:\n {";
        for (int i = 0; i < v.length; i++) {
            mensaje += v[i];
            if (i < v.length - 1) {
                mensaje += ", ";
            } else {
                mensaje += "}";
            }
        }
        mensaje += "\n\nSolución Backtracking:\n {";
        for (int i = 0; i < s.length; i++) {
            mensaje += s[i];
            if (i < s.length - 1) {
                mensaje += ", ";
            } else {
                mensaje += "}";
            }
        }
        mensaje += "\n\nSubconjunto cuya suma es " + p + ":\n {";
        for (int i = 0; i < s.length; i++) {
            if (s[i] == 1) {
                mensaje += v[i];
                if (i < s.length - 1) {
                    mensaje += ", ";
                } else {
                    mensaje += "} \n";
                }
            }
        }
        JOptionPane.showMessageDialog(null, mensaje,
                "Algoritmos de retroceso (Backtracking)",
                JOptionPane.INFORMATION_MESSAGE);
    }

 
}
