package laboratorio01;


public class MCD {
    //Objeto
    private static int contadorTiempo;
    //Metodo getter
    public static int getContadorTiempo() {
        return contadorTiempo;
    }

    public static int MCDFuncion(int a, int b) {
        int num1 = a;
        int num2 = b;
        contadorTiempo = 0; 
        while(num1 != num2)
            if(num1>num2)
                num1= num1-num2;
            else
                num2= num2 -num1;
            contadorTiempo++;
        return num1;
    }
}
