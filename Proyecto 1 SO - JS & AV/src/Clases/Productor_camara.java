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
public class Productor_camara extends Thread {

    Semaphore mutex;
    Semaphore dato;
    Semaphore espacio;
    int dia;
    int id;

    public Productor_camara(Semaphore mutex, Semaphore dato, Semaphore espacio, int dia, int id) {
        this.mutex = mutex;
        this.dato = dato;
        this.espacio = espacio;
        this.dia = dia;
        this.id = id;

    }

    @Override
    public void run() {
        while (maininterfaz.dias_despacho != 0) {
            try {
                Thread.sleep(maininterfaz.dia_duracion * dia);
                espacio.acquire();
                mutex.acquire();
                if (id == 0) {
                    maininterfaz.n_camara += 1;
                    maininterfaz.jTextField3.setText(Integer.toString(maininterfaz.n_camara));
                } else {
                    maininterfaz.n_camara_ale += 1;
                    maininterfaz.jTextField16.setText(Integer.toString(maininterfaz.n_camara_ale));
                }
                //System.out.println("El productor " + currentThread() + " produjo cámara");
                mutex.release();
                dato.release();

            } catch (InterruptedException ex) {
                Logger.getLogger(Productor_botones.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }
}
