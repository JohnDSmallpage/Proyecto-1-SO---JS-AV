package Clases;

import interfaz.maininterfaz;
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
public class Productor_botones extends Thread {

    Semaphore mutex;
    Semaphore dato;
    Semaphore espacio;
    int produccion;
    int id;

    public Productor_botones(Semaphore mutex, Semaphore dato, Semaphore espacio, int produccion, int id) {
        this.mutex = mutex;
        this.dato = dato;
        this.espacio = espacio;
        this.produccion = produccion;
        this.id = id;
    }

    @Override
    public void run() {
                double dormido = (maininterfaz.dia_duracion/ produccion);
                dormido = Math.round(dormido);
                long l_dormido = (new Double(dormido)).longValue();
        while (maininterfaz.dias_despacho > 0 || maininterfaz.dias_despacho_ale>0) {
            try {
                
                Thread.sleep(l_dormido);
                espacio.acquire();
                mutex.acquire();
                if (id == 0 && maininterfaz.dias_despacho>0) {
                    maininterfaz.n_botones += 1;
                    maininterfaz.jTextField2.setText(Integer.toString(maininterfaz.n_botones));
                } else if(id == 1 && maininterfaz.dias_despacho_ale>0) {
                    maininterfaz.n_botones_ale += 1;
                    maininterfaz.jTextField15.setText(Integer.toString(maininterfaz.n_botones_ale));
                }

                //System.out.println("El productor " + currentThread() + " produjo botón");
                mutex.release();
                dato.release();

            } catch (InterruptedException ex) {
                Logger.getLogger(Productor_botones.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }
}
