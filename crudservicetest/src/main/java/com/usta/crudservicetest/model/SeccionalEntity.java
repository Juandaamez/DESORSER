package com.usta.crudservicetest.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "seccional")
public class SeccionalEntity implements Serializable {

    //Serializacion
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_seccional")
    private Long id_seccional;

    @NotNull
    @Column(name = "direccion_seccional")
    private String direccion_seccional;

    @NotNull
    @Column(name = "nombre_seccional")
    private String nombre_seccional;

    @JoinColumn(name = "id_universidad", referencedColumnName = "id_universidad")
    @ManyToOne(fetch =  FetchType.EAGER)
    private UniversidadEntity universidadEntity ;

    public Long getId_seccional() {
        return id_seccional;
    }

    public void setId_seccional(Long id_seccional) {
        this.id_seccional = id_seccional;
    }

    public String getDireccion_seccional() {
        return direccion_seccional;
    }

    public void setDireccion_seccional(String direccion_seccional) {
        this.direccion_seccional = direccion_seccional;
    }

    public String getNombre_seccional() {
        return nombre_seccional;
    }

    public void setNombre_seccional(String nombre_seccional) {
        this.nombre_seccional = nombre_seccional;
    }

    public UniversidadEntity getUniversidadEntity() {
        return universidadEntity;
    }

    public void setUniversidadEntity(UniversidadEntity universidadEntity) {
        this.universidadEntity = universidadEntity;
    }
}
