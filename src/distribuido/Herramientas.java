/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distribuido;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CESAR IVAN MTZ
 */
public class Herramientas implements Runnable{
    public  static int total=0;
    public static int ordenRef[] = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
    public static ArrayList<Proceso> listaProcesos = new ArrayList<>(); 
    private static ArrayList<Integer> prOrden = new ArrayList<>(); 

    
    public static int getTotal() {
        return total;
    }

    public static void setTotal(int total) {
        Herramientas.total = total;
    }
    
//    public static void llenarOrden(int ref){
//        prOrden.add(ref); 
//    }  
    
   
    public static void ejecutar(){
        ordenarMenor();
  
//        for(int i=0;i<listaProcesos.size();i++){   
//            if(listaProcesos.get(i).getTime()!=0){
//                for(int j=1;j<=listaProcesos.get(i).getTime();j++){
//                listaProcesos.get(i).mensajeEjecucion(i+" Tiempo "+j);          
//            }
//            }
//        }
    }
    
    
    public static void ordenarMenor(){
         //Aplicar un burbuja   
        Proceso temp;
        for (int i = 1; i < listaProcesos.size();i++)
            for(int j=0; j < listaProcesos.size()-1;j++){
                // preguntamos
                if(listaProcesos.get(j).getTime()>listaProcesos.get(j+1).getTime()){
                    temp = listaProcesos.get(j);
                    listaProcesos.set(j, listaProcesos.get(j+1));
                    listaProcesos.set(j+1, temp);     
                }
          }
   }

    @Override
    public void run() {
      
    }
  
}
