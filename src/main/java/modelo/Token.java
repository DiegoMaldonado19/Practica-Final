/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ACER
 */
public class Token {
    
    /**
     * variables para almacenar los elementos del lexema y el tipo de token que es
     */
    String lexema;
    TipoToken tipoToken;

    /**
     * Constuctor de la clase
     * @param lexema contenido del lexema
     * @param tipoToken tipo del lexema
     */
    public Token(String lexema, TipoToken tipoToken) {    
        this.lexema = lexema;
        this.tipoToken = tipoToken;
    }

    /**
     * getters y setters
     * @return 
     */
    public String getLexema() {
        return lexema;
    }

    public void setLexema(String lexema) {
        this.lexema = lexema;
    }

    public TipoToken getTipoToken() {
        return tipoToken;
    }

    public void setTipoToken(TipoToken tipoToken) {
        this.tipoToken = tipoToken;
    }
    
    
    
    
}
