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
    long duracion;

    public Productor_pin(Semaphore mutex, Semaphore dato, Semaphore espacio, int id, long duracion) {
        this.mutex = mutex;
        this.dato = dato;
        this.espacio = espacio;
        this.id = id;
        this.duracion=duracion;

    }

    @Override
    public void run() {
        while (maininterfaz.dias_despacho > 0 || maininterfaz.dias_despacho_ale>0) {
            try {
                Thread.sleep(duracion * 3);
                espacio.acquire();
                mutex.acquire();
                if (id == 0 && maininterfaz.dias_despacho>0) {
                    maininterfaz.n_pin += 1;
                    maininterfaz.jTextField4.setText(Integer.toString(maininterfaz.n_pin));
                } else if(id==1 && maininterfaz.dias_despacho_ale>0) {
                    maininterfaz.n_pin_ale += 1;
                    maininterfaz.jTextField17.setText(Integer.toString(maininterfaz.n_pin_ale));
                }
                //System.out.println("El productor " + currentThread() + " produjo  pin");
                mutex.release();
                dato.release();

            } catch (InterruptedException ex) {
                Logger.getLogger(Productor_botones.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }
}
