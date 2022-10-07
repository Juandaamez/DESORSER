package com.usta.crudservicetest.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "asignatura")
public class AsignaturaEntity implements Serializable {

    //Serializacion
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_asignatura")
    private Long id_asignatura;

    @NotNull
    @Column(name = "semestre_asignatura")
    private Long semestre_asignatura;

    @NotNull
    @Column(name = "nombre_asignatura")
    private String nombre_asignatura;

    @NotNull
    @Column(name = "codigo_asignatura")
    private Long codigo_asignatura;

    @NotNull
    @Column(name = "tipo_asignatura")
    private String tipo_asignatura;

    @JoinColumn(name = "id_docente", referencedColumnName = "id_docente")
    @ManyToOne(fetch = FetchType.EAGER)
    private DocenteEntity docenteEntity;

    public Long getId_asignatura() {
        return id_asignatura;
    }

    public void setId_asignatura(Long id_asignatura) {
        this.id_asignatura = id_asignatura;
    }

    public Long getSemestre_asignatura() {
        return semestre_asignatura;
    }

    public void setSemestre_asignatura(Long semestre_asignatura) {
        this.semestre_asignatura = semestre_asignatura;
    }

    public String getNombre_asignatura() {
        return nombre_asignatura;
    }

    public void setNombre_asignatura(String nombre_asignatura) {
        this.nombre_asignatura = nombre_asignatura;
    }

    public Long getCodigo_asignatura() {
        return codigo_asignatura;
    }

    public void setCodigo_asignatura(Long codigo_asignatura) {
        this.codigo_asignatura = codigo_asignatura;
    }

    public String getTipo_asignatura() {
        return tipo_asignatura;
    }

    public void setTipo_asignatura(String tipo_asignatura) {
        this.tipo_asignatura = tipo_asignatura;
    }

    public DocenteEntity getDocenteEntity() {
        return docenteEntity;
    }

    public void setDocenteEntity(DocenteEntity docenteEntity) {
        this.docenteEntity = docenteEntity;
    }
}

