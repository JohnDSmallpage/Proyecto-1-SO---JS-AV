/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;


import Clases.Funciones;

import java.util.concurrent.Semaphore;

import java.awt.Graphics;
import java.awt.Image;
import java.io.FileReader;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import Clases.*;
import javax.swing.JOptionPane;

/**
 *
 * @author aleja
 */
public class maininterfaz extends javax.swing.JFrame {
    
    
    /**
     * Creates new form NewJFrame
     */
    
    //FondoPanel fondo = new FondoPanel();
    //private ImageIcon imagen;
   // private Icon icono;
    
    public static volatile int n_pantallas;
    public static volatile int n_botones;
    public static volatile int n_pin;
    public static volatile int n_camara;
    public static volatile int n_celulares;
    public static volatile int dias_despacho;
    public static volatile int dias_despacho_ale;
    public static volatile int n_pantallas_ale;
    public static volatile int n_botones_ale;
    public static volatile int n_pin_ale;
    public static volatile int n_camara_ale;
    public static volatile int n_celulares_ale;
    public static int dia_duracion;
    public static int max_pantallas;
    public static int max_botones;
    public static int max_pin;
    public static int max_camara;
    public static int ci_john;
    public static int ci_ale;
    public static int dia;
    public static boolean start;
    private static Semaphore dato_boton;
    private static Semaphore espacio_boton;
    private static Semaphore mutex_boton;
    private static Semaphore dato_camara;
    private static Semaphore espacio_camara;
    private static Semaphore mutex_camara;
    private static Semaphore dato_pantalla;
    private static Semaphore espacio_pantalla;
    private static Semaphore mutex_pantalla;
    private static Semaphore dato_pin;
    private static Semaphore espacio_pin;
    private static Semaphore mutex_pin;
    private static Semaphore dato_boton_ale;
    private static Semaphore espacio_boton_ale;
    private static Semaphore mutex_boton_ale;
    private static Semaphore dato_camara_ale;
    private static Semaphore espacio_camara_ale;
    private static Semaphore mutex_camara_ale;
    private static Semaphore dato_pantalla_ale;
    private static Semaphore espacio_pantalla_ale;
    private static Semaphore mutex_pantalla_ale;
    private static Semaphore dato_pin_ale;
    private static Semaphore espacio_pin_ale;
    private static Semaphore mutex_pin_ale;
    private static Semaphore mutex_ensam;
    private static Semaphore mutex_ensam_ale;
    private static Semaphore mutex_jefe;
    private static Semaphore mutex_jefe_ale;
    public static Funciones txt;
    public static String info [];
    public static Productor_botones p_botones [];
    public static Productor_camara p_camara [];
    public static Productor_pantalla p_pantalla [];
    public static Productor_pin p_pin [];
    public static Ensamblador array_ensam [];
    public static Productor_botones p_botones_ale [];
    public static Productor_camara p_camara_ale [];
    public static Productor_pantalla p_pantalla_ale [];
    public static Productor_pin p_pin_ale [];
    public static Ensamblador array_ensam_ale [];
    public static int salario_boton;
    public static int salario_camara;
    public static int salario_pantalla;
    public static int salario_pin;
    public static int salario_ensam;
    public static int salario_jefe;
    public static int salario_gerente;
    public static int salario_boton_ale;
    public static int salario_camara_ale;
    public static int salario_pantalla_ale;
    public static int salario_pin_ale;
    public static int salario_ensam_ale;
    public static int salario_jefe_ale;
    public static int salario_gerente_ale;
    public static long duracion_1;
    public static long duracion_2;
    
    public maininterfaz() {
        initComponents();
        this.setResizable(false);
        this.setVisible(true);
        this.setSize(800,700);
        this.setLocationRelativeTo(null);
        Funciones txt= new Funciones();
        String info []= txt.leerCSV();

        //Se lee txt y se crea objeto txt
        //Variables dinámicas
        this.n_pantallas=0;
        this.n_botones= 0;
        this.n_pin= 0;
        this.n_camara= 0;
        this.n_celulares= 0;
        this.n_pantallas_ale= 0;
        this.n_botones_ale= 0;
        this.n_pin_ale= 0;
        this.n_camara_ale= 0;
        this.n_celulares_ale=0;
        this.dia_duracion= Integer.parseInt(info[0]);
        this.start=false;
        this.info=info;
        
        
        this.salario_boton=0;
        this.salario_camara=0;
        this.salario_pantalla=0;
        this.salario_pin=0;
        this.salario_jefe=0;
        this.salario_gerente=0;
        this.salario_boton_ale=0;
        this.salario_camara_ale=0;
        this.salario_pantalla_ale=0;
        this.salario_pin_ale=0;
        this.salario_jefe_ale=0;
        this.salario_gerente_ale=0;
        this.salario_ensam= 0;
        this.salario_ensam_ale=0;
        
        this.dato_boton=dato_boton;
        this.espacio_boton=espacio_boton;
        this.mutex_boton=mutex_boton;
        this.dato_camara=dato_camara;
        this.espacio_camara= espacio_camara;
        this.mutex_camara=mutex_camara;
        this.dato_pantalla=dato_pantalla;
        this.espacio_pantalla= espacio_pantalla;
        this.mutex_pantalla=mutex_pantalla;
        this.dato_pin=dato_pin;
        this.espacio_pin= espacio_pin;
        this.mutex_pin=mutex_pin;
        this.dato_boton_ale=dato_boton_ale;
        this.espacio_boton_ale=espacio_boton_ale;
        this.mutex_boton_ale=mutex_boton_ale;
        this.dato_camara_ale=dato_camara_ale;
        this.espacio_camara_ale= espacio_camara_ale;
        this.mutex_camara_ale=mutex_camara_ale;
        this.dato_pantalla_ale=dato_pantalla_ale;
        this.espacio_pantalla_ale= espacio_pantalla_ale;
        this.mutex_pantalla_ale=mutex_pantalla_ale;
        this.dato_pin_ale=dato_pin_ale;
        this.espacio_pin_ale= espacio_pin_ale;
        this.mutex_pin_ale=mutex_pin_ale;
        this.mutex_ensam= mutex_ensam;
        this.mutex_ensam_ale= mutex_ensam_ale;
        this.mutex_jefe= mutex_jefe;
        this.mutex_jefe_ale= mutex_jefe_ale;
        
        //Variables estáticos
        this.max_pantallas= Integer.parseInt(info[2]);
        this.max_botones= Integer.parseInt(info[3]);
        this.max_pin= Integer.parseInt(info[4]);
        this.max_camara= Integer.parseInt(info[5]);
        this.ci_john= 4;
        this.ci_ale= 5;
        this.duracion_1=Jefe.duracion_dia_real(ci_john);
        this.duracion_2=Jefe.duracion_dia_real(ci_ale);
        this.dias_despacho= Integer.parseInt(info[1]); 
        this.dias_despacho_ale= Integer.parseInt(info[1]);
        
        //Semáforos
        //John
        ////botón
        this.dato_boton= new Semaphore(0,true);
        this.espacio_boton= new Semaphore(max_botones, true);
        this.mutex_boton= new Semaphore(1, true);
        
        ////camara
        this.dato_camara= new Semaphore(0, true);
        this.espacio_camara= new Semaphore(max_camara, true);
        this.mutex_camara= new Semaphore(1, true);
        
        ////pantalla
        this.dato_pantalla= new Semaphore(0, true);
        this.espacio_pantalla= new Semaphore(max_pantallas, true);
        this.mutex_pantalla= new Semaphore(1, true);
        
        ////pin
        this.dato_pin= new Semaphore(0, true);
        this.espacio_pin= new Semaphore(max_pin, true);
        this.mutex_pin= new Semaphore(1, true);
        
        ////ensam
        this.mutex_ensam= new Semaphore(1,true);
        
        ////ensam ale
        this.mutex_ensam_ale= new Semaphore(1,true);
        
        //Ale
        
        this.dato_boton_ale= new Semaphore(0, true);
        this.espacio_boton_ale= new Semaphore(max_botones, true);
        this.mutex_boton_ale= new Semaphore(1, true);
        
        ////camara
        this.dato_camara_ale= new Semaphore(0, true);
        this.espacio_camara_ale= new Semaphore(max_camara, true);
        this.mutex_camara_ale= new Semaphore(1, true);
        
        ////pantalla
        this.dato_pantalla_ale= new Semaphore(0, true);
        this.espacio_pantalla_ale= new Semaphore(max_pantallas, true);
        this.mutex_pantalla_ale= new Semaphore(1, true);
        
        ////pin
        this.dato_pin_ale= new Semaphore(0, true);
        this.espacio_pin_ale= new Semaphore(max_pin, true);
        this.mutex_pin_ale= new Semaphore(1, true);
        
        //jefes
        this.mutex_jefe= new Semaphore(1, true);
        this.mutex_jefe_ale= new Semaphore(1, true);
        
       
        this.p_botones= new Productor_botones[ci_ale+10];
        this.p_camara= new Productor_camara[ci_ale+10];
        this.p_pantalla= new Productor_pantalla[ci_ale+10];
        this.p_pin= new Productor_pin[ci_ale+10];
        this.p_botones_ale= new Productor_botones[ci_ale+10];
        this.p_camara_ale= new Productor_camara[ci_ale+10];
        this.p_pantalla_ale= new Productor_pantalla[ci_ale+10];
        this.p_pin_ale= new Productor_pin[ci_ale+10];
        this.array_ensam= new Ensamblador[ci_ale+10];
        this.array_ensam_ale= new Ensamblador[ci_ale+10];
       
        
        
        //Asignación de valores en la interfaz
        ////Productos John
        jTextField1.setText(Integer.toString(n_pantallas));
        jTextField2.setText(Integer.toString(n_botones));
        jTextField4.setText(Integer.toString(n_pin));
        jTextField3.setText(Integer.toString(n_camara));
        
        ////Productos Ale
        jTextField14.setText(Integer.toString(n_pantallas_ale));
        jTextField15.setText(Integer.toString(n_botones_ale));
        jTextField17.setText(Integer.toString(n_pin_ale));
        jTextField16.setText(Integer.toString(n_camara_ale));
        
        ////Productor y ensamblador John
        jTextField5.setText(info[6]);
        jTextField6.setText(info[7]);
        jTextField7.setText(info[8]);
        jTextField8.setText(info[9]);
        jTextField9.setText(info[10]);
        
        
        ////Productor y ensamblador Ale
        jTextField18.setText(info[11]);
        jTextField19.setText(info[12]);
        jTextField20.setText(info[13]);
        jTextField21.setText(info[14]);
        jTextField22.setText(info[15]);
        
        //Nro de teléfonos ensamblados 
        jTextField11.setText(Integer.toString(n_celulares));
        jTextField25.setText(Integer.toString(n_celulares_ale));
        
        //Día
        jTextField10.setText(Integer.toString(dias_despacho));
        
        //Inicialización del contador Jefe
        
        
        
        //this.setContentPane(fondo);
        //this.pintarImagen(this.jblImagen1,"/iterfazimg/logo.png");
        
        for (int i = 0; i < Integer.parseInt(maininterfaz.info[7]); i++) {
            int produccion_boton=2;
            Productor_botones hilo_boton= new Productor_botones(mutex_boton, dato_boton, espacio_boton, produccion_boton, 0, duracion_1);
            p_botones[i]=hilo_boton;
            
        }
        
        
        for (int i = 0; i < Integer.parseInt(info[9]); i++) {
            int dia_john=2;
            Productor_camara hilo_camara= new Productor_camara(mutex_camara, dato_camara, espacio_camara, dia_john, 0, duracion_1);
            p_camara[i]=hilo_camara;
            
        }
        
        
        for (int i = 0; i < Integer.parseInt(info[6]); i++) {
            Productor_pantalla hilo_pantalla= new Productor_pantalla(mutex_pantalla, dato_pantalla, espacio_pantalla, 0, duracion_1);
            p_pantalla[i]=hilo_pantalla;
            
        }
        
        
        for (int i = 0; i < Integer.parseInt(info[8]); i++) {
            Productor_pin hilo_pin= new Productor_pin(mutex_pin, dato_pin, espacio_pin, 0, duracion_1);
            p_pin[i]=hilo_pin;
            
        }
        
        int camara=4;
        int pantalla=2;
        int boton=3;
        int pin=1;
        for (int i = 0; i < Integer.parseInt(info[10]); i++) {
            Ensamblador hilo_ensam= new Ensamblador(dato_camara, espacio_camara, mutex_camara, dato_pantalla, espacio_pantalla, mutex_pantalla, dato_boton, espacio_boton, mutex_boton, dato_pin, espacio_pin, mutex_pin, mutex_ensam, camara, pantalla, boton, pin, 0, duracion_1);
            array_ensam[i]=hilo_ensam;
            
        }
        
        
        
        //Aqui con txt se deberían llenar las colas para luego más abajo con el size de las colas representarlo en los jTextfields
        
        //Ale
        
                for (int i = 0; i < Integer.parseInt(info[12]); i++) {
            int produccion_boton_ale=2;
            Productor_botones hilo_boton= new Productor_botones(mutex_boton_ale, dato_boton_ale, espacio_boton_ale, produccion_boton_ale, 1, duracion_2);
            p_botones_ale[i]=hilo_boton;
            
        }
        
        
        for (int i = 0; i < Integer.parseInt(info[14]); i++) {
            int dia_ale= 3;
            Productor_camara hilo_camara= new Productor_camara(mutex_camara_ale, dato_camara_ale, espacio_camara_ale, dia_ale, 1, duracion_2);
            p_camara_ale[i]=hilo_camara;
            
        }
        
        
        for (int i = 0; i < Integer.parseInt(info[11]); i++) {
            Productor_pantalla hilo_pantalla= new Productor_pantalla(mutex_pantalla_ale, dato_pantalla_ale, espacio_pantalla_ale, 1, duracion_2);
            p_pantalla_ale[i]=hilo_pantalla;
            
        }
        
        
        for (int i = 0; i < Integer.parseInt(info[13]); i++) {
            Productor_pin hilo_pin= new Productor_pin(mutex_pin_ale, dato_pin_ale, espacio_pin_ale, 1, duracion_2);
            p_pin_ale[i]=hilo_pin;
           
        }
        
       
        int camara_ale=4;
        int pantalla_ale=1;
        int boton_ale=3;
        int pin_ale=1;
        for (int i = 0; i < Integer.parseInt(info[15]); i++) {
            Ensamblador hilo_ensam= new Ensamblador(dato_camara_ale, espacio_camara_ale, mutex_camara_ale, dato_pantalla_ale, espacio_pantalla_ale, mutex_pantalla_ale, dato_boton_ale, espacio_boton_ale, mutex_boton_ale, dato_pin_ale, espacio_pin_ale, mutex_pin_ale, mutex_ensam_ale, camara_ale, pantalla_ale, boton_ale, pin_ale, 1, duracion_2);
            array_ensam_ale[i]=hilo_ensam;
            
        }

        
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jButton24 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jTextField10 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jPanel17 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jPanel18 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jPanel19 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        BOTONES = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jPanel22 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jPanel23 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jPanel24 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jButton23 = new javax.swing.JButton();
        jPanel25 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jPanel26 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jTextField25 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Franklin Gothic Book", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PRODUCTOS:");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Franklin Gothic Book", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PANTALLAS:");

        jTextField1.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel8.setBackground(new java.awt.Color(0, 0, 0));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Franklin Gothic Book", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("BOTONES:");

        jTextField2.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel9.setBackground(new java.awt.Color(0, 0, 0));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Franklin Gothic Book", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CÁMARAS:");

        jTextField3.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel10.setBackground(new java.awt.Color(0, 0, 0));

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Franklin Gothic Book", 1, 8)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("PINES DE CARGA:");

        jTextField4.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField4)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Franklin Gothic Book", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("PRODUCTORES:");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel5.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Franklin Gothic Book", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("PANTALLAS:");

        jTextField5.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jButton2.setText("-");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("-");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Franklin Gothic Book", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("BOTONES");

        jTextField6.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jButton4.setText("+");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("+");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("-");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Franklin Gothic Book", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("CÁMARAS");

        jTextField7.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel11.setBackground(new java.awt.Color(0, 0, 0));

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Franklin Gothic Book", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("PINES");

        jTextField8.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jButton7.setText("-");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("+");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("-");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jPanel12.setBackground(new java.awt.Color(0, 0, 0));

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Franklin Gothic Book", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("ENSAM");

        jTextField9.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(jTextField9)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jButton10.setText("+");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel18.setBackground(new java.awt.Color(0, 0, 0));
        jLabel18.setFont(new java.awt.Font("Franklin Gothic Book", 1, 12)); // NOI18N
        jLabel18.setText("GERENTE:");

        jLabel19.setBackground(new java.awt.Color(0, 0, 0));
        jLabel19.setFont(new java.awt.Font("Franklin Gothic Book", 1, 12)); // NOI18N
        jLabel19.setText("JEFE:");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setFont(new java.awt.Font("Franklin Gothic Book", 1, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("TELÉFONOS:");
        jLabel16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel16.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jTextField11.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton24.setText("+");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                                        .addComponent(jButton6)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addComponent(jButton3)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                                        .addComponent(jButton2)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jButton24)
                                                        .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING))
                                                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING)))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addComponent(jButton7)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addComponent(jButton9)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jButton10)
                                                    .addComponent(jButton8))))
                                        .addGap(34, 34, 34)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(7, 7, 7)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 350, 530));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("DÍA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 30, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("PRODUCCIÓN TELÉFONOS ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        jButton11.setText("jButton11");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, 70));

        jButton12.setText("jButton11");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 70));

        jButton13.setText("jButton11");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, 70));

        jTextField10.setEditable(false);
        jTextField10.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 100, 40));

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel15.setText("PRODUCCIÓN TELÉFONOS ");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, -1, -1));

        jPanel15.setBackground(new java.awt.Color(204, 204, 204));

        jLabel20.setBackground(new java.awt.Color(0, 0, 0));
        jLabel20.setFont(new java.awt.Font("Franklin Gothic Book", 1, 18)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("PRODUCTOS:");
        jLabel20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel20.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jPanel16.setBackground(new java.awt.Color(0, 0, 0));

        jLabel21.setBackground(new java.awt.Color(0, 0, 0));
        jLabel21.setFont(new java.awt.Font("Franklin Gothic Book", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("PANTALLAS:");

        jTextField14.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField14, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel17.setBackground(new java.awt.Color(0, 0, 0));

        jLabel22.setBackground(new java.awt.Color(0, 0, 0));
        jLabel22.setFont(new java.awt.Font("Franklin Gothic Book", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("BOTONES:");

        jTextField15.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField15, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel18.setBackground(new java.awt.Color(0, 0, 0));

        jLabel23.setBackground(new java.awt.Color(0, 0, 0));
        jLabel23.setFont(new java.awt.Font("Franklin Gothic Book", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("CÁMARAS:");

        jTextField16.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField16)
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel19.setBackground(new java.awt.Color(0, 0, 0));

        jLabel24.setBackground(new java.awt.Color(0, 0, 0));
        jLabel24.setFont(new java.awt.Font("Franklin Gothic Book", 1, 8)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("PINES DE CARGA:");

        jTextField17.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jTextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField17))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jLabel25.setBackground(new java.awt.Color(0, 0, 0));
        jLabel25.setFont(new java.awt.Font("Franklin Gothic Book", 1, 18)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("PRODUCTORES:");
        jLabel25.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel25.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jPanel20.setBackground(new java.awt.Color(0, 0, 0));

        jLabel26.setBackground(new java.awt.Color(0, 0, 0));
        jLabel26.setFont(new java.awt.Font("Franklin Gothic Book", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("PANTALLAS:");

        jTextField18.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jTextField18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField18ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel26)
                .addGap(18, 18, 18)
                .addComponent(jTextField18, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jButton14.setText("+");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setText("-");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setText("-");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jPanel21.setBackground(new java.awt.Color(0, 0, 0));

        BOTONES.setBackground(new java.awt.Color(0, 0, 0));
        BOTONES.setFont(new java.awt.Font("Franklin Gothic Book", 1, 12)); // NOI18N
        BOTONES.setForeground(new java.awt.Color(255, 255, 255));
        BOTONES.setText("BOTONES");

        jTextField19.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jTextField19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField19ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(BOTONES)
                .addGap(18, 18, 18)
                .addComponent(jTextField19)
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BOTONES, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jButton17.setText("+");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setText("+");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setText("-");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jPanel22.setBackground(new java.awt.Color(0, 0, 0));

        jLabel28.setBackground(new java.awt.Color(0, 0, 0));
        jLabel28.setFont(new java.awt.Font("Franklin Gothic Book", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("CÁMARAS");

        jTextField20.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jTextField20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField20ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel28)
                .addGap(18, 18, 18)
                .addComponent(jTextField20)
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel23.setBackground(new java.awt.Color(0, 0, 0));

        jLabel29.setBackground(new java.awt.Color(0, 0, 0));
        jLabel29.setFont(new java.awt.Font("Franklin Gothic Book", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("PINES");

        jTextField21.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jTextField21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField21ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel29)
                .addGap(18, 18, 18)
                .addComponent(jTextField21)
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jButton20.setText("-");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton21.setText("+");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setText("-");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jPanel24.setBackground(new java.awt.Color(0, 0, 0));

        jLabel30.setBackground(new java.awt.Color(0, 0, 0));
        jLabel30.setFont(new java.awt.Font("Franklin Gothic Book", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("ENSAM");

        jTextField22.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jTextField22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField22ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel30)
                .addGap(18, 18, 18)
                .addComponent(jTextField22)
                .addContainerGap())
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jButton23.setText("+");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jLabel31.setBackground(new java.awt.Color(0, 0, 0));
        jLabel31.setFont(new java.awt.Font("Franklin Gothic Book", 1, 12)); // NOI18N
        jLabel31.setText("GERENTE:");

        jLabel32.setBackground(new java.awt.Color(0, 0, 0));
        jLabel32.setFont(new java.awt.Font("Franklin Gothic Book", 1, 12)); // NOI18N
        jLabel32.setText("JEFE:");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        jLabel33.setBackground(new java.awt.Color(0, 0, 0));
        jLabel33.setFont(new java.awt.Font("Franklin Gothic Book", 1, 18)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("TELÉFONOS:");
        jLabel33.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel33.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jTextField25.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jTextField25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField25ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33)
                    .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel15Layout.createSequentialGroup()
                                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel15Layout.createSequentialGroup()
                                                .addComponent(jButton22)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel15Layout.createSequentialGroup()
                                                .addComponent(jButton20)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel15Layout.createSequentialGroup()
                                                .addComponent(jButton19)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(jPanel15Layout.createSequentialGroup()
                                                .addComponent(jButton16)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel15Layout.createSequentialGroup()
                                                .addComponent(jButton15)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel15Layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jButton14)
                                                            .addComponent(jButton17, javax.swing.GroupLayout.Alignment.TRAILING)))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                                                        .addGap(2, 2, 2)
                                                        .addComponent(jButton18)))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jButton21)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton23)))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(7, 7, 7)
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, -1, 530));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfazimg/Diseño sin título (5).png"))); // NOI18N
        jLabel17.setText("jLabel17");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        start=true;
        Jefe jefe = new Jefe(ci_john, mutex_jefe, 0);
        Jefe jefe_ale= new Jefe(ci_ale, mutex_jefe_ale, 1);
        jefe.start();
        jefe_ale.start();
        
        //Arrays
        ////John
        for (int i = 0; i < p_botones.length; i++) {
            if (p_botones[i]!=null) {
                p_botones[i].start();
            }
        }
        
      for (int i = 0; i < p_camara.length; i++) {
            if (p_camara[i]!=null) {
                p_camara[i].start();
            }
        }
      
        for (int i = 0; i < p_pantalla.length; i++) {
            if (p_pantalla[i]!=null) {
                p_pantalla[i].start();
            }
        }
//        
       for (int i = 0; i < p_pin.length; i++) {
            if (p_pin[i]!=null) {
                p_pin[i].start();
            }
        }
        
        for (int i = 0; i < array_ensam.length; i++) {
            if (array_ensam[i]!=null) {
                array_ensam[i].start();
            }
        }
        
        
//        //Aqui con txt se deberían llenar las colas para luego más abajo con el size de las colas representarlo en los jTextfields
//        
//        //Ale
       for (int i = 0; i < p_botones_ale.length; i++) {
            if (p_botones_ale[i]!=null) {
                p_botones_ale[i].start();
            }
        }
        
      for (int i = 0; i < p_camara_ale.length; i++) {
            if (p_camara_ale[i]!=null) {
                p_camara_ale[i].start();
            }
        }
//        
        for (int i = 0; i < p_pantalla_ale.length; i++) {
            if (p_pantalla_ale[i]!=null) {
                p_pantalla_ale[i].start();
            }
        }
//        
       for (int i = 0; i < p_pin_ale.length; i++) {
            if (p_pin_ale[i]!=null) {
                p_pin_ale[i].start();
            }
        }
        
        for (int i = 0; i < array_ensam_ale.length; i++) {
            if (array_ensam_ale[i]!=null) {
                array_ensam_ale[i].start();
            }
        }
        
//        while (dias_despacho!=0) {            
//            System.out.println("Dia: " + dias_despacho);
//            System.out.println("Salario botones: " + salario_boton);
//            System.out.println("Salario camara: " + salario_camara);
//            System.out.println("Salario pantalla: " + salario_pantalla);
//            System.out.println("Salario pines: " + salario_pin);
//            System.out.println("Salario jefe: " + salario_jefe);
//            System.out.println("Salario gerente: " + salario_gerente);
//            System.out.println("");
//        }
        
        
        
        
        
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        int suma_john=Integer.parseInt(jTextField5.getText()) + Integer.parseInt(jTextField6.getText()) + Integer.parseInt(jTextField7.getText()) + Integer.parseInt(jTextField8.getText()) + Integer.parseInt(jTextField9.getText()) + 1 ;
            if (suma_john==15) {
                JOptionPane.showMessageDialog(null, "El número de Productores y Ensambladores para la Planta 1 no puede ser mayor a 14");
                return;
            }
        String valor= jTextField9.getText();
        int entero= Integer.parseInt(valor);
        entero++;
        valor= Integer.toString(entero);
        jTextField9.setText(valor);
        int camara=4;
        int pantalla=2;
        int boton=3;
        int pin=1;
        if (start==false) {
            
            Ensamblador hilo_ensam= new Ensamblador(dato_camara, espacio_camara, mutex_camara, dato_pantalla, espacio_pantalla, mutex_pantalla, dato_boton, espacio_boton, mutex_boton, dato_pin, espacio_pin, mutex_pin, mutex_ensam, camara, pantalla, boton, pin, 0, duracion_1);
            for (int i = 0; i < array_ensam.length; i++) {
                if (array_ensam[i]==null) {
                    array_ensam[i]=hilo_ensam;
                    break;
                }
            }
        }
        else{
            Ensamblador hilo_ensam= new Ensamblador(dato_camara, espacio_camara, mutex_camara, dato_pantalla, espacio_pantalla, mutex_pantalla, dato_boton, espacio_boton, mutex_boton, dato_pin, espacio_pin, mutex_pin, mutex_ensam, camara, pantalla, boton, pin, 0, duracion_1);
            for (int i = 0; i < array_ensam.length; i++) {
                if (array_ensam[i]==null) {
                    array_ensam[i]=hilo_ensam;
                    break;
                }
            }
            hilo_ensam.start();
            
        }
        
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        int suma_john=Integer.parseInt(jTextField9.getText()) - 1 ;
            if (suma_john==0) {
                JOptionPane.showMessageDialog(null, "El número empleados Productores o Ensambladores de cualquier tipo no puede ser menor que 1, ya que se despediría al Gerente");
                return;
            }
        String valor= jTextField9.getText();
        int entero= Integer.parseInt(valor);
        entero--;
        valor= Integer.toString(entero);
        jTextField9.setText(valor);
        if (start==false) {
            
            for (int i = 0; i < array_ensam.length; i++) {
                if (array_ensam[i]==null) {
                    array_ensam[i-1]=null;
                    break;
                }
            }
        }
        else{
            for (int i = 0; i < array_ensam.length; i++) {
                if (array_ensam[i]==null) {
                    array_ensam[i-1].stop();
                    array_ensam[i-1]=null;
                    break;
                }
            }
            
        }
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        int suma_john=Integer.parseInt(jTextField5.getText()) + Integer.parseInt(jTextField6.getText()) + Integer.parseInt(jTextField7.getText()) + Integer.parseInt(jTextField8.getText()) + Integer.parseInt(jTextField9.getText()) + 1 ;
            if (suma_john==15) {
                JOptionPane.showMessageDialog(null, "El número de Productores y Ensambladores para la Planta 1 no puede ser mayor a 14");
                return;
            }
        String valor= jTextField8.getText();
        int entero= Integer.parseInt(valor);
        entero++;
        valor= Integer.toString(entero);
        jTextField8.setText(valor);
        if (start==false) {
            
            Productor_pin hilo_pin= new Productor_pin(mutex_pin, dato_pin, espacio_pin, 0, duracion_1);
            for (int i = 0; i < p_pin.length; i++) {
                if (p_pin[i]==null) {
                    p_pin[i]=hilo_pin;
                    break;
                }
            }
        }
        else{
            Productor_pin hilo_pin= new Productor_pin(mutex_pin, dato_pin, espacio_pin, 0, duracion_1);
            for (int i = 0; i < p_pin.length; i++) {
                if (p_pin[i]==null) {
                    p_pin[i]=hilo_pin;
                    break;
                }
            }
            hilo_pin.start();
            
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        int suma_john=Integer.parseInt(jTextField8.getText()) - 1 ;
            if (suma_john==0) {
                JOptionPane.showMessageDialog(null, "El número empleados Productores o Ensambladores de cualquier tipo no puede ser menor que 1, ya que se despediría al Gerente");
                return;
            }
        String valor= jTextField8.getText();
        int entero= Integer.parseInt(valor);
        entero--;
        valor= Integer.toString(entero);
        jTextField8.setText(valor);
        if (start==false) {
            
            for (int i = 0; i < p_pin.length; i++) {
                if (p_pin[i]==null) {
                    p_pin[i-1]=null;
                    break;
                }
            }
        }
        else{
            for (int i = 0; i < p_pin.length; i++) {
                if (p_pin[i]==null) {
                    p_pin[i-1].stop();
                    p_pin[i-1]=null;
                    break;
                }
            }
            
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        int suma_john=Integer.parseInt(jTextField7.getText()) - 1 ;
            if (suma_john==0) {
                JOptionPane.showMessageDialog(null, "El número empleados Productores o Ensambladores de cualquier tipo no puede ser menor que 1, ya que se despediría al Gerente");
                return;
            }
        String valor= jTextField7.getText();
        int entero= Integer.parseInt(valor);
        entero--;
        valor= Integer.toString(entero);
        jTextField7.setText(valor);
        if (start==false) {
            
            for (int i = 0; i < p_camara.length; i++) {
                if (p_camara[i]==null) {
                    p_camara[i-1]=null;
                    break;
                }
            }
        }
        else{
            for (int i = 0; i < p_camara.length; i++) {
                if (p_camara[i]==null) {
                    p_camara[i-1].stop();
                    p_camara[i-1]=null;
                    break;
                }
            }
            
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        int suma_john=Integer.parseInt(jTextField5.getText()) + Integer.parseInt(jTextField6.getText()) + Integer.parseInt(jTextField7.getText()) + Integer.parseInt(jTextField8.getText()) + Integer.parseInt(jTextField9.getText()) + 1 ;
            if (suma_john==15) {
                JOptionPane.showMessageDialog(null, "El número de Productores y Ensambladores para la Planta 1 no puede ser mayor a 14");
                return;
            }
        int dia_john=2;
        String valor= jTextField7.getText();
        int entero= Integer.parseInt(valor);
        entero++;
        valor= Integer.toString(entero);
        jTextField7.setText(valor);
        if (start==false) {
            
            Productor_camara hilo_camara= new Productor_camara(mutex_camara, dato_camara, espacio_camara, dia_john, 0, duracion_1);
            for (int i = 0; i < p_camara.length; i++) {
                if (p_camara[i]==null) {
                    p_camara[i]=hilo_camara;
                    break;
                }
            }
        }
        else{
            Productor_camara hilo_camara= new Productor_camara(mutex_camara, dato_camara, espacio_camara, dia_john, 0, duracion_1);
            for (int i = 0; i < p_camara.length; i++) {
                if (p_camara[i]==null) {
                    p_camara[i]=hilo_camara;
                    break;
                }
            }
            hilo_camara.start();
            
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int suma_john=Integer.parseInt(jTextField5.getText()) + Integer.parseInt(jTextField6.getText()) + Integer.parseInt(jTextField7.getText()) + Integer.parseInt(jTextField8.getText()) + Integer.parseInt(jTextField9.getText()) + 1 ;
            if (suma_john==15) {
                JOptionPane.showMessageDialog(null, "El número de Productores y Ensambladores para la Planta 1 no puede ser mayor a 14");
                return;
            }
        int produccion_boton=2;
        String valor= jTextField6.getText();
        int entero= Integer.parseInt(valor);
        entero++;
        valor= Integer.toString(entero);
        jTextField6.setText(valor);
        if (start==false) {
            
            Productor_botones hilo_boton= new Productor_botones(mutex_boton, dato_boton, espacio_boton, produccion_boton, 0, duracion_1);
            for (int i = 0; i < p_botones.length; i++) {
                if (p_botones[i]==null) {
                    p_botones[i]=hilo_boton;
                    break;
                }
            }
        }
        else{
            Productor_botones hilo_boton= new Productor_botones(mutex_boton, dato_boton, espacio_boton, produccion_boton, 0, duracion_1);
            for (int i = 0; i < p_botones.length; i++) {
                if (p_botones[i]==null) {
                    p_botones[i]=hilo_boton;
                    break;
                }
            }
            hilo_boton.start();
            
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int suma_john=Integer.parseInt(jTextField6.getText()) - 1 ;
            if (suma_john==0) {
                JOptionPane.showMessageDialog(null, "El número empleados Productores o Ensambladores de cualquier tipo no puede ser menor que 1, ya que se despediría al Gerente");
                return;
            }
        String valor= jTextField6.getText();
        int entero= Integer.parseInt(valor);
        entero--;
        valor= Integer.toString(entero);
        jTextField6.setText(valor);
        if (start==false) {
            
            for (int i = 0; i < p_botones.length; i++) {
                if (p_botones[i]==null) {
                    p_botones[i-1]=null;
                    break;
                }
            }
        }
        else{
            for (int i = 0; i < p_botones.length; i++) {
                if (p_botones[i]==null) {
                    p_botones[i-1].stop();
                    p_botones[i-1]=null;
                    break;
                }
            }
            
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int suma_john=Integer.parseInt(jTextField5.getText()) - 1 ;
            if (suma_john==0) {
                JOptionPane.showMessageDialog(null, "El número empleados Productores o Ensambladores de cualquier tipo no puede ser menor que 1, ya que se despediría al Gerente");
                return;
            }
        String valor= jTextField5.getText();
        int entero= Integer.parseInt(valor);
        entero--;
        valor= Integer.toString(entero);
        jTextField5.setText(valor);
        if (start==false) {
            
            for (int i = 0; i < p_pantalla.length; i++) {
                if (p_pantalla[i]==null) {
                    p_pantalla[i-1]=null;
                    break;
                }
            }
        }
        else{
            for (int i = 0; i < p_pantalla.length; i++) {
                if (p_pantalla[i]==null) {
                    p_pantalla[i-1].stop();
                    p_pantalla[i-1]=null;
                    break;
                }
            }
            
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField16ActionPerformed

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField17ActionPerformed

    private void jTextField18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField18ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        int suma_ale=Integer.parseInt(jTextField18.getText()) + Integer.parseInt(jTextField19.getText()) + Integer.parseInt(jTextField20.getText()) + Integer.parseInt(jTextField21.getText()) + Integer.parseInt(jTextField22.getText()) + 1 ;
            if (suma_ale==16) {
                JOptionPane.showMessageDialog(null, "El número de Productores y Ensambladores para la Planta 2 no puede ser mayor a 15");
                return;
            }
        String valor= jTextField18.getText();
        int entero= Integer.parseInt(valor);
        entero++;
        valor= Integer.toString(entero);
        jTextField18.setText(valor);
        if (start==false) {
            
            Productor_pantalla hilo_pantalla= new Productor_pantalla(mutex_pantalla_ale, dato_pantalla_ale, espacio_pantalla_ale, 1, duracion_2);
            for (int i = 0; i < p_pantalla_ale.length; i++) {
                if (p_pantalla_ale[i]==null) {
                    p_pantalla_ale[i]=hilo_pantalla;
                    break;
                }
            }
        }
        else{
            Productor_pantalla hilo_pantalla= new Productor_pantalla(mutex_pantalla_ale, dato_pantalla_ale, espacio_pantalla_ale, 1, duracion_2);
            for (int i = 0; i < p_pantalla_ale.length; i++) {
                if (p_pantalla_ale[i]==null) {
                    p_pantalla_ale[i]=hilo_pantalla;
                    break;
                }
            }
            hilo_pantalla.start();
            
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        int suma_ale=Integer.parseInt(jTextField18.getText()) - 1 ;
            if (suma_ale==0) {
                JOptionPane.showMessageDialog(null, "El número empleados Productores o Ensambladores de cualquier tipo no puede ser menor que 1, ya que se despediría al Gerente");
                return;
            }
        String valor= jTextField18.getText();
        int entero= Integer.parseInt(valor);
        entero--;
        valor= Integer.toString(entero);
        jTextField18.setText(valor);
        if (start==false) {
            
            for (int i = 0; i < p_pantalla_ale.length; i++) {
                if (p_pantalla_ale[i]==null) {
                    p_pantalla_ale[i-1]=null;
                    break;
                }
            }
        }
        else{
            for (int i = 0; i < p_pantalla_ale.length; i++) {
                if (p_pantalla_ale[i]==null) {
                    p_pantalla_ale[i-1].stop();
                    p_pantalla_ale[i-1]=null;
                    break;
                }
            }
            
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        int suma_ale=Integer.parseInt(jTextField19.getText()) - 1 ;
            if (suma_ale==0) {
                JOptionPane.showMessageDialog(null, "El número empleados Productores o Ensambladores de cualquier tipo no puede ser menor que 1, ya que se despediría al Gerente");
                return;
            }
        String valor= jTextField19.getText();
        int entero= Integer.parseInt(valor);
        entero--;
        valor= Integer.toString(entero);
        jTextField19.setText(valor);
        if (start==false) {
            
            for (int i = 0; i < p_botones_ale.length; i++) {
                if (p_botones_ale[i]==null) {
                    p_botones_ale[i-1]=null;
                    break;
                }
            }
        }
        else{
            for (int i = 0; i < p_botones_ale.length; i++) {
                if (p_botones_ale[i]==null) {
                    p_botones_ale[i-1].stop();
                    p_botones_ale[i-1]=null;
                    break;
                }
            }
            
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jTextField19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField19ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        int suma_ale=Integer.parseInt(jTextField18.getText()) + Integer.parseInt(jTextField19.getText()) + Integer.parseInt(jTextField20.getText()) + Integer.parseInt(jTextField21.getText()) + Integer.parseInt(jTextField22.getText()) + 1 ;
            if (suma_ale==16) {
                JOptionPane.showMessageDialog(null, "El número de Productores y Ensambladores para la Planta 2 no puede ser mayor a 15");
                return;
            }
        String valor= jTextField19.getText();
        int entero= Integer.parseInt(valor);
        entero++;
        valor= Integer.toString(entero);
        jTextField19.setText(valor);
        int produccion_ale=2;
        if (start==false) {
            
            Productor_botones hilo_botones= new Productor_botones(mutex_boton_ale, dato_boton_ale, espacio_boton_ale, produccion_ale, 1, duracion_2);
            for (int i = 0; i < p_botones_ale.length; i++) {
                if (p_botones_ale[i]==null) {
                    p_botones_ale[i]=hilo_botones;
                    break;
                }
            }
        }
        else{
            Productor_botones hilo_botones= new Productor_botones(mutex_boton_ale, dato_boton_ale, espacio_boton_ale, produccion_ale, 1, duracion_2);
            for (int i = 0; i < p_botones_ale.length; i++) {
                if (p_botones_ale[i]==null) {
                    p_botones_ale[i]=hilo_botones;
                    break;
                }
            }
            hilo_botones.start();
            
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        int suma_ale=Integer.parseInt(jTextField18.getText()) + Integer.parseInt(jTextField19.getText()) + Integer.parseInt(jTextField20.getText()) + Integer.parseInt(jTextField21.getText()) + Integer.parseInt(jTextField22.getText()) + 1 ;
            if (suma_ale==16) {
                JOptionPane.showMessageDialog(null, "El número de Productores y Ensambladores para la Planta 2 no puede ser mayor a 15");
                return;
            }
        String valor= jTextField20.getText();
        int entero= Integer.parseInt(valor);
        entero++;
        valor= Integer.toString(entero);
        jTextField20.setText(valor);
        int dia_ale=3;
        if (start==false) {
            
            Productor_camara hilo_camara= new Productor_camara(mutex_camara_ale, dato_camara_ale, espacio_camara_ale, dia_ale , 1, duracion_2);
            for (int i = 0; i < p_camara_ale.length; i++) {
                if (p_camara_ale[i]==null) {
                    p_camara_ale[i]=hilo_camara;
                    break;
                }
            }
        }
        else{
            Productor_camara hilo_camara= new Productor_camara(mutex_camara_ale, dato_camara_ale, espacio_camara_ale, dia_ale , 1, duracion_2);
            for (int i = 0; i < p_camara_ale.length; i++) {
                if (p_camara_ale[i]==null) {
                    p_camara_ale[i]=hilo_camara;
                    break;
                }
            }
            hilo_camara.start();
            
        }
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
      int suma_ale=Integer.parseInt(jTextField20.getText()) - 1 ;
            if (suma_ale==0) {
                JOptionPane.showMessageDialog(null, "El número empleados Productores o Ensambladores de cualquier tipo no puede ser menor que 1, ya que se despediría al Gerente");
                return;
            }
        String valor= jTextField20.getText();
        int entero= Integer.parseInt(valor);
        entero--;
        valor= Integer.toString(entero);
        jTextField20.setText(valor);
        if (start==false) {
            
            for (int i = 0; i < p_camara_ale.length; i++) {
                if (p_camara_ale[i]==null) {
                    p_camara_ale[i-1]=null;
                    break;
                }
            }
        }
        else{
            for (int i = 0; i < p_camara_ale.length; i++) {
                if (p_camara_ale[i]==null) {
                    p_camara_ale[i-1].stop();
                    p_camara_ale[i-1]=null;
                    break;
                }
            }
            
        }
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jTextField20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField20ActionPerformed

    private void jTextField21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField21ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
        int suma_ale=Integer.parseInt(jTextField21.getText()) - 1 ;
            if (suma_ale==0) {
                JOptionPane.showMessageDialog(null, "El número empleados Productores o Ensambladores de cualquier tipo no puede ser menor que 1, ya que se despediría al Gerente");
                return;
            }
        String valor= jTextField21.getText();
        int entero= Integer.parseInt(valor);
        entero--;
        valor= Integer.toString(entero);
        jTextField21.setText(valor);
        if (start==false) {
            
            for (int i = 0; i < p_pin_ale.length; i++) {
                if (p_pin_ale[i]==null) {
                    p_pin_ale[i-1]=null;
                    break;
                }
            }
        }
        else{
            for (int i = 0; i < p_pin_ale.length; i++) {
                if (p_pin_ale[i]==null) {
                    p_pin_ale[i-1].stop();
                    p_pin_ale[i-1]=null;
                    break;
                }
            }
            
        }
        
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
        int suma_ale=Integer.parseInt(jTextField18.getText()) + Integer.parseInt(jTextField19.getText()) + Integer.parseInt(jTextField20.getText()) + Integer.parseInt(jTextField21.getText()) + Integer.parseInt(jTextField22.getText()) + 1 ;
            if (suma_ale==16) {
                JOptionPane.showMessageDialog(null, "El número de Productores y Ensambladores para la Planta 2 no puede ser mayor a 15");
                return;
            }
        String valor= jTextField21.getText();
        int entero= Integer.parseInt(valor);
        entero++;
        valor= Integer.toString(entero);
        jTextField21.setText(valor);
        if (start==false) {
            
            Productor_pin hilo_pin= new Productor_pin(mutex_pin_ale, dato_pin_ale, espacio_pin_ale, 1, duracion_2);
            for (int i = 0; i < p_pin_ale.length; i++) {
                if (p_pin_ale[i]==null) {
                    p_pin_ale[i]=hilo_pin;
                    break;
                }
            }
        }
        else{
            Productor_pin hilo_pin= new Productor_pin(mutex_pin_ale, dato_pin_ale, espacio_pin_ale, 1, duracion_2);
            for (int i = 0; i < p_pin_ale.length; i++) {
                if (p_pin_ale[i]==null) {
                    p_pin_ale[i]=hilo_pin;
                    break;
                }
            }
            hilo_pin.start();
            
        }
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
                int suma_ale=Integer.parseInt(jTextField22.getText()) - 1 ;
            if (suma_ale==0) {
                JOptionPane.showMessageDialog(null, "El número empleados Productores o Ensambladores de cualquier tipo no puede ser menor que 1, ya que se despediría al Gerente");
                return;
            }
        String valor= jTextField22.getText();
        int entero= Integer.parseInt(valor);
        entero--;
        valor= Integer.toString(entero);
        jTextField22.setText(valor);
        if (start==false) {
            
            for (int i = 0; i < array_ensam_ale.length; i++) {
                if (array_ensam_ale[i]==null) {
                    array_ensam_ale[i-1]=null;
                    break;
                }
            }
        }
        else{
            for (int i = 0; i < array_ensam_ale.length; i++) {
                if (array_ensam_ale[i]==null) {
                    array_ensam_ale[i-1].stop();
                    array_ensam_ale[i-1]=null;
                    break;
                }
            }
            
        }
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jTextField22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
                int suma_ale=Integer.parseInt(jTextField18.getText()) + Integer.parseInt(jTextField19.getText()) + Integer.parseInt(jTextField20.getText()) + Integer.parseInt(jTextField21.getText()) + Integer.parseInt(jTextField22.getText()) + 1 ;
            if (suma_ale==15) {
                JOptionPane.showMessageDialog(null, "El número de Productores y Ensambladores para la Planta 1 no puede ser mayor a 15");
                return;
            }
        String valor= jTextField22.getText();
        int entero= Integer.parseInt(valor);
        entero++;
        valor= Integer.toString(entero);
        jTextField22.setText(valor);
        int camara_ale=4;
        int pantalla_ale=1;
        int boton_ale=3;
        int pin_ale=1;
        if (start==false) {
            
            Ensamblador hilo_ensam= new Ensamblador(dato_camara_ale, espacio_camara_ale, mutex_camara_ale, dato_pantalla_ale, espacio_pantalla_ale, mutex_pantalla_ale, dato_boton_ale, espacio_boton_ale, mutex_boton_ale, dato_pin_ale, espacio_pin_ale, mutex_pin_ale, mutex_ensam_ale, camara_ale, pantalla_ale, boton_ale, pin_ale, 1, duracion_2);
            for (int i = 0; i < array_ensam_ale.length; i++) {
                if (array_ensam_ale[i]==null) {
                    array_ensam_ale[i]=hilo_ensam;
                    break;
                }
            }
        }
        else{
            Ensamblador hilo_ensam= new Ensamblador(dato_camara_ale, espacio_camara_ale, mutex_camara_ale, dato_pantalla_ale, espacio_pantalla_ale, mutex_pantalla_ale, dato_boton_ale, espacio_boton_ale, mutex_boton_ale, dato_pin_ale, espacio_pin_ale, mutex_pin_ale, mutex_ensam_ale, camara_ale, pantalla_ale, boton_ale, pin_ale, 1, duracion_2);
            for (int i = 0; i < array_ensam_ale.length; i++) {
                if (array_ensam_ale[i]==null) {
                    array_ensam_ale[i]=hilo_ensam;
                    break;
                }
            }
            hilo_ensam.start();
            
        }
        
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jTextField25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField25ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
        int suma_john=Integer.parseInt(jTextField5.getText()) + Integer.parseInt(jTextField6.getText()) + Integer.parseInt(jTextField7.getText()) + Integer.parseInt(jTextField8.getText()) + Integer.parseInt(jTextField9.getText()) + 1 ;
            if (suma_john==15) {
                JOptionPane.showMessageDialog(null, "El número de Productores y Ensambladores para la Planta 1 no puede ser mayor a 14");
                return;
            }
        String valor= jTextField5.getText();
        int entero= Integer.parseInt(valor);
        entero++;
        valor= Integer.toString(entero);
        jTextField5.setText(valor);
        if (start==false) {
            
            Productor_pantalla hilo_pantalla= new Productor_pantalla(mutex_pantalla, dato_pantalla, espacio_pantalla, 0, duracion_1);
            for (int i = 0; i < p_pantalla.length; i++) {
                if (p_pantalla[i]==null) {
                    p_pantalla[i]=hilo_pantalla;
                    break;
                }
            }
        }
        else{
            Productor_pantalla hilo_pantalla= new Productor_pantalla(mutex_pantalla, dato_pantalla, espacio_pantalla, 0, duracion_1);
            for (int i = 0; i < p_pantalla.length; i++) {
                if (p_pantalla[i]==null) {
                    p_pantalla[i]=hilo_pantalla;
                    break;
                }
            }
            hilo_pantalla.start();
            
        }
    }//GEN-LAST:event_jButton24ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(maininterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(maininterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(maininterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(maininterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new maininterfaz().setVisible(true);
                
            
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BOTONES;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    public static javax.swing.JTextField jTextField1;
    public static javax.swing.JTextField jTextField10;
    public static javax.swing.JTextField jTextField11;
    public static javax.swing.JTextField jTextField12;
    public static javax.swing.JTextField jTextField13;
    public static javax.swing.JTextField jTextField14;
    public static javax.swing.JTextField jTextField15;
    public static javax.swing.JTextField jTextField16;
    public static javax.swing.JTextField jTextField17;
    public static javax.swing.JTextField jTextField18;
    public static javax.swing.JTextField jTextField19;
    public static javax.swing.JTextField jTextField2;
    public static javax.swing.JTextField jTextField20;
    public static javax.swing.JTextField jTextField21;
    public static javax.swing.JTextField jTextField22;
    public static javax.swing.JTextField jTextField23;
    public static javax.swing.JTextField jTextField24;
    public static javax.swing.JTextField jTextField25;
    public static javax.swing.JTextField jTextField3;
    public static javax.swing.JTextField jTextField4;
    public static javax.swing.JTextField jTextField5;
    public static javax.swing.JTextField jTextField6;
    public static javax.swing.JTextField jTextField7;
    public static javax.swing.JTextField jTextField8;
    public static javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
    
//    class FondoPanel extends JPanel{
//        private Image imagen;
//        
//        public void paint (Graphics g){
//            imagen = new ImageIcon(getClass().getResource("/interfazimg/fondo.png")).getImage();
//            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
//            setOpaque(false);
//            
//            super.paint(g);
//        }
//    }
    
//    private void pintarImagen(JLabel jbl, String ruta){
//        this.imagen = new ImageIcon(ruta);
//        this.icono = new ImageIcon(this.imagen.getImage().getScaledInstance(jbl.getWidth(), jbl.getHeight(), Image.SCALE_DEFAULT));
//        
//        jbl.setIcon(this.icono);
//        this.repaint();
//        
//    } 




}
