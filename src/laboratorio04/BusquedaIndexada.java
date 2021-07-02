/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio04;

/**
 *
 * @author Rodrigo QP
 */
public class BusquedaIndexada {
    private static int contador = 0;
    private int comparaciones = 0;
    
    public void Buscar(int m,BusquedaIndexada.Empresa x){
        comparaciones = 0;
        boolean s=false;
        int i=0;
        while( i < x.getNumeroDeEmpleados()&& !s ){
           // for(int i = 0; i < x.getNumeroDeEmpleados(); i++){
            
             if(m==x.getIndiceDelEmpleado(i)){
               System.out.printf("%10d%10s%10.2f\n",
                    x.getCodigoDelEmpleado(i),
                    x.getNombreDelEmpleado(i),
                    x.getSueldoDelEmpleado(i));
               s=true;
             }
              i++;
              comparaciones++;      
        }
        
    }   
        
}   

