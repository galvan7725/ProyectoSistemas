/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.io.IOException;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author galvan
 */

@ManagedBean
@RequestScoped
public class loginController {
    public void verificarSesion(){
    String usuario;
        try {
           usuario =  (String) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("id_usuario");
           if(usuario == null){
               System.err.println("Usuario nulo");
           FacesContext.getCurrentInstance().getExternalContext().redirect("./../login.xhtml");
           }
        } catch (Exception e) {
        e.printStackTrace();
        }
        
    }
    
    public void borrarSession() throws IOException{
   FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Hasta Luego", null ); 

        
    
    FacesContext.getCurrentInstance().getExternalContext().redirect("./../login.xhtml");
    FacesContext.getCurrentInstance().getExternalContext().getSessionMap().clear();
    }
    
}
