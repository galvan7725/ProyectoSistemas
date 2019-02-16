/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Util.MyUtil;
import Util.loginClass;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.primefaces.context.RequestContext;

/**
 *
 * @author galva
 */
@ManagedBean
@RequestScoped
public class loginBean {
    
    private int matricula;
    private String clave;
    private int rol;
    private int carrera;

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    public int getCarrera() {
        return carrera;
    }

    public void setCarrera(int carrera) {
        this.carrera = carrera;
    }
    

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    
    
    public void login(ActionEvent actionEvent) throws Exception{
    RequestContext context = RequestContext.getCurrentInstance();
        FacesMessage msg;
        boolean loggedIn;
        String ruta = "";
        
        loginClass l = new loginClass();
        boolean lo = false;
        lo=l.login(this.matricula, this.rol, this.carrera, this.clave);
        if(l.login(this.matricula, this.rol, this.carrera, this.clave)){
            System.out.println("login");
            msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Bienvenido", String.valueOf(this.matricula));
            loggedIn = true;
         
            
            FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario", this.matricula);
             FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("rol", this.rol);
              FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario", this.carrera);
               ruta = MyUtil.basepathlogin() + "views/Index.xhtml";
            //FacesContext.getCurrentInstance().getExternalContext().redirect("views/Index.xhtml");
        }else{
            msg = new FacesMessage(FacesMessage.SEVERITY_FATAL, "LoginError", "Usuario y/o clave incorrectas");
            loggedIn = false;
            
            
        }
        FacesContext.getCurrentInstance().addMessage(null, msg);
        context.addCallbackParam("loggedIn", loggedIn);
        context.addCallbackParam("ruta", ruta);
    }
}
