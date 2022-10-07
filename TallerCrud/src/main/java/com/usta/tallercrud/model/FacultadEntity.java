package com.usta.tallercrud.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "facultad")
public class FacultadEntity implements Serializable {

    //Serializacion
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_facultad")
    private Long id_facultad;

    @NotNull
    @Column(name = "nombre_facultad")
    private String nombre_facultad;

    public Long getId_facultad() {
        return id_facultad;
    }

    public void setId_facultad(Long id_facultad) {
        this.id_facultad = id_facultad;
    }

    public String getNombre_facultad() {
        return nombre_facultad;
    }

    public void setNombre_facultad(String nombre_facultad) {
        this.nombre_facultad = nombre_facultad;
    }
}

