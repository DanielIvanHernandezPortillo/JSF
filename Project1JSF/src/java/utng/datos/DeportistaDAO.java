/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Deportista;

/**
 *
 * @author Daniel Iván Hernández Portillo danny10hp12@gmail.com
 */
public class DeportistaDAO extends DAO<Deportista>{
   
    public DeportistaDAO(){
        super(new Deportista());
    }
    public Deportista getOneById(Deportista deportista) 
            throws HibernateException{
        return super.getOneById(deportista.getIdDeportista());        
    }
    
}
