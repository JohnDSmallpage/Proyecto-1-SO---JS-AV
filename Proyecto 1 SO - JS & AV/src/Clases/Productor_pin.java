
package Clases;


import Clases.Productor_botones;
import interfaz.maininterfaz;

import static java.lang.Thread.currentThread;
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
public class Productor_pin extends Thread {
    Semaphore mutex;
    Semaphore dato;
    Semaphore espacio;
    int id;
    
    public Productor_pin(Semaphore mutex, Semaphore dato, Semaphore espacio, int id){
        this.mutex= mutex;
        this.dato= dato;
        this.espacio= espacio;
        this.id=id;
        
    }
    
    @Override
    public void run(){
        while (maininterfaz.dias_despacho!=0) {            
           try {
            espacio.acquire();
            mutex.acquire();
            if (id==0) {
                   maininterfaz.n_pin+=1;
               }
               else{
                   maininterfaz.n_pin_ale+=1;
               }
            //System.out.println("El productor " + currentThread() + " produjo  pin");
            mutex.release();
            dato.release();
            Thread.sleep(maininterfaz.dia_duracion*3);
        } catch (InterruptedException ex) {
            Logger.getLogger(Productor_botones.class.getName()).log(Level.SEVERE, null, ex);
        }
           
        }
        
    }
}
