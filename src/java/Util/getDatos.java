/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

/**
 *
 * @author galva
 */
public class getDatos {
    
    public String[] getDatos(int id_usuario) throws SQLException{
        Conexion conn = new Conexion();
        Connection con = conn.getConexion();
        try {
             PreparedStatement ps = null;
            ResultSet rs = null;

            
            String sql = "call datos(?);";
            System.out.println(sql);
            ps = con.prepareStatement(sql);
            ps.setInt(1, id_usuario);
            rs = ps.executeQuery();
            
             ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            String resultado[] = new String[2];

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                    resultado[i] = filas[i].toString();
                }
                //resultado[]=filas[];
                for (int j = 0; j < resultado.length; j++) {
                    System.out.println("Resultado --->" + resultado[j]);
                    //modelo.addRow(filas);

                }
            }
            
            return resultado;
            
        } catch (SQLException e) {
            throw e;
        }
    
}
    
    
}
