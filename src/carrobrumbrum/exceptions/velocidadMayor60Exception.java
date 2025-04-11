/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrobrumbrum.exceptions;

/**
 *
 * @author Nico
 */
public class velocidadMayor60Exception extends RuntimeException
{

    public velocidadMayor60Exception() {
         super("La valeocidad al apagar es mayor de 60");
    }
     
}

