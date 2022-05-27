
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
        int camara;
        int pantalla;
        int boton;
        int pin;
        int id;

    public Ensamblador(Semaphore existe_dato_camara, Semaphore existe_espacio_camara, Semaphore mutex_camara, Semaphore existe_dato_pantalla, Semaphore existe_espacio_pantalla, Semaphore mutex_pantalla, Semaphore existe_dato_boton, Semaphore existe_espacio_boton, Semaphore mutex_boton, Semaphore existe_dato_pin, Semaphore existe_espacio_pin, Semaphore mutex_pin, Semaphore mutex_ensam, int camara, int pantalla, int boton, int pin, int id) {
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
        this.camara=camara;
        this.pantalla=pantalla;
        this.boton=boton;
        this.pin=pin;
        this.id=id;
    }
    

    @Override
    public void run() {
        while (maininterfaz.dias_despacho!=0) {
                try {
                    existe_dato_boton.acquire(boton);
                    mutex_boton.acquire();
                    if (id==0) {
                   maininterfaz.n_botones-=boton;
               }
               else{
                   maininterfaz.n_botones_ale-=boton;
               }
                    mutex_boton.release();
                    existe_espacio_boton.release(boton);
                    
                    
                    existe_dato_camara.acquire(camara);
                    mutex_camara.acquire();
                    if (id==0) {
                   maininterfaz.n_camara-=camara;
               }
               else{
                   maininterfaz.n_camara_ale-=camara;
               }
                    mutex_camara.release();
                    existe_espacio_camara.release(camara);
                    
                    
                    existe_dato_pantalla.acquire(pantalla);
                    mutex_pantalla.acquire();
                    if (id==0) {
                   maininterfaz.n_pantallas-=pantalla;
               }
               else{
                   maininterfaz.n_pantallas_ale-=pantalla;
               }
                    mutex_pantalla.release();
                    existe_espacio_pantalla.release(pantalla);
                    
                    
                   
                    existe_dato_pin.acquire(pin);
                    mutex_pin.acquire();
                    if (id==0) {
                   maininterfaz.n_pin-=pin;
               }
               else{
                   maininterfaz.n_pin_ale-=pin;
               }
                    mutex_boton.release();
                    existe_espacio_pin.release(pin);
                    
                
                    mutex_ensam.acquire();
                    if (id==0) {
                   maininterfaz.n_celulares+=1;
               }
               else{
                   maininterfaz.n_celulares_ale+=1;
               }
                    mutex_ensam.release();
                    
                    Thread.sleep(maininterfaz.dia_duracion*2);
              
                } catch (InterruptedException ex) {
                    Logger.getLogger(Ensamblador.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        }

    }

