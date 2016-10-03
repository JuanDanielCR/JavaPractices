package sources;

/**
 *
 * @author alumno
 */
public class Vehiculo {
    protected String matricula;
    protected int modelo;
    protected float potencia;

    public Vehiculo(String matricula, int modelo, float potencia) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.potencia = potencia;
    }
    public Vehiculo(){
        this.matricula = "Sin matricula";
        this.modelo = 1;
        this.potencia = 0f;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getModelo() {
        return modelo;
    }

    public float getPotencia() {
        return potencia;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "matricula=" + matricula + ", modelo=" + modelo + ", potencia=" + potencia + '}';
    }
   
}
