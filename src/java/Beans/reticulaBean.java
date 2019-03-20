/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Dao.reticulaDao;
import Model.MateriaReticula;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Luis Galvan
 */
@ManagedBean
@ViewScoped
public class reticulaBean implements Serializable{
    private List<MateriaReticula> lstMaterias;
    private MateriaReticula materias = new MateriaReticula();

    public List<MateriaReticula> getLstMaterias() {
        return lstMaterias;
    }

    public void setLstMaterias(List<MateriaReticula> lstMaterias) {
        this.lstMaterias = lstMaterias;
    }

    public MateriaReticula getMaterias() {
        return materias;
    }

    public void setMaterias(MateriaReticula materias) {
        this.materias = materias;
    }
    
    public List<MateriaReticula> listarMateriasPrimerSemestre() throws Exception {
    
        reticulaDao dao;
        try {
            dao = new reticulaDao();
            this.lstMaterias=dao.listarPrimerSemestre(1);
            return lstMaterias;
            
        } catch (Exception e) {
            throw e;
        }
        
    }
    public List<MateriaReticula> listarMateriasSegundoSemestre() throws Exception {
    
        reticulaDao dao;
        try {
            dao = new reticulaDao();
            this.lstMaterias=dao.listarSegundoSemestre(1);
            return lstMaterias;
            
        } catch (Exception e) {
            throw e;
        }
        
    }
    
    public List<MateriaReticula> listarMateriasTercerSemestre() throws Exception {
    
        reticulaDao dao;
        try {
            dao = new reticulaDao();
            this.lstMaterias=dao.listarTercerSemestre(1);
            return lstMaterias;
            
        } catch (Exception e) {
            throw e;
        }
        
    }
    public List<MateriaReticula> listarMateriasCuartoSemestre() throws Exception {
    
        reticulaDao dao;
        try {
            dao = new reticulaDao();
            this.lstMaterias=dao.listarCuartoSemestre(1);
            return lstMaterias;
            
        } catch (Exception e) {
            throw e;
        }
        
    }
    
    public List<MateriaReticula> listarMateriasQuintoSemestre() throws Exception {
    
        reticulaDao dao;
        try {
            dao = new reticulaDao();
            this.lstMaterias=dao.listarQuintoSemestre(1);
            return lstMaterias;
            
        } catch (Exception e) {
            throw e;
        }
        
    }
}
