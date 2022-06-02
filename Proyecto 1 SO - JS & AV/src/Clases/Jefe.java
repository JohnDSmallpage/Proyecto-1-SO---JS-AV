package Clases;
import java.util.concurrent.Semaphore;
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
    Semaphore mutex_calendario;
    int cedula;
    int id;
    int tiempo_juego;
    
    public Jefe(int cedula, Semaphore mutex_calendario, int id){
        this.cedula=cedula;
        this.mutex_calendario= mutex_calendario;
        this.id=id;
        this.tiempo_juego= tiempo_juego;
    }
    @Override
    public void run(){
        double duracion_jefe=((cedula+1)/24f)*maininterfaz.dia_duracion;
        duracion_jefe=Math.round(duracion_jefe);
        long duracion_jefe_l= (new Double(duracion_jefe)).longValue();
        long tiempo_restante= maininterfaz.dia_duracion-duracion_jefe_l;
        int horas_rest= 24-(cedula+1);
        double hora= (double)tiempo_restante/horas_rest;
        double clash= (double)((15+cedula)*hora)/60;
        long duracion_clash= (new Double(clash)).longValue();
        
        
        while (maininterfaz.dias_despacho>0 || maininterfaz.dias_despacho_ale>0 ) {   
            
            
            
          try {
            Thread.sleep(duracion_jefe_l);
            mutex_calendario.acquire();
          
                 
                 
                 
                 if (id==0) {
//                        System.out.println("Dia: " + maininterfaz.dias_despacho);
//                        System.out.println("botones: " + maininterfaz.n_botones);
//                        System.out.println("camara: " + maininterfaz.n_camara);
//                        System.out.println("pantallas: " + maininterfaz.n_pantallas);
//                        System.out.println("pin: " + maininterfaz.n_pin);
//                        System.out.println("celulares: " + maininterfaz.n_celulares);
//                        System.out.println("");
                     if (maininterfaz.dias_despacho!=0) {
                         maininterfaz.dias_despacho--;
                         maininterfaz.jTextField10.setText(Integer.toString(maininterfaz.dias_despacho));
                         for (int i = 0; i < maininterfaz.p_botones.length; i++) {
                         if (maininterfaz.p_botones[i]!=null) {
                             maininterfaz.salario_boton+=4;
//                             System.out.println("elemento: " + i);
                         }
                         else{
                             break;
                         }
                     }
                     
                     for (int i = 0; i < maininterfaz.p_camara.length; i++) {
                         if (maininterfaz.p_camara[i]!=null) {
                             maininterfaz.salario_camara+=5;
                         }
                         else{
                             break;
                         }
                     }
                     for (int i = 0; i < maininterfaz.p_pantalla.length; i++) {
                         if (maininterfaz.p_pantalla[i]!=null) {
                             maininterfaz.salario_pantalla+=3;
                         }
                         else{
                             break;
                         }
                     }
                     for (int i = 0; i < maininterfaz.p_pin.length; i++) {
                         if (maininterfaz.p_pin[i]!=null) {
                             maininterfaz.salario_pin+=5;
                         }
                         else{
                             break;
                         }
                     }
                     for (int i = 0; i < maininterfaz.array_ensam.length; i++) {
                         if (maininterfaz.array_ensam[i]!=null) {
                             maininterfaz.salario_ensam+=6;
                         }
                         else{
                             break;
                         }
                     }
                     
                     maininterfaz.salario_jefe+=7;
                     maininterfaz.jTextField36.setText(Integer.toString(maininterfaz.salario_jefe));
                     maininterfaz.salario_gerente+=180;
                     maininterfaz.salario_total_1=maininterfaz.salario_boton + maininterfaz.salario_camara + maininterfaz.salario_pantalla + maininterfaz.salario_pin + maininterfaz.salario_jefe + maininterfaz.salario_gerente + maininterfaz.salario_ensam;
                     maininterfaz.jTextField35.setText(Integer.toString(maininterfaz.salario_total_1));
                         
                         
    
                     
                     
                     }
                     
                     
              }
                 else{
//                     
                     if (maininterfaz.dias_despacho_ale!=0) {
                      maininterfaz.dias_despacho_ale--;
                      maininterfaz.jTextField26.setText(Integer.toString(maininterfaz.dias_despacho_ale));
                     for (int i = 0; i < maininterfaz.p_botones_ale.length; i++) {
                         if (maininterfaz.p_botones_ale[i]!=null) {
                             maininterfaz.salario_boton_ale+=4;
//                             System.out.println("elemento: " + i);
                         }
                         else{
                             break;
                         }
                     }
                     
                     for (int i = 0; i < maininterfaz.p_camara_ale.length; i++) {
                         if (maininterfaz.p_camara_ale[i]!=null) {
                             maininterfaz.salario_camara_ale+=5;
                         }
                         else{
                             break;
                         }
                     }
                     for (int i = 0; i < maininterfaz.p_pantalla_ale.length; i++) {
                         if (maininterfaz.p_pantalla_ale[i]!=null) {
                             maininterfaz.salario_pantalla_ale+=3;
                         }
                         else{
                             break;
                         }
                     }
                     for (int i = 0; i < maininterfaz.p_pin_ale.length; i++) {
                         if (maininterfaz.p_pin_ale[i]!=null) {
                             maininterfaz.salario_pin_ale+=5;
                         }
                         else{
                             break;
                         }
                     }
                      for (int i = 0; i < maininterfaz.array_ensam_ale.length; i++) {
                         if (maininterfaz.array_ensam_ale[i]!=null) {
                             maininterfaz.salario_ensam_ale+=6;
                         }
                         else{
                             break;
                         }
                     }
                     
                     maininterfaz.salario_jefe_ale+=7;
                     maininterfaz.jTextField30.setText(Integer.toString(maininterfaz.salario_jefe_ale));
                     maininterfaz.salario_gerente_ale+=180;
                     
                     maininterfaz.salario_total_2=maininterfaz.salario_boton_ale + maininterfaz.salario_camara_ale + maininterfaz.salario_pantalla_ale + maininterfaz.salario_pin_ale + maininterfaz.salario_jefe_ale + maininterfaz.salario_gerente_ale + maininterfaz.salario_ensam_ale;
                     maininterfaz.jTextField29.setText(Integer.toString(maininterfaz.salario_total_2));
                     
                     maininterfaz.jugando_ale=true;
                      maininterfaz.jTextField24.setText("Clash Royale");
                      Thread.sleep(duracion_clash);
                      maininterfaz.jugando_ale=false;
                      maininterfaz.jTextField24.setText("Trabajando");
                      if (maininterfaz.dia_pasado==false) {
                          break;
                      }
                     }       
                 }
              
              mutex_calendario.release();
              
              int duracion= maininterfaz.dia_duracion;
              long restante= duracion-duracion_jefe_l;
              
              while (restante>0 && (maininterfaz.dias_despacho>0 || maininterfaz.dias_despacho_ale>0)) {    
                  if (id==0) {
                     maininterfaz.jTextField34.setText("Clash Royale");
                  maininterfaz.jugando=true;
                  Thread.sleep(duracion_clash);
                  restante-=duracion_clash;
                  maininterfaz.jugando=false;
                  maininterfaz.jTextField34.setText("Trabajando");
                  Thread.sleep(duracion_clash);
                  System.out.println("");
                  
                  restante-=duracion_clash; 
                  }
                  else{
                  maininterfaz.jTextField24.setText("Clash Royale");
                  maininterfaz.jugando_ale=true;
                  Thread.sleep(duracion_clash);
                  restante-=duracion_clash;
                  
                  
                  maininterfaz.jugando_ale=false;
                  maininterfaz.jTextField24.setText("Trabajando");
                  Thread.sleep(duracion_clash);
                  System.out.println("");
                  
                  restante-=duracion_clash; 
                  }
                  
              }
              
                   
              }
//              System.out.println("DIA : " + maininterfaz.dias_despacho);
//              System.out.println("Salario botones: " + maininterfaz.salario_boton);
//              
//              System.out.println("Salario camara: " + maininterfaz.salario_camara);
//              System.out.println("Salario pantalla: " + maininterfaz.salario_pantalla);
//              System.out.println("Salario pin: " + maininterfaz.salario_pin);
//              System.out.println("Salario gerente: " + maininterfaz.salario_gerente);
//              System.out.println("Salario jefe: " + maininterfaz.salario_jefe);
//              System.out.println("Salario ensamblador john: " + maininterfaz.salario_ensam);
//              System.out.println("");
//              
//              System.out.println("DIA ale: " + maininterfaz.dias_despacho_ale);
//              
//               System.out.println("Salario botones: " + maininterfaz.salario_boton_ale);
//              System.out.println("Salario camara: " + maininterfaz.salario_camara_ale);
//              System.out.println("Salario pantalla: " + maininterfaz.salario_pantalla_ale);
//              System.out.println("Salario pin: " + maininterfaz.salario_pin_ale);
//              System.out.println("Salario gerente: " + maininterfaz.salario_gerente_ale);
//              System.out.println("Salario jefe: " + maininterfaz.salario_jefe_ale);
//              System.out.println("Salario ensamblador ale: " + maininterfaz.salario_ensam_ale);
//              System.out.println("");
              
          
            
              
            
            
            catch (InterruptedException ex) {
            Logger.getLogger(Día.class.getName()).log(Level.SEVERE, null, ex);
        }
//              System.out.println("Dia " + i);
//              i--;
//            System.out.println("hay: " + maininterfaz.n_botones_ale + " botones");
//                    System.out.println("hay: " + maininterfaz.n_pantallas_ale + " pantallas");
//                    System.out.println("hay: " + maininterfaz.n_camara_ale + " camaras");
//                    System.out.println("hay: " + maininterfaz.n_pin_ale + " pines");
//                    System.out.println("hay: " + maininterfaz.n_celulares_ale + " celulares");
//                    System.out.println("");
//              
           
        }
        
        
    }
    
    public static long duracion_dia_real(int cedula){
        double duracion_jefe=((cedula+1)/24f)*maininterfaz.dia_duracion;
        duracion_jefe=Math.round(duracion_jefe);
        long duracion_jefe_l= (new Double(duracion_jefe)).longValue();
        long duracion= maininterfaz.dia_duracion + duracion_jefe_l;
        return duracion;
    }
}
