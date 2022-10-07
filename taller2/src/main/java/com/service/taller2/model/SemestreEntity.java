package com.service.taller2.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "semestre")
public class SemestreEntity implements Serializable {

    //Serializacion
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_semestre")
    private Long id_semestre;

    @NotNull
    @Column(name = "nombre_semestre")
    private String nombre_semestre;

    public Long getId_semestre() {
        return id_semestre;
    }

    public void setId_semestre(Long id_semestre) {
        this.id_semestre = id_semestre;
    }

    public String getNombre_semestre() {
        return nombre_semestre;
    }

    public void setNombre_semestre(String nombre_semestre) {
        this.nombre_semestre = nombre_semestre;
    }
}

