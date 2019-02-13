
package Util;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    
    private final String base = "proyectosistemas";
    private final String user = "root";
    private final String password = "";
    private final String url = "jdbc:mysql://localhost:3306/" + base+"?useTimezone=true&serverTimezone=UTC";
    private Connection con = null;
    
    public Connection getConexion()
    {
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(this.url, this.user, this.password);
            //con = (Connection) DriverManager.getConnection("jdbc:mysql://192.168.1.199:3307/luis" ,"Anahi","12345678");
            System.out.println("Conexion Exitosa");
        } catch(SQLException e)
        {
            System.err.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
      return con;  
    }
    
        public ResultSet visualizar(int id){
    Connection con = getConexion();
    ResultSet rs = null;
        try {
            PreparedStatement ps= con.prepareStatement("select foto from usuarios where id = "+id+";");
            rs = ps.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("ResultSet ejectado");
        return rs;
    }

    public void guardar_imagen(String ruta, String nombre){
    Connection con = getConexion();
    String insert = "insert into usuario (nombre, foto) values (?,?)";
       FileInputStream fi = null;
       PreparedStatement ps = null;
        try {
            File file = new File(ruta);
            fi = new FileInputStream(file);
            
            ps = con.prepareStatement(insert);
            ps.setString(1, nombre);
            ps.setBinaryStream(2, fi);
            
            ps.executeUpdate();
            
        } catch (Exception e) {
        e.printStackTrace();
        }
    }

}
