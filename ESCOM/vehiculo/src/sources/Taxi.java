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
public class Taxi extends Vehiculo{
    private String numeroLicencia;
   
    public Taxi(String matricula, int modelo, float potencia, String licencia){
        super(matricula,modelo,potencia);
        this.numeroLicencia = licencia;
    }

    public Taxi(String numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }

    public String getLicencia() {
        return numeroLicencia;
    }

    public void setLicencia(String licencia) {
        this.numeroLicencia = licencia;
    }

    @Override
    public String toString() {
        return super.toString()+" Taxi{" + "numeroLicencia=" + numeroLicencia + '}';
    }
    
}
