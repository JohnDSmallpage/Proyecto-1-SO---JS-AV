package Clases;

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
public class Jefe extends Thread {
    @Override
    public void run(){
        while (maininterfaz.dias_despacho==0) {            
          try {
            maininterfaz.dias_despacho--;
//              System.out.println("Día: " +  Main.day);
//              System.out.println("El número de teléfonos producido fue: " + Main.n_celulares);
//                System.out.println("El número de pantallas restantes en almacen fue: " + Main.n_pantallas);
//                System.out.println("El número de pines restantes en almacen fue: " + Main.n_pin);
//                System.out.println("El número de cámaras restantes en almacen fue: " + Main.n_camara);
//                System.out.println("El número de botones en almacen fue: " + Main.n_botones);
//                System.out.println("");
            Thread.sleep(maininterfaz.dia_duracion);
        } catch (InterruptedException ex) {
            Logger.getLogger(Día.class.getName()).log(Level.SEVERE, null, ex);
        }  
        }
        
    }
}
