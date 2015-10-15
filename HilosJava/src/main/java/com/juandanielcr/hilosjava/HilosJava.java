/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juandanielcr.hilosjava;

import javax.swing.JOptionPane;

/**
 *
 * @author Mario Osorio
 */
public class HilosJava {
    public static void main(String args[]){
        //Creacion de un Hilo sin herencia

        Thread thread;
        thread = new Thread(){
            @Override
            public void run(){
                int dialogResult = JOptionPane.showConfirmDialog (null, "Hilos 1");
                if(dialogResult == JOptionPane.YES_OPTION){
                    System.out.println("YEs");
                }
            }
        };
        Thread thread2;
        thread2 = new Thread(){
            @Override
            public void run(){
                JOptionPane.showConfirmDialog(null, "Hilo 2");
            }
        };
        thread.start();
        thread2.start();
    }
}
