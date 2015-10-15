/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juandanielcr.bufferedjava;

import java.io.FileWriter;

/**
 *
 * @author Mario Osorio
 */
public class BufferedJava {
    public static void main(String[] args) {
        String textoEscribir="Hola mundo con un FileWriter";
        String direccion="C:/Users/djaqcu1/Documents/Java/JavaPractices/";
        String archivoNombre="Java.txt";
        try{
            //creo la ruta de mi archivo: ruta + nombre
            FileWriter writer= new FileWriter(direccion+archivoNombre);
            //Mando el String a escribir
            writer.write(textoEscribir);
            writer.close();
        }catch(Exception e){
            System.out.println("Error;");
        }
    }
}
