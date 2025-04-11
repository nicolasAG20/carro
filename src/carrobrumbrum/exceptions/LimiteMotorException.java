/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrobrumbrum.exceptions;

/**
 *
 * @author Nico
 */
public class LimiteMotorException extends RuntimeException
{

    public LimiteMotorException() {
         super("el motor ha pasado sus limites");
    }
     
}
