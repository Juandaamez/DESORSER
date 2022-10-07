package com.usta.crudservicetest.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "universidad")
public class UniversidadEntity implements Serializable {

    //Serializacion
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_universidad")
    private Long id_universidad;

    @NotNull
    @Column(name = "nombre_universidad")
    private String nombre_universidad;

    @NotNull
    @Column(name = "nit_universidad")
    private String nit_universidad;

    @NotNull
    @Column(name = "nombre_pais")
    private String nombre_pais;

    public Long getId_universidad() {
        return id_universidad;
    }

    public void setId_universidad(Long id_universidad) {
        this.id_universidad = id_universidad;
    }

    public String getNombre_universidad() {
        return nombre_universidad;
    }

    public void setNombre_universidad(String nombre_universidad) {
        this.nombre_universidad = nombre_universidad;
    }

    public String getNit_universidad() {
        return nit_universidad;
    }

    public void setNit_universidad(String nit_universidad) {
        this.nit_universidad = nit_universidad;
    }

    public String getNombre_pais() {
        return nombre_pais;
    }

    public void setNombre_pais(String nombre_pais) {
        this.nombre_pais = nombre_pais;
    }
}
