/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.*;



/**
 *
 * @author galva
 */
@ManagedBean(name="themeService", eager = true)
@ApplicationScoped
public class ThemeService {
     
    private List<Theme> themes;
     
    @PostConstruct
    public void init() {
        themes = new ArrayList<>();
        
        themes.add(new Theme(0, "Bootstrap", "bootstrap"));
        themes.add(new Theme(1, "Dark-Hive", "dark-hive"));
        themes.add(new Theme(2, "Ui-Darknes", "ui-darkness"));
        themes.add(new Theme(3, "Luna-Blue", "luna-blue"));
        themes.add(new Theme(4, "Luna-Amber", "luna-amber"));
        themes.add(new Theme(5, "Luna-Green", "luna-green"));
        themes.add(new Theme(6, "Luna-Pink", "luna-pink"));
        themes.add(new Theme(7, "Omega", "omega"));
    }
     
    public List<Theme> getThemes() {
        return themes;
    } 
}