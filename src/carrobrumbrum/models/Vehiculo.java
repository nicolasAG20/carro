/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrobrumbrum.models;

import carrobrumbrum.exceptions.ApagadoException;
import carrobrumbrum.exceptions.EncendidoException;
import carrobrumbrum.exceptions.LimiteMotorException;
import carrobrumbrum.exceptions.velocidadMayor60Exception;

/**
 *
 * @author Nico
 */
public class Vehiculo {
    private boolean encendido= false; 
    private boolean accidentado= false; 
    private Motor motor;
    private Llantas llanta; 

    public Vehiculo() {
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
            encendido= false; 
        }else if(this.motor.getVelocidadActual()>60){
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
            }
        }
        
    }
    
    
}
