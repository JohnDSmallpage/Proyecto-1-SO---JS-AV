
package Clases;

import interfaz.maininterfaz;
import java.util.Random;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnd
 */
public class Gerente extends Thread {
    
    Semaphore mutex_calendario;
    int id;
    
    public Gerente(Semaphore mutex_calendario, int id){
        this.mutex_calendario=mutex_calendario;
        this.id=id;
        
    }
    @Override
    public void run(){
        while (maininterfaz.dias_despacho>0 || maininterfaz.dias_despacho_ale>0) {
            
            try {
                Random num_aleatorio= new Random();
            double superior=  (3/4f)*maininterfaz.dia_duracion;
            double inferior=  (1/2f)*maininterfaz.dia_duracion;
            superior= Math.round(superior);
            inferior= Math.round(inferior);
            int l_superior = (new Double(superior)).intValue();
            int l_inferior = (new Double(inferior)).intValue();

            int random= num_aleatorio.nextInt(l_superior-l_inferior+1) + l_inferior;
            long periodo = (new Long(random)).longValue();
              
            long restante= maininterfaz.dia_duracion-periodo;
           
            
            mutex_calendario.acquire();
            
                if (id==0) {
                    maininterfaz.jTextField33.setText("Calendario");
                    Thread.sleep(restante); 
                }
                else{
                   maininterfaz.jTextField23.setText("Calendario");
                   Thread.sleep(restante); 
                }
                
            mutex_calendario.release();
            
            
            long periodo_real= periodo;
              
              while (periodo_real>0 && (maininterfaz.dias_despacho>0 || maininterfaz.dias_despacho_ale>0)) {
                  double min_inferior= (1/48f)*maininterfaz.dia_duracion;
                  double min_superior= (1/16f)*maininterfaz.dia_duracion;
                  
                  min_inferior= Math.round(min_inferior);
                  min_superior= Math.round(min_superior);
                  int m_superior = (new Double(min_superior)).intValue();
                  int m_inferior = (new Double(min_inferior)).intValue();

                  int random_m= (int) (num_aleatorio.nextInt(m_superior-m_inferior+1) + min_inferior);
                  long sorpresa = (new Long(random_m)).longValue();
                  System.out.println(sorpresa);
                  
                  System.out.println("John: " + maininterfaz.jugando);
                  System.out.println("");
                  System.out.println("ale: " + maininterfaz.jugando_ale);
                  if (id==0) {
                      Thread.sleep(sorpresa);
                      periodo_real-=sorpresa;
                      if (maininterfaz.jugando==true) {
                          maininterfaz.salario_jefe-=2;
                          maininterfaz.contador_jefe++;
                          maininterfaz.jTextField12.setText(Integer.toString(maininterfaz.contador_jefe));
                          maininterfaz.jTextField33.setText("Atrapó al jefe");
                      }
                  }
                  else{
                       Thread.sleep(sorpresa);
                       periodo_real-=sorpresa;
                       if (maininterfaz.jugando_ale==true) {
                          maininterfaz.salario_jefe_ale-=2;
                          maininterfaz.contador_jefe_ale++;
                          maininterfaz.jTextField13.setText(Integer.toString(maininterfaz.contador_jefe_ale));
                          maininterfaz.jTextField23.setText("Atrapó al jefe");
                      }
                  }
                  
              }
            
            
            
            } catch (InterruptedException ex) {
                Logger.getLogger(Gerente.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    
    
}

