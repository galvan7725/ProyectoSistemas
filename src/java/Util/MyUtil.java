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
import java.util.ArrayList;


/**
 *
 * @author galva
 */
public class MyUtil {
 
    public static String baseurl(){
    return "http://localhost:8084/ProyectoSistemas/";
    }
    
    public static String basepathlogin(){
    return "/ProyectoSistemas/faces/";
    }
    
    //redireccion a las vistas
    
    public static String basepath(){
    return "/faces/views/";
    }
    
    public static String login(){
    return "/faces/";
    }
    
    public static String vistas(){
    return "views/";
    }
    
    
    
}
