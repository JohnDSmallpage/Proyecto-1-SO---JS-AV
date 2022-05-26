/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author johnd
 */
public class Archivo {

    public void leer() {
        String linea;
        String text = "";
        File file = new File("test\\info.");
        try {
            if (!file.exists()) {
                file.createNewFile();
            } else {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                while ((linea = br.readLine()) != null) {

                    text += linea + "\n";
                }
                if (!"".equals(text) && !text.isEmpty()) {

                    String[] txt_split = text.split("\n");

                    for (int i = 1; i < txt_split.length; i++) {
                        
                            String[] datos = txt_split[i].split(",");
                        
                    }

                }
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "ERROR AL LEER");
        }
    }

    public void escribir() {

    }
}
