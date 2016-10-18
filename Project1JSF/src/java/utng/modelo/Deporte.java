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
import javax.persistence.Table;

/**
 *
 * @author Daniel Iván Hernández Portillo danny10hp12@gmail.com
 */
@Entity @Table(name="deporte")
public class Deporte implements Serializable{
        @Id
        @GeneratedValue(
                        strategy = GenerationType.IDENTITY)
        @Column(name="id_deporte")
        private Long idDeporte;
        @Column(length = 30)
        private String nombre;
        @Column(length = 30)
        private String nacionalidad;
        @Column(length = 30)
        private int numeroJugador;
        
        
        public Deporte() {
                this.idDeporte = 0L;
        }

    public Long getIdDeporte() {
        return idDeporte;
    }

    public void setIdDeporte(Long idDeporte) {
        this.idDeporte = idDeporte;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getNumeroJugador() {
        return numeroJugador;
    }

    public void setNumeroJugador(int numeroJugador) {
        this.numeroJugador = numeroJugador;
    }

    
        
}

