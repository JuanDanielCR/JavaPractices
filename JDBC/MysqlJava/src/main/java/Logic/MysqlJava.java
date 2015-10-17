/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import DB.DataBase;
import DB.VehiculoCRUD;
import java.sql.SQLException;

/**
 *
 * @author Mario Osorio
 */
public class MysqlJava {
    public static void main(String[] args) throws SQLException {
        System.out.println("Hi Dependencies");
        DataBase DB= new DataBase();
    //Conexion
        DB.Conectar();
       Vehiculo vehiculo= new Vehiculo(11, "placaX", "nombreX", "marcaX");
       VehiculoCRUD vehiculoCRUD= new VehiculoCRUD();
    //Insertar
       //DB.Insertar(vehiculoCRUD.insertarVehiculo(vehiculo));
    //Modificar
       DB.Actualizar(vehiculoCRUD.modificarVehiculo());
    //Eliminar
       DB.Borrar(vehiculoCRUD.borrarVehiculo());
    //Mostrar Data (Consultar)
        vehiculoCRUD.mostrarVehiculos(DB.Consultar(vehiculoCRUD.consultarVehiculo()));
    //Cerrar la Conexión
        DB.Cerrar();
    }
}
