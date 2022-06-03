/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import Clases.Funciones_dash;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author aleja
 */
public class dash extends javax.swing.JFrame {
    /**
     * Creates new form dash
     */
    
    public JTable tabla;
    public JScrollPane panelBarra;
    
    
    
    public dash() {
        initComponents();
        this.setResizable(false);
        this.setVisible(true);
        this.setSize(800,700);
        this.setLocationRelativeTo(null);
        String[] linea1 = maininterfaz.txt_dash.leerCSV();
        String[] texto1 = null;
        //this.showTabla();
        
        grafico1();
        grafico2();
        grafico3();
        grafico4();
        
        int ganancias1 = 0;
        int ganancias1_prom = 0;
        
        int gastos1 = 0;
        int gastos1_prom = 0;
        
        int telf1 = 0;
        int telf1_prom = 0;
        
        int ganancias2 = 0;
        int ganancias2_prom = 0;
        
        int gastos2 = 0;
        int gastos2_prom = 0;
        
        int telf2 = 0;
        int telf2_prom = 0;
        
        for (int i = 0; i < linea1.length; i++) {
            linea1[i] = linea1[i].replace("[","");
            linea1[i] = linea1[i].replace("]","");
            linea1[i] = linea1[i].replace(" ","");
            texto1 = linea1[i].split(",");
            
            ganancias1 += Integer.parseInt(texto1[11]);
            ganancias1_prom = ganancias1/(i+1);
            jTextField1.setText(Integer.toString(ganancias1_prom));
            
            gastos1 += Integer.parseInt(texto1[10]);
            gastos1_prom = gastos1/(i+1);
            jTextField3.setText(Integer.toString(gastos1_prom));
            
            telf1 += Integer.parseInt(texto1[12]);
            telf1_prom = telf1/(i+1);
            jTextField5.setText(Integer.toString(telf1_prom));
            
            ganancias2 += Integer.parseInt(texto1[19]);
            ganancias2_prom = ganancias2/(i+1);
            jTextField2.setText(Integer.toString(ganancias2_prom));
            
            gastos2 += Integer.parseInt(texto1[18]);
            gastos2_prom = gastos2/(i+1);
            jTextField4.setText(Integer.toString(gastos2_prom));
            
            telf2 += Integer.parseInt(texto1[20]);
            telf2_prom = telf2/(i+1);
            jTextField6.setText(Integer.toString(telf2_prom));         
        
    }
    
    }
    
    public void grafico1(){
            String[] linea = maininterfaz.txt_dash.leerCSV();
            String[] texto = null;
            
            DefaultCategoryDataset datos = new DefaultCategoryDataset();
            
            for (int i = 0; i < linea.length; i++) {
            linea[i] = linea[i].replace("[","");
            linea[i] = linea[i].replace("]","");
            linea[i] = linea[i].replace(" ","");
            texto = linea[i].split(",");
            String id = Integer.toString(i+1);
            int dato = Integer.parseInt(texto[10]);
            datos.setValue(dato, "Gastos", id);
            
            int ganancia = Integer.parseInt(texto[11]);
            datos.setValue(ganancia, "Ganancias", id);
        }
        JFreeChart grafico_barras = ChartFactory.createBarChart3D(
        "",
        "ID",
        "MONTO",
        datos,
        PlotOrientation.VERTICAL,
        true,
        true,
        false 
        );
        
        ChartPanel panel = new ChartPanel(grafico_barras);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(370,210));
        
        jPanel1.setLayout(new BorderLayout());
        jPanel1.add(panel,BorderLayout.NORTH);
        
        pack();
        repaint();
        
        
        }
    
    
    public void grafico2(){
            String[] linea = maininterfaz.txt_dash.leerCSV();
            String[] texto = null;
            
            DefaultCategoryDataset datos = new DefaultCategoryDataset();
            
            for (int i = 0; i < linea.length; i++) {
            linea[i] = linea[i].replace("[","");
            linea[i] = linea[i].replace("]","");
            linea[i] = linea[i].replace(" ","");
            texto = linea[i].split(",");
            String id = Integer.toString(i+1);
            int dato = Integer.parseInt(texto[12]);
            datos.setValue(dato, "Teléfonos", id);
        }
        JFreeChart linechart = ChartFactory.createLineChart(
        "",
        "ID",
        "CANTIDAD",
        datos,
        PlotOrientation.VERTICAL,
        false,
        true,
        false 
        );
        
        ChartPanel panel = new ChartPanel(linechart);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(150,160));
        
        jPanel7.setLayout(new BorderLayout());
        jPanel7.add(panel,BorderLayout.NORTH);
        
        pack();
        repaint();
        
        
        }
    
    
    public void grafico3(){
            String[] linea = maininterfaz.txt_dash.leerCSV();
            String[] texto = null;
            
            DefaultCategoryDataset datos = new DefaultCategoryDataset();
            
            for (int i = 0; i < linea.length; i++) {
            linea[i] = linea[i].replace("[","");
            linea[i] = linea[i].replace("]","");
            linea[i] = linea[i].replace(" ","");
            texto = linea[i].split(",");
            String id = Integer.toString(i+1);
            int dato = Integer.parseInt(texto[18]);
            datos.setValue(dato, "Gastos", id);
            
            int ganancia = Integer.parseInt(texto[19]);
            datos.setValue(ganancia, "Ganancias", id);
        }
        JFreeChart grafico_barras = ChartFactory.createBarChart3D(
        "",
        "ID",
        "MONTO",
        datos,
        PlotOrientation.VERTICAL,
        true,
        true,
        false 
        );
        
        ChartPanel panel = new ChartPanel(grafico_barras);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(370,210));
        
        jPanel3.setLayout(new BorderLayout());
        jPanel3.add(panel,BorderLayout.NORTH);
        
        pack();
        repaint();
        
        
        }
    
    
    public void grafico4(){
            String[] linea = maininterfaz.txt_dash.leerCSV();
            String[] texto = null;
            
            DefaultCategoryDataset datos = new DefaultCategoryDataset();
            
            for (int i = 0; i < linea.length; i++) {
            linea[i] = linea[i].replace("[","");
            linea[i] = linea[i].replace("]","");
            linea[i] = linea[i].replace(" ","");
            texto = linea[i].split(",");
            String id = Integer.toString(i+1);
            int dato = Integer.parseInt(texto[20]);
            datos.setValue(dato, "Teléfonos", id);
        }
        JFreeChart linechart = ChartFactory.createLineChart(
        "",
        "ID",
        "CANTIDAD",
        datos,
        PlotOrientation.VERTICAL,
        false,
        true,
        false 
        );
        
        ChartPanel panel = new ChartPanel(linechart);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(150,160));
        
        jPanel2.setLayout(new BorderLayout());
        jPanel2.add(panel,BorderLayout.NORTH);
        
        pack();
        repaint();
        
        
        }
    
    
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        LEYENDA = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setText("ATRÁS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 610, 150, 40));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PLANTA 1 - JOHN");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 400, -1));

        jLabel27.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("DASHBOARD");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 800, 60));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfazimg/estadisticas2.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 80, 80));

        LEYENDA.setText("LEYENDA PLANTA 1");
        LEYENDA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LEYENDAActionPerformed(evt);
            }
        });
        getContentPane().add(LEYENDA, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 580, 160, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("PLANTA 1 VS PLANTA 2");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 400, 290, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("GANANCIAS (PROMEDIO)");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, -1, -1));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 410, 180, 160));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("GASTOS DE PLANTA - SUELDOS Y GANANCIAS");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 370, -1));

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("|");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 20, -1));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("TELÉFONOS VENDIDOS");
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 390, 180, -1));

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("|");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 20, -1));

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("|");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 20, -1));

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("|");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 20, -1));

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("|");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 20, -1));

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("|");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 20, -1));

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("PLANTA 2 - ALE");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 400, -1));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 370, 210));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("GASTOS DE PLANTA - SUELDOS Y GANANCIAS");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 150, 370, -1));

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("|");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, 20, -1));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("O DISMINUCIÓN DE PRODUCTORES ");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 590, 300, -1));

        jLabel28.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("NOTA: PUEDE QUE EN ALGUNOS DÍAS DE PRODUCCIÓN HUBIESEN AUMENTO");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 580, 290, -1));

        jLabel25.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("|");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 20, -1));

        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("TELÉFONOS VENDIDOS");
        jLabel26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 180, -1));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("CANTIDAD");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 536, 130, 20));
        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 180, 160));

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("|");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 20, -1));

        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("jTextField2");
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 440, 60, -1));

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("jTextField1");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, 60, -1));

        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("jTextField3");
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 490, 60, -1));

        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("jTextField4");
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 490, 60, -1));

        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("jTextField5");
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 540, 60, -1));

        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setText("jTextField6");
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 540, 60, -1));

        jButton1.setText("LEYENDA PLANTA 2");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 580, -1, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("GASTOS (PROMEDIO)");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 490, -1, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("TELÉFONOS (PROMEDIO)");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 550, -1, 20));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 370, 210));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfazimg/fondo_sony.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 700));

        jLabel7.setText("GANANCIAS");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        maininterfaz maininterfaz = new maininterfaz();
        maininterfaz.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void LEYENDAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LEYENDAActionPerformed
        leyenda leyenda= new leyenda();
        leyenda.setVisible(true);
        
        
        
       
        
        //panelBarra=new JScrollPane(tabla);
        //getContentPane().add(panelBarra);
        //panelBarra.reshape(80,50,300,300);
        
        
        
        
        
       
        
        
        //JTable table = new JTable(data,columnNames);
        
        
        
        
        
        //jPanel2.add(table);
        //jPanel2.add(new JScrollPane(table));    // TODO add your handling code here:
    }//GEN-LAST:event_LEYENDAActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        leyenda_ale leyenda_ale= new leyenda_ale();
        leyenda_ale.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(dash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton LEYENDA;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
