/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import javax.swing.JTextArea;

/**
 *
 * @author ACER
 */
public class SeparacionTexto {
    /**
     * Arreglo de caracteres que almacena los caracteres en el JTextArea
     */
    private String[] lexema;
    
    /**
     * Metodo para tomar los caracteres del JTextArea
     * @param areaTexto area de texto que almacena los caracteres
     * @return 
     */
    public String[] crearLexema(JTextArea areaTexto){
        this.lexema = areaTexto.getText().split(" ");
        return this.lexema;
    }    
}
