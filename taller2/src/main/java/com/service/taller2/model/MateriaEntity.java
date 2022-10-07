package com.service.taller2.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "materia")
public class MateriaEntity implements Serializable {

    //Serializacion
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_materia")
    private Long id_materia;

    @NotNull
    @Column(name = "nombre_materia")
    private String nombre_materia;

    @NotNull
    @Column(name = "referencia_materia")
    private String referencia_materia;

    public Long getId_materia() {
        return id_materia;
    }

    public void setId_materia(Long id_materia) {
        this.id_materia = id_materia;
    }

    public String getNombre_materia() {
        return nombre_materia;
    }

    public void setNombre_materia(String nombre_materia) {
        this.nombre_materia = nombre_materia;
    }

    public String getReferencia_materia() {
        return referencia_materia;
    }

    public void setReferencia_materia(String referencia_materia) {
        this.referencia_materia = referencia_materia;
    }
}

