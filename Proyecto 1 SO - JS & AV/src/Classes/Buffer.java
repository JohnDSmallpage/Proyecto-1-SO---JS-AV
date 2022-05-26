package Classes;


import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author johnd
 */

public class Buffer {
    private Semaphore mutex= new Semaphore(1, true);
    private Semaphore existen_datos= new Semaphore(0,true);
    private Semaphore existe_espacio;
    
    //Se crearán objetos Buffer como espacio compartido para cada tipo de recurso
    public Buffer(int max_recurso){
        this.existe_espacio= new Semaphore(max_recurso, true);
    }
    
    
    public void producir(int incremento, int id){
        try {
            existe_espacio.acquire();
            mutex.acquire();
            Main.n_camara+=incremento;
            mutex.release();
            existen_datos.release();
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Buffer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void consumir(){
        try {
            mutex.acquire();
            Main.n_celulares++;
            Main.n_botones=Main.n_botones-3;
            Main.n_camara=Main.n_camara-4;
            Main.n_pantallas=Main.n_pantallas-2;
            Main.n_pin--;
            mutex.release();
        } catch (InterruptedException ex) {
            Logger.getLogger(Buffer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
