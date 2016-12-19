/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autobuses;

public class Venta {
    private String origen;
    private String destino;
    private String nombre;
    private int precio;
    private int boletos;
    private int maestros;
    private int alumnos;
    private double precioFinal;
    
    public Venta(String origen, String destino, int precio){
        this.origen = origen;
        this.destino = destino;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getBoletos() {
        return boletos;
    }

    public void setBoletos(int boletos) {
        this.boletos = boletos;
    }

    public int getMaestros() {
        return maestros;
    }

    public void setMaestros(int maestros) {
        this.maestros = maestros;
    }

    public int getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(int alumnos) {
        this.alumnos = alumnos;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }
    
    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    public int calcularPrecio(){
        int respuesta = 1;
        if((maestros + alumnos) > (boletos)){
            respuesta = 0;
        }else{
            int restantes = boletos - (maestros+alumnos);
            precioFinal = (restantes * precio)+(maestros * precio * 0.75)+(alumnos*precio*0.25);
        }
        return respuesta;
    }
    
}
