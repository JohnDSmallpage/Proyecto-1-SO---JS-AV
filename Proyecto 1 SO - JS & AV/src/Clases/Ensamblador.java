
package Clases;




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
public class Ensamblador extends Thread {
        Semaphore existe_dato_camara;
        Semaphore existe_espacio_camara;
        Semaphore mutex_camara;
        Semaphore existe_dato_pantalla;
        Semaphore existe_espacio_pantalla;
        Semaphore mutex_pantalla;
        Semaphore existe_dato_boton;
        Semaphore existe_espacio_boton;
        Semaphore mutex_boton;
        Semaphore existe_dato_pin;
        Semaphore existe_espacio_pin;
        Semaphore mutex_pin;
        Semaphore mutex_ensam;

    public Ensamblador(Semaphore existe_dato_camara, Semaphore existe_espacio_camara, Semaphore mutex_camara, Semaphore existe_dato_pantalla, Semaphore existe_espacio_pantalla, Semaphore mutex_pantalla, Semaphore existe_dato_boton, Semaphore existe_espacio_boton, Semaphore mutex_boton, Semaphore existe_dato_pin, Semaphore existe_espacio_pin, Semaphore mutex_pin, Semaphore mutex_ensam) {
        this.existe_dato_camara = existe_dato_camara;
        this.existe_espacio_camara = existe_espacio_camara;
        this.mutex_camara = mutex_camara;
        this.existe_dato_pantalla = existe_dato_pantalla;
        this.existe_espacio_pantalla = existe_espacio_pantalla;
        this.mutex_pantalla = mutex_pantalla;
        this.existe_dato_boton = existe_dato_boton;
        this.existe_espacio_boton = existe_espacio_boton;
        this.mutex_boton = mutex_boton;
        this.existe_dato_pin = existe_dato_pin;
        this.existe_espacio_pin = existe_espacio_pin;
        this.mutex_pin = mutex_pin;
        this.mutex_ensam= mutex_ensam;
    }
    

    @Override
    public void run() {
        while (Main.day != 30) {
                try {
                    existe_dato_boton.acquire(3);
                    existe_dato_camara.acquire(4);
                    existe_dato_pantalla.acquire(2);
                    existe_dato_pin.acquire(1);
                    mutex_boton.acquire();
                    mutex_camara.acquire();
                    mutex_pantalla.acquire();
                    mutex_pin.acquire();
                    Main.n_botones-=3;
                    Main.n_camara-=4;
                    Main.n_pantallas-=2;
                    Main.n_pin-=1;
                    mutex_ensam.acquire();
                    Main.n_celulares+=1;
                    mutex_ensam.release();
                    mutex_boton.release();
                    mutex_camara.release();
                    mutex_pantalla.release();
                    mutex_pin.release();
                    existe_espacio_boton.release(3);
                    existe_espacio_camara.release(4);
                    existe_espacio_pantalla.release(2);
                    existe_espacio_pin.release(1);
                    //System.out.println("El ensamblador " + currentThread() + "ensambló 1 Smartphone");
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Ensamblador.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        }

    }

