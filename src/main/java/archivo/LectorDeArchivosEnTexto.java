/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package archivo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JTextArea;

/**
 *
 * @author ACER
 */
public class LectorDeArchivosEnTexto {
    /**
     * Metodo para cargar un archivo de texto o del tipo que quieran
     * @param archivo archivo a cargar
     * @param areaTexto area de texto en la cual cargaremos el texto
     * @throws FileNotFoundException    excepcion si no encuentra el archivo
     * @throws IOException  excepcion
     */
     public void cargarDatos (File archivo, JTextArea areaTexto) throws FileNotFoundException, IOException{
        
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);
   
        String linea;
    
        while((linea = br.readLine()) != null){
            areaTexto.append(linea+"\n");
        }
        fr.close();
    }   
}
