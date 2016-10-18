/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Deporte;

/**
 *
 * @author Daniel Iván Hernández Portillo danny10hp12@gmail.com
 */
public class DeporteDAO extends DAO<Deporte>{
        
        public DeporteDAO(){
                super(new Deporte());
        }
        
        public Deporte getOneById(Deporte deporte)
                        throws HibernateException {
                return super.getOneById(
                                deporte.getIdDeporte());
        }
    
}
