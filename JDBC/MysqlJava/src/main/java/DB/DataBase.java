/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JuanDanielCR
 */
public class DataBase {
    private final String URL="jdbc:mysql://localhost:3306/";
    private final String DB="platzi_java";
    private final String USER="root";
    private final String PASS="n0m3l0";
    
    private Connection conexion=null;
    private Statement st;
//CONECTAR
    public Connection Conectar(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
                //getConnection(URL+DATABASE,USER,PASS);
            conexion=(Connection) DriverManager.getConnection(URL+DB, USER, PASS);
            if(conexion!=null){
                System.out.println("Conexión Exitosa");
            }
        } 
        catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conexion;
    }
//INSERT    
    public void Insertar(String query) throws SQLException{
       this.st=(Statement) this.conexion.createStatement();
       if(st.executeUpdate(query)>0){
            System.out.println("Se inserto el registro");
        }else{
            System.out.println("No se Inserto: ");
            System.out.println(query);
        }
    }
//UPDATE
    public void Actualizar(String query) throws SQLException{
       this.st=(Statement) this.conexion.createStatement();
       st.executeUpdate(query);
       System.out.println("Modificado");
    }
//SELECT
    public ResultSet Consultar(String query) throws SQLException{
        this.st=(Statement) this.conexion.createStatement();
        return st.executeQuery(query);
    }
//BORRAR
    public int Borrar(String query) throws SQLException {
        this.st = (Statement) this.conexion.createStatement();
        return st.executeUpdate(query);
    } 
//CLOSE CONECCTION
    public void Cerrar(){
        try{ 
            this.conexion.close();
            System.out.println("Conexion Cerrada");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
