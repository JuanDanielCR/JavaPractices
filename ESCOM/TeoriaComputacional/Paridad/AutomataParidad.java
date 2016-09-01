package automata.paridad;

import javax.swing.JOptionPane;

public class AutomataParidad {

    public static void main(String[] args) {
        Automata paridor = new Automata();
        String cadena="";
        boolean resultado;
        cadena=JOptionPane.showInputDialog(null, "Cadena de 01's");
        resultado = paridor.calcularParidad(cadena);
        System.out.println(resultado);
    }
}
