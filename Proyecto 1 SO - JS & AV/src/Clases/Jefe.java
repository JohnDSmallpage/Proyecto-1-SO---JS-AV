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
    
    public Jefe(int cedula, Semaphore mutex_calendario, int id){
        this.cedula=cedula;
        this.mutex_calendario= mutex_calendario;
        this.id=id;
    }
    @Override
    public void run(){
        double duracion_jefe=((cedula+1)/24f)*maininterfaz.dia_duracion;
        duracion_jefe=Math.round(duracion_jefe);
        long duracion_jefe_l= (new Double(duracion_jefe)).longValue();
        
        while (maininterfaz.dias_despacho!=0) {            
          try {
          
            Thread.sleep(maininterfaz.dia_duracion + duracion_jefe_l);
            mutex_calendario.acquire();
          
                 maininterfaz.dias_despacho--;
                 maininterfaz.jTextField10.setText(Integer.toString(maininterfaz.dias_despacho));
                 
                 if (id==0) {
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
                     
                     maininterfaz.salario_jefe+=7;
                     maininterfaz.salario_gerente+=180;
                     
              }
                 else{
                     
                 }
                 
                 
              
              mutex_calendario.release();
              System.out.println("DIA : " + maininterfaz.dias_despacho);
              System.out.println("Salario botones: " + maininterfaz.salario_boton);
              
//              System.out.println("Salario camara: " + maininterfaz.salario_camara);
//              System.out.println("Salario pantalla: " + maininterfaz.salario_pantalla);
//              System.out.println("Salario pin: " + maininterfaz.salario_pin);
//              System.out.println("Salario gerente: " + maininterfaz.salario_gerente);
//              System.out.println("Salario jefe: " + maininterfaz.salario_jefe);
//              System.out.println("");
              }
            
              
            
            
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
        if (maininterfaz.dias_despacho==0) {
            if (maininterfaz.dias_despacho==0) {
            int salario_total=maininterfaz.salario_boton + maininterfaz.salario_camara + maininterfaz.salario_pantalla + maininterfaz.salario_pin + maininterfaz.salario_jefe + maininterfaz.salario_gerente;
            System.out.println("Gasto de la planta en salarios: " + salario_total);
        }
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
