/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Daniel Iván Hernández Portillo danny10hp12@gmail.com
 */
@Entity @Table(name ="deportista")
public class Deportista implements Serializable{
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name ="id_deportista")
        private Long idDeportista;
        @Column (name = "nombre_deportista", length = 20)
        private String nombreDeportista;
        @Column (name= "apellido_deportista", length = 40) 
        private String apellidoDeportista;
        @Column (name= "eda", length = 5) 
        private int edad;
        @ManyToOne()
        @JoinColumn(name = "id_deporte")
        private Deporte deporte;
        public Deportista (Long idDeportista,String nombreDeportista, String apellidoDeportista,int edad, Deporte deporte){
                super();
                this.idDeportista= idDeportista;
                this.nombreDeportista = nombreDeportista;
                this.apellidoDeportista = apellidoDeportista;
                this.edad = edad;
                this.deporte = deporte;
        }

    
    public Deportista() {
     this.idDeportista=0L;
     
    }

    public Long getIdDeportista() {
        return idDeportista;
    }

    public void setIdDeportista(Long idDeportista) {
        this.idDeportista = idDeportista;
    }

    public String getNombreDeportista() {
        return nombreDeportista;
    }

    public void setNombreDeportista(String nombreDeportista) {
        this.nombreDeportista = nombreDeportista;
    }

    public String getApellidoDeportista() {
        return apellidoDeportista;
    }

    public void setApellidoDeportista(String apellidoDeportista) {
        this.apellidoDeportista = apellidoDeportista;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Deporte getDeporte() {
        return deporte;
    }

    public void setDeporte(Deporte deporte) {
        this.deporte = deporte;
    }
 
  
    
}

