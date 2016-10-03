/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sources;

/**
 *
 * @author alumno
 */
public class Autobus extends Vehiculo {
    private int numeroPlazas;

    public Autobus(int numeroPlazas, String matricula, int modelo, float potencia) {
        super(matricula, modelo, potencia);
        this.numeroPlazas = numeroPlazas;
    }

    public int getNumeroPlazas() {
        return numeroPlazas;
    }

    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }

    @Override
    public String toString() {
        return super.toString()+" Autobus{" + "numeroPlazas=" + numeroPlazas + '}';
    }
    
}
