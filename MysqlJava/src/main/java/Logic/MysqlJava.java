package Logic;

import DB.DataBase;
import DB.VehiculoCRUD;
import java.sql.SQLException;


public class MysqlJava {
    public static void main(String[] args) throws SQLException {
        System.out.println("Nivel Externo, estoy corriendo en java");
        DataBase DB= new DataBase();
    //Conexion
        DB.Conectar();
       Vehiculo vehiculo= new Vehiculo(11, "placaX", "nombreX", "marcaX");
       System.out.println("Creación de un objeto en la vista externa(java)");
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
        System.out.println("Solicitud al SO");
        System.out.println("Identificación del registro fisico");
        System.out.println("Proceso inverso de resultado");
        DB.Cerrar();
    }
}
