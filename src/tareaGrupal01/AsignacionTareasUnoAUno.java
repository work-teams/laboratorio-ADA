/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaGrupal01;

/**
 *
 * @author krypt97
 */
public class AsignacionTareasUnoAUno {
    // Atributos de clase
    int[][] matrizDatos = {{14,5,8,7}, {2,12,6,5}, {7,8,3,9}, {2,4,6,10}};
    int[][] matrizSoluciones = new int[4][4];
    
    boolean[] disponible = {true,true,true,true};
    
    int[] fila0 = new int[4];
    int[] fila1 = new int[4];
    int[] fila2 = new int[4];
    int[] fila3 = new int[4];
    
    int[] valoresRechazadosFila0 = {-1, -1, -1, -1};
    int[] valoresRechazadosFila1 = {-1, -1, -1, -1};
    int[] valoresRechazadosFila2 = {-1, -1, -1, -1};
    int[] valoresRechazadosFila3 = {-1, -1, -1, -1};
    
    // Metodos de clase
    public void dividirMatriz() { // divide los datos fila por fila.
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                switch (i) {
                    case 0: fila0[j] = matrizDatos[0][j]; break;
                    case 1: fila1[j] = matrizDatos[1][j]; break;
                    case 2: fila2[j] = matrizDatos[2][j]; break;
                    case 3: fila3[j] = matrizDatos[3][j]; break;
                }
            }
        }
    }
    
    private void insertar(int fila , int pos) {
        this.matrizSoluciones[fila][pos] = 1;
    }
    
    public int calculaMenor (int[] valoresRechazados, int[] fila) { // haya el menor teniedo encuenta los rechazados
        int menor = 100;
        int pos = -1;
        for (int i = 0; i < 4; i++) {
            if (i==valoresRechazados[0] || i==valoresRechazados[1] || i==valoresRechazados[2] || i==valoresRechazados[3]) {
            } else if (fila[i] < menor) {
                menor = fila[i];
                pos = i;
            }
        }
        return pos;
    }
    
    private void rechazarPosicion(int numeroFila, int pos) { // rechaza según sea el vector analizado.
        switch (numeroFila) {
            case 0: valoresRechazadosFila0[pos] = pos; break;
            case 1: valoresRechazadosFila1[pos] = pos; break;
            case 2: valoresRechazadosFila2[pos] = pos; break;
            case 3: valoresRechazadosFila3[pos] = pos; break;
        }
    }
    
    public boolean estaDisponible(int pos) {
        if (this.disponible[pos]) {
            this.disponible[pos] = false;
            return true;
        } else {
            return false;
        }
    }
    
    public void asignarTareasUnoAUno() {
        dividirMatriz();
        int pos;
        boolean flag;
/* -------------------------------------------------------------------------- */        
        pos = calculaMenor(valoresRechazadosFila0, fila0);
        flag = estaDisponible(pos);
        
        if (flag) {
            insertar(0, pos);
        } else {
            flag = false;
            while (!flag) {
                rechazarPosicion(0, pos);
                pos = calculaMenor(valoresRechazadosFila0, fila0);
                flag = estaDisponible(pos);
            }
            insertar(0, pos);
        }
/* -------------------------------------------------------------------------- */        
        pos = calculaMenor(valoresRechazadosFila1, fila1);
        flag = estaDisponible(pos);
        
        if (flag) {
            insertar(1, pos);
        } else {
            flag = false;
            while (!flag) {
                rechazarPosicion(1, pos);
                pos = calculaMenor(valoresRechazadosFila1, fila1);
                flag = estaDisponible(pos);
            }
            insertar(1, pos);
        }
/* -------------------------------------------------------------------------- */        
        pos = calculaMenor(valoresRechazadosFila2, fila2);
        flag = estaDisponible(pos);
        
        if (flag) {
            insertar(2, pos);
        } else {
            flag = false;
            while (!flag) {
                rechazarPosicion(2, pos);
                pos = calculaMenor(valoresRechazadosFila2, fila2);
                flag = estaDisponible(pos);
            }
            insertar(2, pos);
        }
/* -------------------------------------------------------------------------- */
        pos = calculaMenor(valoresRechazadosFila3, fila3);
        flag = estaDisponible(pos);
        
        if (flag) {
            insertar(3, pos);
        } else {
            flag = false;
            while (!flag) {
                rechazarPosicion(3, pos);
                pos = calculaMenor(valoresRechazadosFila3, fila3);
                flag = estaDisponible(pos);
            }
            insertar(3, pos);
        }
/* -------------------------------------------------------------------------- */       
        imprimirMatrices();
    }
    
    public void imprimirMatrices() {
        System.out.println("Matriz de datos");
        for (int[] matriz_dato : matrizDatos) {
            for (int j = 0; j < matrizDatos.length; j++) {
                System.out.print(matriz_dato[j] + "\t");
            }
            System.out.println("");
        }
        
        System.out.println("");
        
        System.out.println("Matriz de soluciones");
        for (int[] matriz_solucion : matrizSoluciones) {
            for (int j = 0; j < matrizSoluciones.length; j++) {
                System.out.print(matriz_solucion[j] + "\t");
            }
            System.out.println("");
        }
    }
}

