
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
    private Buffer buffer;
    
    public Productor_botones(Buffer buffer){
        this.buffer= buffer;
    }
    
    @Override
    public void run(){
        while (Main.day!=30) {            
           try {
            buffer.producir(2, 1);
            System.out.println("El productor " + currentThread() + " produjo 2 botónes");
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Productor_botones.class.getName()).log(Level.SEVERE, null, ex);
        }
           
        }
        
    }
}
