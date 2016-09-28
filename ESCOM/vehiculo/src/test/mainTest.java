/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import sources.*;
/**
 *
 * @author alumno
 */
public class mainTest {
    public static void main(String[] args) {
        Taxi taxi1 = new Taxi("matricula 1", 1, 12.30f, "licencia 1");
        System.out.println(taxi1.toString());
        
        Taxi taxi2 = new Taxi("licencia 2");
        System.out.println(taxi2.toString());
        
        Autobus autobus1 =  new Autobus(100, "matricula 2", 2, 78.09f);
        System.out.println(autobus1.toString());
        
        taxi1.setLicencia("fsd");
        System.out.println(taxi1.toString());
    }
}
