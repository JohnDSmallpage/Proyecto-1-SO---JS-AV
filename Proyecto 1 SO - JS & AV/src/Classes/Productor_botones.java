package Classes;


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
public class Productor_botones extends Thread{
    Semaphore mutex;
    Semaphore dato;
    Semaphore espacio;
    
    public Productor_botones(Semaphore mutex, Semaphore dato, Semaphore espacio){
        this.mutex= mutex;
        this.dato= dato;
        this.espacio= espacio;
        
    }
    
    @Override
    public void run(){
        while (Main.day!=30) {            
           try {
            espacio.acquire();
            mutex.acquire();
            Main.n_botones+=1;
            //System.out.println("El productor " + currentThread() + " produjo botón");
            mutex.release();
            dato.release();
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            Logger.getLogger(Productor_botones.class.getName()).log(Level.SEVERE, null, ex);
        }
           
        }
        
    }
}
