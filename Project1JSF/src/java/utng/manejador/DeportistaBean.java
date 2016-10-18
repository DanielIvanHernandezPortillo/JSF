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
import utng.datos.DeportistaDAO;
import utng.modelo.Deporte;
import utng.modelo.Deportista;
/**
 *
 * @author Daniel Iván Hernández Portillo danny10hp12@gmail.com
 */
@ManagedBean (name = "deportistaBean") @SessionScoped
public class DeportistaBean implements Serializable{

    private List<Deportista>deportistas;
    private Deportista deportista;
    private List<Deporte> deportes;
    public DeportistaBean(){
        deportista = new Deportista();
        deportista.setDeporte(new Deporte());
    }

    public List<Deporte> getDeportes() {
        return deportes;
    }

    public void setDeportes(List<Deporte> deportes) {
        this.deportes = deportes;
    }

    public Deportista getDeportista() {
        return deportista;
    }

    public void setDeportista(Deportista deportista) {
        this.deportista = deportista;
    }

    public List<Deportista> getDeportistas() {
        return deportistas;
    }

    public void setDeportistas(List<Deportista> deportistas) {
        this.deportistas = deportistas;
    }
    public String listar(){
        DeportistaDAO dao = new DeportistaDAO();
        try{
            deportistas = dao.getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return "Deportistas";
    }
    public String eliminar(){
         DeportistaDAO dao = new DeportistaDAO();
        try{
            dao.delete(deportista);
            deportistas = dao.getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return "Eliminar";
    }
    public String iniciar(){
        deportista = new Deportista();
        deportista.setDeporte(new Deporte());
        try{
            deportes = new DeporteDAO().getAll();
        }catch(Exception e){
            e.printStackTrace(); 
        } 
        return "Iniciar";
    }
    public String guardar(){
        DeportistaDAO dao = new DeportistaDAO();
        try{
            if(deportista.getIdDeportista()!=0){
                dao.update(deportista);
            }else{
                dao.insert(deportista);
            }
            deportistas = dao.getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return "Guardar";
    }
    public String cancelar(){
        return "Cancelar";
    }
    public String editar(Deportista deportista){
        this.deportista = deportista;
        try{
            deportes = new DeporteDAO().getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return "Editar";
    }
    
}