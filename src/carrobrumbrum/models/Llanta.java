/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrobrumbrum.models;

/**
 *
 * @author Nico
 */
public class Llanta {
    private String tipo; 
    private int limiteVelocidad; 

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

    public String getTipo() {
        return tipo;
    }

    public int getLimiteVelocidad() {
        return limiteVelocidad;
    }
    
}
