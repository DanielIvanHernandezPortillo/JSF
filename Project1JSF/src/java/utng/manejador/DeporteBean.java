/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.manejador;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import utng.datos.DeporteDAO;
import utng.modelo.Deporte;

/**
 *
 * @author Daniel Iván Hernández Portillo danny10hp12@gmail.com
 */
@ManagedBean @SessionScoped
public class DeporteBean implements Serializable{
    private List<Deporte> deportes;
    private Deporte deporte;
    
    public DeporteBean(){
            // Todo Auto-generated constructor stub
    }

    public Deporte getDeporte() {
        return deporte;
    }

    public void setDeporte(Deporte deporte) {
        this.deporte = deporte;
    }

    public List<Deporte> getDeportes() {
        return deportes;
    }

    public void setDeportes(List<Deporte> deportes) {
        this.deportes = deportes;
    }
    
    public String listar(){
            DeporteDAO dao = new DeporteDAO();
            try {
                deportes = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
            return "Deportes";
    }
    public String eliminar(){
        DeporteDAO dao = new DeporteDAO();
        try {
                dao.delete(deporte);
                deportes = dao.getAll();
        } catch (Exception e) {
                e.printStackTrace();
        }
        return "Eliminar";
    }
    public String  iniciar(){
            deporte = new Deporte();
            return "Iniciar";
    }
    
    public String guardar () {
    DeporteDAO dao = new DeporteDAO();
        try {
                if(deporte.getIdDeporte()!=0){
                        dao.update(deporte);
                }else{
                    dao.insert(deporte);
                }
                deportes = dao.getAll();
        } catch (Exception e) {
                e.printStackTrace();
        }
        return "Guardar";
    }
    public String cancelar(){
            return "Cancelar";
    }
    public  String editar(Deporte deporte){
        this.deporte = deporte;
        return "Editar";
    }
    
}

