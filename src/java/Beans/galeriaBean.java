/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.view.ViewScoped;


/**
 *
 * @author galva
 */
@ManagedBean
@ViewScoped
public class galeriaBean implements Serializable{
    
    private List<String> images;
    
    @PostConstruct
    public void init() {
        images = new ArrayList<String>();
        for (int i = 1; i <= 12; i++) {
            images.add("f" + i + ".jpg");
        }
    }
 
    public List<String> getImages() {
        System.out.println("lista");
        return images;
    }
    
}
