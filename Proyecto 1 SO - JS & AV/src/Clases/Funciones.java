package Clases;


import interfaz.maininterfaz;
import com.csvreader.CsvWriter;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.concurrent.Semaphore;
import javax.swing.JOptionPane;

public class Funciones {
        
    public String[] leerCSV() {
        String line;
        String text = "";
        File file = new File("test\\datos.csv");
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
        String[] data = separarData(text.split("\n"));
        return data;
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
    
    public String[] generarData(String duracion_dia, String dia_despacho,
            String pantallas_alm, String botones_alm, String pincarga_alm, String camara_alm,
            String pantallas_j, String botones_j, String pincarga_j, String camara_j, String ensamblador_j,
            String pantallas_a, String botones_a, String pincarga_a, String camara_a, String ensamblador_a) {
        
        String[] data = {
            "--TIEMPO--",
            "duracion_dia, " + duracion_dia,
            "dia_despacho, " + dia_despacho,
            "--ALMACEN--",
            "pantallas_alm, " + pantallas_alm,
            "botones_alm, " + botones_alm,
            "pincarga_alm, " + pincarga_alm,
            "camara_alm, " + camara_alm,
            "--PRODUCTORES JOHN--",
            "pantallas_j, " + pantallas_j,
            "botones_j, " + botones_j,
            "pincarga_j, " + pincarga_j,
            "camara_j, " + camara_j,
            "ensamblador_j, " + ensamblador_j,
            "--PRODUCTORES ALE--",
            "pantallas_a, " + pantallas_a,
            "botones_a, " + botones_a,
            "pincarga_a, " + pincarga_a,
            "camara_a, " + camara_a,
            "ensamblador_a, " + ensamblador_a,
        };
        
        return data;
    }
    
    public void GuardarCSV(String duracion_dia, String dia_despacho,
            String pantallas_alm, String botones_alm, String pincarga_alm, String camara_alm,
            String pantallas_j, String botones_j, String pincarga_j, String camara_j, String ensamblador_j,
            String pantallas_a, String botones_a, String pincarga_a, String camara_a, String ensamblador_a) {
        
        String[] data = generarData(duracion_dia,dia_despacho,
            pantallas_alm,botones_alm,pincarga_alm,camara_alm,
            pantallas_j, botones_j, pincarga_j,  camara_j,  ensamblador_j,
            pantallas_a, botones_a,  pincarga_a,  camara_a,  ensamblador_a);
        
        try {
            File file = new File("test\\datos.csv");
            if (!file.exists()) {
                file.createNewFile();
            } else {
                CsvWriter csvwriter = new CsvWriter("test\\datos.csv");
                for (int i = 0; i < data.length; i++) {
                    String [] line = data[i].split(",");
                    csvwriter.writeRecord(line);
                }
                csvwriter.close();
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "ERROR AL LEER");
        }
    }
    
    public static int contar(Object array[]){
        int contador=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]!=null) {
                contador++;
            }
        }
        return contador;
    }
    
}