
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mario Osorio
 */
public class Estacionamiento {
    private ArrayList<Lugar> lugares=new ArrayList<>();
    private final String nombreEstacionamiento;
            
    public Estacionamiento(String nombre){
        this.nombreEstacionamiento=nombre;
    }

    public ArrayList<Lugar> getLugares() {
        return lugares;
    }


    public void setLugares(ArrayList<Lugar> lugares) {
        this.lugares = lugares;
    }
    
    public String getNombreEstacionamiento() {
        return nombreEstacionamiento;
    }
    public boolean validarAcceso (String clave){
           if(clave.startsWith("2013")){
               return true;
           }else{
               return false;
           }
    }
    public float calcularPago(Auto auto){
        float pagoFinal=(float) 0.0;
        switch(auto.getTipoAuto()){
            case 1:
                pagoFinal=(float)(auto.getTiempoLugar()*auto.getCostoLugar()+100);
            break;
            case 2:
                pagoFinal=(float)(auto.getTiempoLugar()*auto.getCostoLugar()+200);
            break;
            case 3:
                pagoFinal=(float)(auto.getTiempoLugar()*auto.getCostoLugar()+300);
            break;
            default:
                pagoFinal=(float)0.0;
                System.err.println("Tipo de Carro Invalido");
            break;
        }
        return pagoFinal;
    }
}
