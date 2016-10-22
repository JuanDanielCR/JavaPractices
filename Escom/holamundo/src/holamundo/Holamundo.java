/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

import javax.swing.JOptionPane;

/**
 *
 * @author Juan Daniel Castillo Reyes
 */
public class Holamundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // JOptionPane.show...(Object parent or null,...); sobrecargado
        String nombre="";
        nombre=JOptionPane.showInputDialog(null, "Tu nombre?");
        JOptionPane.showConfirmDialog(null, nombre);
        //int i=1; int j=2;int k=3; int m=2; System.out.println ((j >= i) || (k == m));
    }
    
}
