package tareaGrupal01;

public class Mochila01 {
    
    private float beneficio_peso[];
    Objeto objeto[];
  
    //constructor
    public Mochila01() {

        int beneficio[] = {20, 30, 65, 40, 55};
        int peso[] = {10, 20, 30, 40, 50};
        beneficio_peso = new float[5];
        for (int i = 0; i < beneficio_peso.length; i++) {
            beneficio_peso[i] = beneficio[i] / peso[i];
        }
        objeto = new Objeto [5];
        for (int i = 0; i < objeto.length; i++) {
            objeto[i] = new Objeto(beneficio[i],peso[i],beneficio_peso[i]);
        }
    }
    //
    public int getBeneficioDelObjeto(int i){
        return objeto[i].getBeneficioDelObjeto();
    }
    public void setBeneficioDelObjeto(int beneficio, int i){
        objeto[i].setBeneficioDelObjeto(beneficio);
    }
    public int getPesoDelObjeto(int i){
        return objeto[i].getPesoDelObjeto();
    }
    public void setPesoDelObjeto(int beneficio, int i){
        objeto[i].setPesoDelObjeto(beneficio);
    }
    public float getBeneficioPesoDelObjeto(int i){
        return objeto[i].getBeneficioPesoDelObjeto();
    }
    public void setBeneficioPesoDelObjeto(float beneficioPeso, int i){
        objeto[i].setBeneficioPesoDelObjeto(beneficioPeso);
    }
    
    
    public void ordenarDescendente01(){
        Objeto temp = new Objeto(0,0,0);
        for(int i=0;i<objeto.length;i++){
            for(int j=0;j<objeto.length-1;j++){
                if(objeto[j].getBeneficioPesoDelObjeto()<objeto[j+1].getBeneficioPesoDelObjeto()){
                    temp.setBeneficioPesoDelObjeto(objeto[j].getBeneficioPesoDelObjeto());
                    objeto[j].setBeneficioPesoDelObjeto(objeto[j+1].getBeneficioPesoDelObjeto());
                    objeto[j+1].setBeneficioPesoDelObjeto(temp.getBeneficioPesoDelObjeto());
                    
                    temp.setBeneficioDelObjeto(objeto[j].getBeneficioDelObjeto());
                    objeto[j].setBeneficioDelObjeto(objeto[j+1].getBeneficioDelObjeto());
                    objeto[j+1].setBeneficioDelObjeto(temp.getBeneficioDelObjeto());
                    
                    temp.setPesoDelObjeto(objeto[j].getPesoDelObjeto());
                    objeto[j].setPesoDelObjeto(objeto[j+1].getPesoDelObjeto());
                    objeto[j+1].setPesoDelObjeto(temp.getPesoDelObjeto());
                   
                }
            }
        }
    }
    
    public void mochila_01(float cap){
        Objeto temp = new Objeto(0,0,0);
        for (int i=0; i<=(objeto.length-1);i++){
            objeto[i].setBeneficioPesoDelObjeto(0);
        }
            float resto=cap;
            int i=0;
        while(i<=objeto.length-1 && objeto[i].getPesoDelObjeto()<=resto){
            objeto[i].setBeneficioPesoDelObjeto(1);
            resto=resto-objeto[i].getPesoDelObjeto();
            i=i+1;
        }    
        
        /*if(i<objeto.length){
            objeto[i].setBeneficioPesoDelObjeto(resto/objeto[i].getPesoDelObjeto());
        }*/ 
        System.out.println("--------------------------");
        System.out.println("\nSolución Factible ");
        
        for( i=0; i<=(objeto.length-1);i++){
            System.out.println(objeto[i].getBeneficioPesoDelObjeto());  
        }
    }
    
}
