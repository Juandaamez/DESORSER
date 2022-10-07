package com.service.taller2.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "programa")
public class ProgramaEntity implements Serializable {

    //Serializacion
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_programa")
    private Long id_programa;

    @NotNull
    @Column(name = "nombre_programa")
    private String nombre_programa;

    public Long getId_programa() {
        return id_programa;
    }

    public void setId_programa(Long id_programa) {
        this.id_programa = id_programa;
    }

    public String getNombre_programa() {
        return nombre_programa;
    }

    public void setNombre_programa(String nombre_programa) {
        this.nombre_programa = nombre_programa;
    }
}

