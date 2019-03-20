/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.MateriaReticula;
import Util.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luis Galvan
 */
public class reticulaDao {

    public List<MateriaReticula> listarPrimerSemestre(int id_especialidad) throws SQLException {
        List<MateriaReticula> lista;
        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion conn = new Conexion();
            Connection con = conn.getConexion();

            String sql = "call select_materias(?,?);";
            System.out.println("sql usuarios");
            ps = con.prepareStatement(sql);
            ps.setInt(1, 1);
            ps.setInt(2, id_especialidad);
            rs = ps.executeQuery();
            lista = new ArrayList();

            while (rs.next()) {
                MateriaReticula m = new MateriaReticula();
                m.setNombre(rs.getString("nombre"));
                m.setClave(rs.getString("clave_materia"));
                m.setCreditos(rs.getString("creditos"));

                lista.add(m);
            }
            return lista;
        } catch (SQLException e) {
            throw e;
        }

    }
    
    public List<MateriaReticula> listarSegundoSemestre(int id_especialidad) throws SQLException {
        List<MateriaReticula> lista;
        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion conn = new Conexion();
            Connection con = conn.getConexion();

            String sql = "call select_materias(?,?);";
            System.out.println("sql usuarios");
            ps = con.prepareStatement(sql);
            ps.setInt(1, 2);
            ps.setInt(2, id_especialidad);
            rs = ps.executeQuery();
            lista = new ArrayList();
            String nombre_materia="";
            String clave_materia="";
            String creditos_materia ="";
            String datos_materia="";
            while (rs.next()) {
//                nombre_materia = rs.getString("nombre");
//                clave_materia = rs.getString("clave_materia");
//                creditos_materia = rs.getString("creditos");
//                datos_materia = nombre_materia+clave_materia+creditos_materia;
                
                MateriaReticula m = new MateriaReticula();
                m.setNombre(rs.getString("nombre"));
                m.setClave(rs.getString("clave_materia"));
                m.setCreditos(rs.getString("creditos"));

                lista.add(m);
            }
            return lista;
        } catch (SQLException e) {
            throw e;
        }

    }
    
    public List<MateriaReticula> listarTercerSemestre(int id_especialidad) throws SQLException {
        List<MateriaReticula> lista;
        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion conn = new Conexion();
            Connection con = conn.getConexion();

            String sql = "call select_materias(?,?);";
            System.out.println("sql usuarios");
            ps = con.prepareStatement(sql);
            ps.setInt(1, 3);
            ps.setInt(2, id_especialidad);
            rs = ps.executeQuery();
            lista = new ArrayList();

            while (rs.next()) {
                MateriaReticula m = new MateriaReticula();
                m.setNombre(rs.getString("nombre"));
                m.setClave(rs.getString("clave_materia"));
                m.setCreditos(rs.getString("creditos"));

                lista.add(m);
            }
            return lista;
        } catch (SQLException e) {
            throw e;
        }

    }
    public List<MateriaReticula> listarCuartoSemestre(int id_especialidad) throws SQLException {
        List<MateriaReticula> lista;
        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion conn = new Conexion();
            Connection con = conn.getConexion();

            String sql = "call select_materias(?,?);";
            System.out.println("sql usuarios");
            ps = con.prepareStatement(sql);
            ps.setInt(1, 4);
            ps.setInt(2, id_especialidad);
            rs = ps.executeQuery();
            lista = new ArrayList();

            while (rs.next()) {
                MateriaReticula m = new MateriaReticula();
                m.setNombre(rs.getString("nombre"));
                m.setClave(rs.getString("clave_materia"));
                m.setCreditos(rs.getString("creditos"));

                lista.add(m);
            }
            return lista;
        } catch (SQLException e) {
            throw e;
        }

    }
    
     public List<MateriaReticula> listarQuintoSemestre(int id_especialidad) throws SQLException {
        List<MateriaReticula> lista;
        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion conn = new Conexion();
            Connection con = conn.getConexion();

            String sql = "call select_materias(?,?);";
            System.out.println("sql usuarios");
            ps = con.prepareStatement(sql);
            ps.setInt(1, 5);
            ps.setInt(2, id_especialidad);
            rs = ps.executeQuery();
            lista = new ArrayList();

            while (rs.next()) {
                MateriaReticula m = new MateriaReticula();
                m.setNombre(rs.getString("nombre"));
                m.setClave(rs.getString("clave_materia"));
                m.setCreditos(rs.getString("creditos"));

                lista.add(m);
            }
            return lista;
        } catch (SQLException e) {
            throw e;
        }

    }
}
