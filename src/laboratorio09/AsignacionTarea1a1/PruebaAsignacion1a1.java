package laboratorio09.AsignacionTarea1a1;

public class PruebaAsignacion1a1 {

    public static void main(String[] args) {

     /*     int[][] Tabla = {{10, 5, 20}, {8, 6, 13}, {20, 10, 4}};
        int[][] S = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        int ord = 3;
     */  
      int[][] Tabla = {{14,5,8,7}, {2,12,6,5}, {7,8,3,9},{2,4,6,10}};
        int[][] S = {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
        int ord = 4;

        AsignacionTareas1a1 Matriz = new AsignacionTareas1a1();
        
       System.out.println("\n\n***Tabla de Tareas*** maquina vs tiempo \n\n");
        Matriz.imprimirMatrizCuadrada(Tabla, ord);
        
        Matriz.VorazAsignar(Tabla, ord, S);
         
        

        System.out.println("\n\n***Tabla de Solucion Asignacion de Tareas 1 a 1*** \n\n");
        Matriz.imprimirMatrizCuadrada(S, ord);
        
        System.out.println("\n**************************************");
        Matriz.imprimirSolucion(S, ord, Tabla);

    }

}
