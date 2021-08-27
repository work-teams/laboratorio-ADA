package laboratorio09.AsignacionTarea1a1;

public class AsignacionTareas1a1 {

    public void VorazAsignar(int Tabla[][], int ordenmatriz, int Solucion[][]) {
        int x, i = 0, j = 0;
        int NUMGRANDE = GenerarNumeroSufGrande(Tabla, ordenmatriz);
        while (!esSolucion(Tabla, ordenmatriz) && i < ordenmatriz) {

            x = Seleccion(Tabla, i, ordenmatriz);  //x guarda la n°columna donde está el menor tiempo de la fila i

            if (Factible(x, ordenmatriz, Solucion)) {
                Solucion[i][x] = 1;
                i++;
                j = 0;
            } else {

                Tabla[i][x] = NUMGRANDE;
                j++;
            }

        }

    }

    public int GenerarNumeroSufGrande(int T[][], int ordenmatriz) {
        int devolverMayor = -1;
        for (int i = 0; i < ordenmatriz; i++) {
            for (int j = 0; j < ordenmatriz; j++) {
                if (devolverMayor < T[i][j]) {
                    devolverMayor = T[i][j];
                }
            }
        }
        return devolverMayor + 1;

    }

    public boolean esSolucion(int S[][], int ordenmatriz) {

        int i = 0, j = 0, cont = 0;

        while (i < ordenmatriz) {
            while (j < ordenmatriz) {
                if (S[i][j] == 1) {
                    cont++;
                }
                j++;
            }
            i++;
        }

        if (cont == ordenmatriz) {
            return true;
        } else {
            return false;
        }

    }

    public int Seleccion(int T[][], int fila, int ordenmatriz) {

        int menor = T[fila][0];
        int ind = 0;

        for (int j = 1; j < ordenmatriz; j++) {
            if (T[fila][j] < menor) {
                menor = T[fila][j];
                ind = j;
            }

        }

        return ind;

    }

    public boolean Factible(int columna, int ordenmatriz, int S[][]) {
        int i = 0;
        boolean flag = true;
        while (i < ordenmatriz && flag == true) {

            if (S[i][columna] == 0) {
                flag = true;
                i++;
            } else {
                flag = false;

            }
        }

        return flag;

    }

    public void imprimirSolucion(int S[][], int orden, int T[][]) {
        for (int i = 0; i < orden; i++) {
            for (int j = 0; j < orden; j++) {
                if (S[i][j] == 1) {
                    System.out.println("\t" + T[i][j] + " :::Maquina " + (i + 1) + " asignado a Tarea " + (j + 1));
                }
            }

        }
    }

    public void imprimirMatrizCuadrada(int M[][], int orden) {

        System.out.print("\t__M/T__|");
        for (int j = 0; j < orden; j++) {
            System.out.print("\tTarea " + (j + 1));
        }

        System.out.print("\n");

        for (int i = 0; i < orden; i++) {
            System.out.print("\tMáquina " + (i + 1));
            for (int j = 0; j < orden; j++) {

                System.out.print("\t" + M[i][j]);
            }
            System.out.print("\n");
        }
    }

}
