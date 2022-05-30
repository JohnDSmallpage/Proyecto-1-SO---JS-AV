package Clases;


//import Clases.Main;
import interfaz.maininterfaz;
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
public class Día extends Thread {
    int id;
    
    public Día(int id){
        this.id=id;
    }
    
    @Override
    public void run(){
        while (maininterfaz.dias_despacho>0 || maininterfaz.dias_despacho_ale>0) {            
          try {
                  
                  maininterfaz.dia_pasado=true;
                  Thread.sleep(maininterfaz.dia_duracion);                
                  maininterfaz.dia_pasado=false;
                  
              
            
            
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Día.class.getName()).log(Level.SEVERE, null, ex);
        }  
        }
        
    }
}
