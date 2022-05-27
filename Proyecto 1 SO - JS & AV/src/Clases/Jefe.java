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
        int i=30;
        while (maininterfaz.dias_despacho!=0) {            
          try {
              
            maininterfaz.dias_despacho--;
            maininterfaz.jTextField10.setText(Integer.toString(maininterfaz.dias_despacho));
              System.out.println("Dia " + i);
              i--;
            System.out.println("hay: " + maininterfaz.n_botones_ale + " botones");
                    System.out.println("hay: " + maininterfaz.n_pantallas_ale + " pantallas");
                    System.out.println("hay: " + maininterfaz.n_camara_ale + " camaras");
                    System.out.println("hay: " + maininterfaz.n_pin_ale + " pines");
                    System.out.println("hay: " + maininterfaz.n_celulares_ale + " celulares");
                    System.out.println("");
//              
            Thread.sleep(maininterfaz.dia_duracion);
        } catch (InterruptedException ex) {
            Logger.getLogger(Día.class.getName()).log(Level.SEVERE, null, ex);
        }  
        }
        
    }
}
