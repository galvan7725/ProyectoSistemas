/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;



import Util.MyUtil;
import javax.faces.bean.ApplicationScoped;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author galva
 */
@ApplicationScoped
@ManagedBean
public class appBean {

    /**
     * Creates a new instance of appBean
     */
    loginBean l= new loginBean();
    private  int id= l.getRol();
    public appBean() {
        this.id= id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
   
    
    public String getBaseUrl(){
    return MyUtil.baseurl();
    }
    
    public String getBasePath(){
    return MyUtil.basepath();
    }
    
    
    
    
    public String getBasePathLogin(){
    return MyUtil.login();
    }
    
    public String vistaInicio(){
        return MyUtil.vistas();
    }
    
}
