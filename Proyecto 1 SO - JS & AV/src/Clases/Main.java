
package Clases;


import Clases.Productor_pin;
import Clases.Productor_pantalla;
import Clases.Productor_camara;
import Clases.Productor_botones;
import Clases.Ensamblador;

import interfaz.maininterfaz;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.concurrent.Semaphore;
/**
 *
 * @author johnd
 */
public class Main {
//    public static volatile int n_pantallas;
//    public static volatile int n_botones;
//    public static volatile int n_pin;
//    public static volatile int n_camara;
//    public static volatile int n_celulares;
//    public static volatile int day;
//    public static int max_pantallas=40;
//    public static int max_botones=45;
//    public static int max_pin=15;
//    public static int max_camara=20;
//    public static int cedula_1=4;
//    
//    
public static void main(String[] args) {
//        maininterfaz a = new maininterfaz();
//        a.setVisible(true);
//        System.out.println("Comienza ejecución");
//        Día dia= new Día();
//        
//        Semaphore existe_dato_boton= new Semaphore(0, true);
//        Semaphore existe_espacio_boton= new Semaphore(max_botones, true);
//        Semaphore mutex_boton= new Semaphore(1, true);
        
//        Productor_botones botones_1= new Productor_botones(mutex_boton, existe_dato_boton, existe_espacio_boton);
//        Productor_botones botones_2= new Productor_botones(mutex_boton, existe_dato_boton, existe_espacio_boton);
//        Productor_botones botones_3= new Productor_botones(mutex_boton, existe_dato_boton, existe_espacio_boton);
//        
//        Semaphore existe_dato_camara= new Semaphore(0, true);
//        Semaphore existe_espacio_camara= new Semaphore(max_camara, true);
//        Semaphore mutex_camara= new Semaphore(1, true);
//        
//        Productor_camara camara_1= new Productor_camara(mutex_camara, existe_dato_camara, existe_espacio_camara);
//        Productor_camara camara_2= new Productor_camara(mutex_camara, existe_dato_camara, existe_espacio_camara);
//        Productor_camara camara_3= new Productor_camara(mutex_camara, existe_dato_camara, existe_espacio_camara);
//        //Productor_camara camara_4= new Productor_camara(mutex_camara, existe_dato_camara, existe_espacio_camara);
//        
//        Semaphore existe_dato_pantalla= new Semaphore(0, true);
//        Semaphore existe_espacio_pantalla= new Semaphore(max_pantallas, true);
//        Semaphore mutex_pantalla= new Semaphore(1, true);
//        
//        Productor_pantalla pantalla_1= new Productor_pantalla(mutex_pantalla, existe_dato_pantalla, existe_espacio_pantalla);
//        Productor_pantalla pantalla_2= new Productor_pantalla(mutex_pantalla, existe_dato_pantalla, existe_espacio_pantalla);
//        Productor_pantalla pantalla_3= new Productor_pantalla(mutex_pantalla, existe_dato_pantalla, existe_espacio_pantalla);
//        
//        Semaphore existe_dato_pin= new Semaphore(0, true);
//        Semaphore existe_espacio_pin= new Semaphore(max_pin, true);
//        Semaphore mutex_pin= new Semaphore(1, true);
//        
//        Productor_pin pin_1= new Productor_pin(mutex_pin, existe_dato_pin, existe_espacio_pin);
//        Productor_pin pin_2= new Productor_pin(mutex_pin, existe_dato_pin, existe_espacio_pin);
//        Productor_pin pin_3= new Productor_pin(mutex_pin, existe_dato_pin, existe_espacio_pin);
        
//        Ensamblador ensam_1= new Ensamblador(existe_dato_camara, existe_espacio_camara, mutex_camara, existe_dato_pantalla, existe_espacio_pantalla, mutex_pantalla, existe_dato_boton, existe_espacio_boton, mutex_boton, existe_dato_pin, existe_espacio_pin, mutex_pin);
//        Ensamblador ensam_2= new Ensamblador(existe_dato_camara, existe_espacio_camara, mutex_camara, existe_dato_pantalla, existe_espacio_pantalla, mutex_pantalla, existe_dato_boton, existe_espacio_boton, mutex_boton, existe_dato_pin, existe_espacio_pin, mutex_pin);
//        
        
        
        
        
//        dia.start();
//        
//        botones_1.start();
////        botones_2.start();
////        botones_3.start();
//        
//        pantalla_1.start();
////        pantalla_2.start();
////        pantalla_3.start();
//        
//        camara_1.start();
////        camara_2.start();
////        camara_3.start();
//        //camara_4.start();
//        
//        pin_1.start();
////        pin_2.start();
////        pin_3.start();
//        
////        ensam_1.start();
////        ensam_2.start();
//        
//        while(true){
//            if (day==30) {
//                System.out.println("El número de teléfonos producido fue: " + n_celulares);
//                System.out.println("El número de pantallas restantes en almacen fue: " + n_pantallas);
//                System.out.println("El número de pines restantes en almacen fue: " + n_pin);
//                System.out.println("El número de cámaras restantes en almacen fue: " + n_camara);
//                System.out.println("El número de botones en almacen fue: " + n_botones);
//                System.out.println("");
//                System.exit(0);
//            }
//            
//            
//        }
////
//    int array []= new int[5];
//    array[0]=0;
//    array[1]=1;
//    array[2]=2;
//    
//    for (int i = 0; i < array.; i++) {
//        System.out.println(array[i]);
//    }
int n_1=5;
int n_2=24;
float resultado=n_1/n_2;
    System.out.println(resultado);
   }
}
