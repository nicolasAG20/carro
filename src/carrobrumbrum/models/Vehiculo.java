/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrobrumbrum.models;

import carrobrumbrum.exceptions.ApagadoException;
import carrobrumbrum.exceptions.DetenidoException;
import carrobrumbrum.exceptions.EncendidoException;
import carrobrumbrum.exceptions.LimiteMotorException;
import carrobrumbrum.exceptions.PatinarException;
import carrobrumbrum.exceptions.velocidadMayor60Exception;

/**
 * Clase vehiculo que controla su estado de encendido,movimiento y posibles accidentes
 * @author Nicolas Agudelo Grajales
 */
public class Vehiculo {
    private boolean encendido= false; 
    private boolean accidentado= false; 
    private Motor motor;
    private Llanta llanta; 

    /**
     * Constructor que cre un vehiculo con motor y llantas especificas
     * @param motor El motor del vehiculo
     * @param llanta Las llantas del vehiculo
     */
    public Vehiculo(Motor motor, Llanta llanta) {
        this.motor = motor;
        this.llanta = llanta;
    }

    
    /**
     * Enciende el vehciulo
     * @throws EncendidoException Si el vehiculo ya esta encendido
     */
    public void encender()throws EncendidoException{
        if(encendido){
            throw new EncendidoException();
        }else{
            encendido=true; 
        }
    }
    
    /**
     * Apaga el vehciulo
     * @throws ApagadoException Si el vehciulo ya esta apagado
     * @throws velocidadMayor60Exception Si se intenta apagar a velocidad > 60 km/h
     */
    public void apagar( ) throws ApagadoException, velocidadMayor60Exception{
        if(!encendido){
            throw new ApagadoException();
        }else if(encendido){
            this.motor.setVelocidadActual(0);
            encendido= false; 
        }else if(this.motor.getVelocidadActual()>60){
            this.accidentado = true;
            throw new velocidadMayor60Exception();        
        }      
    }
    
    /**
     * Acelera el motor de vehiculo
     * @param velocidad Cantidad de km/h a acelerar 
     * @throws ApagadoException Si el vehciulo esta apagado
     * @throws LimiteMotorException Si se excede la velocidad maxima del motor
     */
    public void acelerarMotor(int velocidad) throws ApagadoException, LimiteMotorException{
        if(!encendido){
            throw new ApagadoException(); 
        }else{
            try{
                this.motor.acelerar(velocidad);
            }catch(LimiteMotorException e){
                this.accidentado=true;
                apagar();
                
            }
        }
        
    }
    /**
     * Frena bruscamente el vehiculo
     * @param valorDeFrenado Intensidad del frenado
     * @throws PatinarException Si el frenado supera el limite de las llantas
     * @throws DetenidoException Si el vehiculo ya esta detenido
     */
    public void frenarBruscamente(int valorDeFrenado)throws PatinarException, DetenidoException{
        if(valorDeFrenado>this.llanta.getLimiteVelocidad()){
            this.motor.setVelocidadActual(0);
            throw new PatinarException();
            
        }else if(this.motor.getVelocidadActual()==0){
            throw new DetenidoException();
        }else{
            try{
                this.motor.frenar(valorDeFrenado);
            }catch(PatinarException e){
                this.motor.setVelocidadActual(0);
                
            }
            
        }
        
    }

    /**
     * Obtiene el estado de encencido del vehiculo
     * @return true si esta encendido,false si esta apagado
     */
    public boolean isEncendido() {
        return encendido;
    }
    /**
     * Obtiene el motor del vehiculo
     * @return Instancia del motor
     */
    public Motor getMotor() {
        return motor;
    }
    /**
     * Obtiene las llantas del vehiculo
     * @return Instancia de las llantas
     */
    public Llanta getLlanta() {
        return llanta;
    }
    
    
    
    
}
