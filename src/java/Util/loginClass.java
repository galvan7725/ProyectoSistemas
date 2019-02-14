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
public class loginClass {

    public boolean login(int id_usuario, int id_rol, int id_carrera, String clave) throws SQLException {
        Object[] respuesta = new Object[4];
        respuesta = consulta_datos(id_usuario, id_rol, id_carrera, clave);

        if(String.valueOf(respuesta[0]) != null){
        return true;
        }else{
        return false;
        }
    }

    public String[] consulta_datos(int id_usuario, int id_rol, int id_carrera, String clave) throws SQLException {
        Conexion conn = new Conexion();
        Connection con = conn.getConexion();
        try {
            PreparedStatement ps = null;
            ResultSet rs = null;

            
            String sql = "call login(" + id_usuario + "," + id_rol + "," + id_carrera + ",'" + clave + "');";
            System.out.println(sql);
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            String resultado[] = new String[4];

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

            if (resultado[0] != null) {
                return resultado;
            } else {
                return null;
            }
        } catch (Exception e) {
            throw e;
        } finally {
            con.close();
        }
        

    }

}
