/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;


/**
 *
 * @author galva
 */
@ManagedBean
@ViewScoped
public class templateBean {
    
    private String nombre;
    private String carrera;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    
    
    public void initDatos(){
    this.nombre = (String)FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("nombre");
    this.carrera= (String)FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("aCarrera");
    }
    
}
