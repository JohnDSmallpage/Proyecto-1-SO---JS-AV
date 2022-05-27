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
    @Override
    public void run(){
        while (maininterfaz.dia!=maininterfaz.dias_despacho) {            
          try {
            maininterfaz.dia++;
//              System.out.println("Día: " +  Main.day);
//              System.out.println("El número de teléfonos producido fue: " + Main.n_celulares);
//                System.out.println("El número de pantallas restantes en almacen fue: " + Main.n_pantallas);
//                System.out.println("El número de pines restantes en almacen fue: " + Main.n_pin);
//                System.out.println("El número de cámaras restantes en almacen fue: " + Main.n_camara);
//                System.out.println("El número de botones en almacen fue: " + Main.n_botones);
//                System.out.println("");
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Día.class.getName()).log(Level.SEVERE, null, ex);
        }  
        }
        
    }
}
