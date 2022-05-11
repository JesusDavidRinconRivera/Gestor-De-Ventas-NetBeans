package Modelo;
import Controlador.Conexion;

import java.sql.*;
import java.util.*;

public class ProductoDao {
    Conexion conexion = new Conexion();
    Connection con ;
    PreparedStatement ps;
    ResultSet rs;
    
    public List listar(){
        String sql = "select * from cliente";
        List<Producto> lista = new ArrayList<>();
        
        try {
            con =  conexion.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error En listar():"+e);
        }
        
    }
    
          //https://www.youtube.com/watch?v=K96qN_8349Q  
}
