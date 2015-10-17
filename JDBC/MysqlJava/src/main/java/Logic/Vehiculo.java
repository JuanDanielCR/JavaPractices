/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

/**
 *
 * @author Mario Osorio
 */
public class Vehiculo {
    private int id;
    private String nombre;
    private String placa;
    private String marca;
    
    public Vehiculo(int ID, String NOMBRE, String PLACA, String MARCA){
        this.id=ID;
        this.nombre=NOMBRE;
        this.placa=PLACA;
        this.marca=MARCA;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase();
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa.toUpperCase();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca.toUpperCase();
    }
    
}
