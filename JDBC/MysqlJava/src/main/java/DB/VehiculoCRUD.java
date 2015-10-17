/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import Logic.Vehiculo;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Mario Osorio
 */
public class VehiculoCRUD {
    private String query;
    public String insertarVehiculo(Vehiculo veh){
        this.query="INSERT INTO vehiculo "
                + "VALUES("+veh.getId()+",'"+veh.getPlaca()+"','"+veh.getNombre()+"','"+veh.getMarca()+"');";
        return query;
    }
    public String consultarVehiculo(){
        this.query="SELECT * FROM vehiculo;";
        
        return query;
    }
     public String modificarVehiculo(){
        this.query="UPDATE vehiculo SET nombre='Modificado' WHERE vehiculo_id=2;";
        
        return query;
    }
    public void mostrarVehiculos(ResultSet r) throws SQLException{
        if(r.next()){
            do{
                System.out.println(r.getString("placa"));
            }while(r.next());
        }else{
            System.out.println("No traigo nada");
        }
    }
    public String borrarVehiculo(){
        this.query="DELETE FROM vehiculo WHERE vehiculo_id=1;";
        return query;
    }
}
