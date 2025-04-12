/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrobrumbrum.models;

/**
 * Clase llanta que gestiona el tipo de llanta y el limite de velocidad
 * @author Nicolas Agudelo Grajales
 */
public class Llanta {
    private String tipo; 
    private int limiteVelocidad; 
    
    /**
     * 
     * Constructor que crea una llanta del tipo especificado
     * 
     * @param tipo de llanta que puede ser
     */
    public Llanta(String tipo) {
        this.tipo = tipo;
        switch (tipo) {
            case "buenas":
                this.limiteVelocidad= 110;
                break;
            case "baratas":
                this.limiteVelocidad= 50;
                break;
            case "bonitas":
                this.limiteVelocidad= 70;
                break;
            default:
                break;
        }
        
    }
 /**
  * Obtiene el tipo de la llanta
  * @return El tipo de llanta como String
  */
    public String getTipo() {
        return tipo;
    }
/**
 * Obtiene el limite maximo de velocidad para el tipo de llante
 * @return El limte de velocidad en km/h como entero
 */
    public int getLimiteVelocidad() {
        return limiteVelocidad;
    }
    
}
