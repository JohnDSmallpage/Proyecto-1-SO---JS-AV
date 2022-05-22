
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
public class Ensamblador extends Thread {
    
    private Buffer buffer;
    
    public Ensamblador(Buffer buffer){
        this.buffer= buffer;
    }
    
    @Override
    public void run(){
        while (Main.day!=30) { 
            if (Main.n_botones>=3 && Main.n_pantallas>=2 && Main.n_camara>=4 && Main.n_pin>=1) {
                   buffer.consumir();
                   System.out.println("El ensamblador" + currentThread() + "ensambló 1 Smartphone");
                   System.out.println("Día: "  + Main.day);
                   
               }
           try {
               
               Thread.sleep(2000);
            
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Ensamblador.class.getName()).log(Level.SEVERE, null, ex);
        } 
        }
        
    }
}
