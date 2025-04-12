/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrobrumbrum.models;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Nico
 */
public class Lector {
    File archivo; 
    FileReader lector; 
    BufferedReader buffer; 

    public Lector(File archivo) throws FileNotFoundException {
        this.archivo = archivo;
        this.lector= new FileReader(archivo);
        this.buffer = new BufferedReader(lector);
    }
    
    public String[] devolverTextoSeparado() throws IOException{
        String[] textoSeparado= new String[4]; 
        String linea; 
        int i=0; 
        while((linea=this.buffer.readLine())!=null){
            i++;
            if(i==1){
                String[] textos= separarEspacios(linea);
                textoSeparado[0]= textos[0];
                textoSeparado[1]= textos[1];
            }else if(i==2){
                String[] textos= separarEspacios(linea);
                textoSeparado[2]= textos[0];
                textoSeparado[3]= textos[1];
            }
        }
        
        return textoSeparado; 
    }
    
    public String[] separarEspacios(String texto){
        String[] textoSeparado = new String[2];
        String textoObtenido="";
        texto+=" ";
        int j=0; 
        for(int i=0; i<texto.length(); i++){
            if(texto.charAt(i)!=' '){
                textoObtenido +=texto.charAt(i);
                
            }else{
                textoSeparado[j]= textoObtenido;
                textoObtenido="";
                j++;
            }
        }
        return textoSeparado; 
    }
}
