package com.service.taller2.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "pensum")
public class PensumEntity implements Serializable {

    //Serializacion
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pensum")
    private Long id_pensum;

    @NotNull
    @Column(name = "nombre_pensum")
    private String nombre_pensum;

    @NotNull
    @Column(name = "periodo_pensum")
    private String periodo_pensum;

    @JoinColumn(name = "id_programa", referencedColumnName = "id_programa")
    @ManyToOne(fetch = FetchType.EAGER)
    private ProgramaEntity programaEntity;

    public Long getId_pensum() {
        return id_pensum;
    }

    public void setId_pensum(Long id_pensum) {
        this.id_pensum = id_pensum;
    }

    public String getNombre_pensum() {
        return nombre_pensum;
    }

    public void setNombre_pensum(String nombre_pensum) {
        this.nombre_pensum = nombre_pensum;
    }

    public String getPeriodo_pensum() {
        return periodo_pensum;
    }

    public void setPeriodo_pensum(String periodo_pensum) {
        this.periodo_pensum = periodo_pensum;
    }

    public ProgramaEntity getProgramaEntity() {
        return programaEntity;
    }

    public void setProgramaEntity(ProgramaEntity programaEntity) {
        this.programaEntity = programaEntity;
    }
}

