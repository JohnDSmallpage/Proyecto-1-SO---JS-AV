package Clases;


import interfaz.maininterfaz;
import com.csvreader.CsvWriter;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.concurrent.Semaphore;
import javax.swing.JOptionPane;

public class Funciones_dash {
    
    FileWriter escribir;
    PrintWriter linea;
        
    public String[] leerCSV() {
        String line;
        String text = "";
        File file = new File("test\\dash.csv");
        try {
            if (!file.exists()) {
                file.createNewFile();
            } else {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                while ((line = br.readLine()) != null) {
                    if (!line.isEmpty()) {
                        text += line + "\n";
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "ERROR AL LEER");
        }
        //String[] data = separarData(text.split("\n"));
        return text.split("\n");
    }
    
    public String[] separarData(String[] text) {
        if (text.length != 1) {
            String[] data = new String[text.length - 4];
            int j = 0;
            for (int i = 0; i < text.length; i++) {
                String[] line = text[i].split(",");
                if (line.length != 1) {
                    data[j] = line[1];
                    j++;
                }
            }
            return data;
        }
        return text;
    }
    
    public String[] generarData(String dia_despacho,
            String pantallas_alm, String botones_alm, String pincarga_alm, String camara_alm,
            String pantallas_j, String botones_j, String pincarga_j, String camara_j, String ensamblador_j, String gastos_j, String ganancias_j, String telefonos_j,
            String pantallas_a, String botones_a, String pincarga_a, String camara_a, String ensamblador_a, String gastos_a, String ganancias_a, String telefonos_a) {
        
        String[] data = {dia_despacho, pantallas_alm, botones_alm, pincarga_alm, camara_alm, pantallas_j, botones_j, pincarga_j, camara_j, ensamblador_j, gastos_j, ganancias_j, telefonos_j, pantallas_a, botones_a, pincarga_a, camara_a, ensamblador_a, gastos_a, ganancias_a, telefonos_a};
        
        return data;
    }
    
    public void GuardarCSV(String dia_despacho,
            String pantallas_alm, String botones_alm, String pincarga_alm, String camara_alm,
            String pantallas_j, String botones_j, String pincarga_j, String camara_j, String ensamblador_j, String gastos_j, String ganancias_j, String telefonos_j,
            String pantallas_a, String botones_a, String pincarga_a, String camara_a, String ensamblador_a, String gastos_a, String ganancias_a, String telefonos_a) {
        
        String[] data = generarData(dia_despacho, pantallas_alm,botones_alm,pincarga_alm,camara_alm, pantallas_j,botones_j,pincarga_j,camara_j,ensamblador_j,gastos_j,ganancias_j,telefonos_j, pantallas_a,botones_a,pincarga_a,camara_a,ensamblador_a,gastos_a,ganancias_a,telefonos_a);
        
        try {
            File file = new File("test\\dash.csv");
            if (!file.exists()) {
                file.createNewFile();
                escribir = new FileWriter(file,true);
                linea = new PrintWriter(escribir);
                linea.println(Arrays.toString(data));
                linea.close();
                escribir.close();
            } else {
                escribir = new FileWriter(file,true);
                linea = new PrintWriter(escribir);
                linea.println(Arrays.toString(data));
                linea.close();
                escribir.close();
                }
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "ERROR AL LEER");
        }
    }
    
}