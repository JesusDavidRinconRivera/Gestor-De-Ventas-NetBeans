package Controlador;

import java.sql.*;

public class Conexion {
    Connection con;
    String driver = "com.mysql.jdbc.Driver";
    String usuario = "root";
    String contraseña = ""; 
    String url = "jdbc:mysql://localhost:3306/gestor-de-inventario";

    public  Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestor-de-inventario", "root", "");
            System.out.println("conectó esa madre");
        } catch (Exception e) {
            System.err.println("(no conectó esa madre) Error " + e);
        }
     
    }
}


