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
 *
 * @author Nico
 */
public class Vehiculo {
    private boolean encendido= false; 
    private boolean accidentado= false; 
    private Motor motor;
    private Llanta llanta; 

    public Vehiculo(Motor motor, Llanta llanta) {
        this.motor = motor;
        this.llanta = llanta;
    }

    
    
    public void encender()throws EncendidoException{
        if(encendido){
            throw new EncendidoException();
        }else{
            encendido=true; 
        }
    }
    
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
    
    public void acelerarMotor(int velocidad) throws ApagadoException, LimiteMotorException{
        if(!encendido){
            throw new ApagadoException(); 
        }else{
            try{
                this.motor.acelerar(velocidad);
            }catch(LimiteMotorException e){
                this.accidentado=true;
                apagar();
                throw e;
            }
        }
        
    }
    
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
                throw e;
            }
            
        }
        
    }

    
    public boolean isEncendido() {
        return encendido;
    }
    
    
    
    
}
