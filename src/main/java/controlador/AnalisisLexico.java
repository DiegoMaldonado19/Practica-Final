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
public class AnalisisLexico {
    /**
     * Metodo que hace el llamado a los metodos para realizar las comparaciones
     * @param lexema arreglo de caracteres
     */
    public void analisis(String[] lexema){
        MetodoComparacion comparacion = new MetodoComparacion();
        
        
        for(int i=0; i<lexema.length; i++){
            char[] texto = lexema[i].toCharArray();
            for(int j=0; j<texto.length; j++){
                if((comparacion.isVacio(texto[j])== true)){
                    System.out.println(texto[j]+" - "+ " es un espacio vacio"+"\n");
                }
                else if((comparacion.isLetra(texto[j])) == true){
                    System.out.println(texto[j]+" - "+ " es una letra"+"\n");
                }
                else if((comparacion.isDigito(texto[j])) == true){
                     System.out.println(texto[j]+" - "+ " es un digito"+"\n");
                }
                else if((comparacion.isOperador(texto[j])) == true){
                     System.out.println(texto[j]+" - "+ " es un operador"+"\n");
                }
                else if((comparacion.isPuntuacion(texto[j])) == true){
                     System.out.println(texto[j]+" - "+ " es un signo de puntuacion"+"\n");
                }
                else if((comparacion.isAgrupacion(texto[j])) == true){
                     System.out.println(texto[j]+" - "+ " es un signo de agrupacion"+"\n");
                }
            }
        }
    }
}
