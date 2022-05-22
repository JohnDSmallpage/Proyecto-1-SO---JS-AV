
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
    public void run(){
        while (Main.day!=30) {            
          try {
            Main.day++;
              System.out.println(Main.day);
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Día.class.getName()).log(Level.SEVERE, null, ex);
        }  
        }
        
    }
}
