/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mario Osorio
 */
public class Lugar {
    private short estado;
    private String coord;
    
    public Lugar(short state, String local){
        this.estado=state;
        this.coord=local;
    }
    public short getEstado(){
        return estado;
    }
    public String getLocalizacion(){
        return coord;
    }
    public void setEstado(short state){
        this.estado=state;
    }
    public void setLocalizacion(String Local){
        if(Local.length()>10){
            this.coord=Local;
        }else{
            System.out.println("Localidad Errónea");
        }
    }
}
