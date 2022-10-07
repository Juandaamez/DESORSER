package com.usta.crudservicetest.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "docente")
public class DocenteEntity implements Serializable {

    //Serializacion
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_docente")
    private Long id_docente;

    @NotNull
    @Column(name = "documento_docente")
    private String documento_docente;

    @NotNull
    @Column(name = "nombres_docente")
    private String nombres_docente;

    @NotNull
    @Column(name = "apellidos_docente")
    private String apellidos_docente;

    @NotNull
    @Column(name = "tipo_docente")
    private Long tipo_docente;

    @JoinColumn(name = "id_facultad", referencedColumnName = "id_facultad")
    @ManyToOne(fetch = FetchType.EAGER)
    private FacultadEntity facultadEntity;

    public Long getId_docente() {
        return id_docente;
    }

    public void setId_docente(Long id_docente) {
        this.id_docente = id_docente;
    }

    public String getDocumento_docente() {
        return documento_docente;
    }

    public void setDocumento_docente(String documento_docente) {
        this.documento_docente = documento_docente;
    }

    public String getNombres_docente() {
        return nombres_docente;
    }

    public void setNombres_docente(String nombres_docente) {
        this.nombres_docente = nombres_docente;
    }

    public String getApellidos_docente() {
        return apellidos_docente;
    }

    public void setApellidos_docente(String apellidos_docente) {
        this.apellidos_docente = apellidos_docente;
    }

    public Long getTipo_docente() {
        return tipo_docente;
    }

    public void setTipo_docente(Long tipo_docente) {
        this.tipo_docente = tipo_docente;
    }

    public FacultadEntity getFacultadEntity() {
        return facultadEntity;
    }

    public void setFacultadEntity(FacultadEntity facultadEntity) {
        this.facultadEntity = facultadEntity;
    }
}
