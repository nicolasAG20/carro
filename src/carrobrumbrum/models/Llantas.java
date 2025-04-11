/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrobrumbrum.models;

/**
 *
 * @author Nico
 */
public class Llantas {
    private String tipo; 
    private int limiteVelocidad; 

    public Llantas(String tipo, int limiteVelocidad) {
        this.tipo = tipo;
        this.limiteVelocidad = limiteVelocidad;
    }

    public String getTipo() {
        return tipo;
    }

    public int getLimiteVelocidad() {
        return limiteVelocidad;
    }
    
}
