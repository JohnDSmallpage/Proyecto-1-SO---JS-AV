/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnd
 */
public class Main {
    public static volatile int n_pantallas;
    public static volatile int n_botones;
    public static volatile int n_pin;
    public static volatile int n_camara;
    public static volatile int n_celulares;
    public static volatile int day;
    public static int max_pantallas=40;
    public static int max_botones=45;
    public static int max_pin=15;
    public static int max_camara=20;
    public static int cedula_1=4;
    
    
    public static void main(String[] args) {
        System.out.println("Comienza ejecución");
        Día dia= new Día();
        
        Buffer buffer_botones= new Buffer(max_botones);
        Productor_botones botones_1= new Productor_botones(buffer_botones);
        Productor_botones botones_2= new Productor_botones(buffer_botones);
        Productor_botones botones_3= new Productor_botones(buffer_botones);
        
        
        Buffer buffer_pantallas= new Buffer(max_pantallas);
        Productor_pantalla pantalla_1= new Productor_pantalla(buffer_pantallas);
        Productor_pantalla pantalla_2= new Productor_pantalla(buffer_pantallas);
        Productor_pantalla pantalla_3= new Productor_pantalla(buffer_pantallas);
        
        
        Buffer buffer_camara= new Buffer(max_camara);
        Productor_camara camara_1= new Productor_camara(buffer_camara);
        Productor_camara camara_2= new Productor_camara(buffer_camara);
        Productor_camara camara_3= new Productor_camara(buffer_camara);
        
        
        Buffer buffer_pin= new Buffer(max_pin);
        Productor_pin pin_1= new Productor_pin(buffer_pin);
        Productor_pin pin_2= new Productor_pin(buffer_pin);
        Productor_pin pin_3= new Productor_pin(buffer_pin);
        
        
        Buffer buffer_ensamblador= new Buffer(n_celulares);
        Ensamblador ensam_1= new Ensamblador(buffer_ensamblador);
        Ensamblador ensam_2= new Ensamblador(buffer_ensamblador);
        
        
        
        dia.start();
        
        botones_1.start();
        botones_2.start();
        botones_3.start();
        
        pantalla_1.start();
        pantalla_2.start();
        pantalla_3.start();
        
        camara_1.start();
        camara_2.start();
        camara_3.start();
        
        pin_1.start();
        pin_2.start();
        pin_3.start();
        
//        ensam_1.start();
//        ensam_2.start();
        
        while(true){
            if (day==30) {
                System.out.println("El número de teléfonos producido fue: " + n_celulares);
                System.out.println("El número de pantallas restantes en almacen fue: " + n_pantallas);
                System.out.println("El número de pines restantes en almacen fue: " + n_pin);
                System.out.println("El número de cámaras restantes en almacen fue: " + n_camara);
                System.out.println("El número de botones en almacen fue: " + n_botones);
                System.exit(0);
            }
            
        }

    }
}
