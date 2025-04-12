/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrobrumbrum.models;

import carrobrumbrum.exceptions.LimiteMotorException;

/**
 *
 * @author Nico
 */
public class Motor {
    private String cilindraje; 
    private int velocidadMax; 
    private int velocidadActual=0; 

    public Motor(String cilindraje, int velocidadMax) {
        this.cilindraje = cilindraje;
        this.velocidadMax = velocidadMax;
    }
    
    public void acelerar(int velocidad) throws LimiteMotorException{
        this.velocidadActual+= velocidad; 
        if(this.velocidadActual>velocidadMax){
            throw new LimiteMotorException(); 
        }
    }
    
    public void frenar(int velocidadDeFrenado)throws PatinarException{
        if(velocidadDeFrenado>velocidadActual){
            this.velocidadActual=0; 
            throw new PatinarException();
        }else{
            this.velocidadActual-=velocidadDeFrenado;
        }
    }
    
    public int getVelocidadMax() {
        return velocidadMax;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }
    
    
    
}
