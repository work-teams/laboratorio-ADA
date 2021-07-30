package tareaGrupal01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        // ASIGNACIÓN DE TAREAS UNO A UNO
        AsignacionTareasUnoAUno miAsignacionTareasUnoAUno = new AsignacionTareasUnoAUno();
        miAsignacionTareasUnoAUno.asignarTareasUnoAUno();
        
         Thread.sleep(10000);
        
        //----------------------------------------------------------------------
   
        //MOCHILA FRACCIONAL
        MochilaFraccional Objeto1 = new MochilaFraccional();
        System.out.println("--------------------------");
        System.out.println("    Beneficio     Peso   Beneficio/Peso  ");
        System.out.println("--------------------------");
        Objeto1.ordenarDescendenteMF();
      
        for (int i = 0; i < 3; i++) {
            System.out.printf("%10d%10d%10.2f\n\n",
                    Objeto1.getBeneficioDelObjeto(i),
                    Objeto1.getPesoDelObjeto(i),
                    Objeto1.getBeneficioPesoDelObjeto(i));        
        }
        System.out.println("--------------------------");      
        System.out.println("\nIngrese la capacidad: ");
        float capacidadMF = input1.nextFloat();
        
        Objeto1.mochila_Fraccional(capacidadMF);
        
        Thread.sleep(10000);
        
        //----------------------------------------------------------------------
        
        //MOCHILA 01
        Mochila01 miObjeto = new Mochila01();
        System.out.println("--------------------------");
        System.out.println("\n Beneficio     Peso   Beneficio/Peso ");
        System.out.println("--------------------------");
        miObjeto.ordenarDescendente01();
       
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.printf("%10d%10d%10.2f\n",
                    miObjeto.getBeneficioDelObjeto(i),
                    miObjeto.getPesoDelObjeto(i),
                    miObjeto.getBeneficioPesoDelObjeto(i));
                   
        }
        System.out.println("--------------------------");      
        System.out.println("\nIngrese la capacidad: ");
        float capacidadM1 = input2.nextFloat();
        
        miObjeto.mochila_01(capacidadM1);

    }

}
