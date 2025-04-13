/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrobrumbrum.models;

import carrobrumbrum.exceptions.LimiteMotorException;
import carrobrumbrum.exceptions.PatinarException;

/**
 * Clase moto que gestiona el cilindraje,velocidad maxima y actual,con metodos para acelerar y frenar
 * @author Nicolas Agudelo Grajales
 */
public class Motor {
    private String cilindraje; 
    private int velocidadMax; 
    private int velocidadActual =0; 

    /**
     * Constructor que crea un motor con el cilindraje especifico
     * @param cilindraje El cilindraje del moto que puede ser
     */
    public Motor(String cilindraje) {
        this.cilindraje = cilindraje;
        switch (cilindraje) {
            case "1000":
                this.velocidadMax= 100;
                break;
            case "2000":
                this.velocidadMax= 160;
                break;
            case "3000":
                this.velocidadMax= 220;
                break;
            default:
                break;
        }
        
    }
    
    /**
     * Aumenta la velocidad actual del motor
     * @param velocidad Cantidad de km/h a acelerar
     * @throws LimiteMotorException Si la velocidad resultante excede la velocidad maxima permitida
     */
    public void acelerar(int velocidad) throws LimiteMotorException{
        this.velocidadActual+= velocidad; 
        if(this.velocidadActual>velocidadMax){
            throw new LimiteMotorException(); 
        }
    }
    
    /**
     * Reduce la velocidad actual del motor
     * @param velocidadDeFrenado Cantidad de km/h a reducir
     * @throws PatinarException Si el valor de frenado es mayor que la velocidad actual
     */
    public void frenar(int velocidadDeFrenado)throws PatinarException{
        
        if(velocidadDeFrenado>velocidadActual){
            this.velocidadActual=0; 
            throw new PatinarException();
        }else{
            this.velocidadActual-=velocidadDeFrenado;
        }
    }
    
    /**
     * Obtiene la velocidad maxima permitida para este motor
     * @return Velocidad maxima en km/h
     */
    public int getVelocidadMax() {
        return velocidadMax;
    }
    /**
     * Obtiene el cilindraje del motor
     * @return Cilindrajecomo string
     */
    public String getCilindraje() {
        return cilindraje;
    }
    /**
     * Obtiene la velocidad actua del motor
     * @return Velocidad actual en km/h
     */
    public int getVelocidadActual() {
        return velocidadActual;
    }
    /** 
     * Establece directamente la velocidad actual del motro
     * @param velocidadActual Nueva velocidad en km/h
     */
    public void setVelocidadActual(int velocidadActual) {
         this.velocidadActual = velocidadActual;
    }
    
    
    
}
