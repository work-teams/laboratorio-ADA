package laboratorio09.Mochila01;

import javax.swing.JOptionPane;

   public class Backtraking {
    private int s[];
    private int p[];
    private int s1[];
    private int b[];
    private int bact, pact;
    private int M;

    public Backtraking(int peso[], int beneficio[], int mochila) {
        p = new int[peso.length];
        s = new int[peso.length];
        p = peso;
        b = new int[beneficio.length];
        b = beneficio;
        bact = 0;
        pact = 0;
        M = mochila;

    }

    public void hallarSubconjunto() {
        int nivel = 0;
        boolean fin = false;
        int voa = 0;
        int[] soa;
        int pact = 0, bact = 0;
        //Inicializa arreglo solucion s
        for (int i = 0; i < s.length; i++) {
            s[i] = -1;
        }
        do {
            generar(nivel);
            if (solucion(nivel, M)) {
                fin = true;
            } else if (criterio(nivel, M)) {
                nivel++;
            } else {
                while (!masHermanos(nivel) && (nivel > 0)) {
                    nivel = retroceder(nivel);
                }
            }
        } while (fin == false);

    }

    public void generar(int nivel) {
        s[nivel] = s[nivel] + 1;
        if (s[nivel] == 1) {
            pact = pact + p[nivel];
            bact = bact + b[nivel];
        }

    }

    public boolean solucion(int nivel, int M) {
        int n = s.length;
        return (nivel == n - 1 && pact == M);

    }

    public boolean criterio(int nivel, int M) {
        int n = s.length;
        return (nivel < n - 1 && pact <= M);

    }

    public boolean masHermanos(int nivel) {
        return (s[nivel] < 1);
    }

    public int retroceder(int nivel) {
        pact -= p[nivel] * s[nivel];
        bact -= b[nivel] * s[nivel];
        s[nivel] = -1;
        nivel--;
        return nivel;

    }

    public void mostrarSolucion() {
        String mensaje = "";
        String mensaje1 = "";
        String mensaje2 = "";
        String mensaje3 = "";
        
        mensaje = "Peso:\n {";
        for (int i = 0; i < p.length; i++) {
            mensaje += p[i];
            if (i < p.length - 1) {
                mensaje+= ", ";
            } else {
                mensaje += "}";
            }
        }
        
        mensaje1 = "\n\nBeneficio:\n {";
        for (int i = 0; i < b.length; i++) {
            mensaje1 += b[i];
            if (i < b.length - 1) {
                mensaje1 += ", ";
            } else {
                mensaje1 += "}";
            }
        }
        
        mensaje2 += "\n\nSolución Backtracking:\n {";
        for (int i = 0; i < s.length; i++) {
            mensaje2 += s[i];
            if (i < s.length - 1) {
                mensaje2 += ", ";
            } else {
                mensaje2 += "}";
            }
        }
        
        mensaje3 += "\n\nSubconjunto de la mochila cuya capacidad es " + M + ":\n {";
        for (int i = 0; i < s.length; i++) {
            if (s[i] == 1) {
                mensaje3 += p[i];
                if (i < s.length - 1) {
                    mensaje3 += ", ";
                } else {
                    mensaje3 += "}";
                }
            }
        }
        
        JOptionPane.showMessageDialog(null, mensaje+ mensaje1+mensaje2+mensaje3,
                "Algoritmos de retroceso (Backtracking)",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
