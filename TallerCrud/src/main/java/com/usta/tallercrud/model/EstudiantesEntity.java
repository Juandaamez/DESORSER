package com.usta.tallercrud.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "estudiantes")
public class EstudiantesEntity implements Serializable {

    //Serializacion
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estudiante")
    private Long id_estudiante;

    @NotNull
    @Column(name = "nombres_estudiante")
    private String nombres_estudiante;

    @NotNull
    @Column(name = "primer_apellido")
    private String primer_apellido;

    @NotNull
    @Column(name = "segundo_apellido")
    private String segundo_apellido;

    @NotNull
    @Column(name = "documento")
    private int documento;

    @JoinColumn(name = "id_facultad", referencedColumnName = "id_facultad")
    @ManyToOne(fetch = FetchType.EAGER)
    private FacultadEntity id_facultad;

    public Long getId_estudiante() {
        return id_estudiante;
    }

    public void setId_estudiante(Long id_estudiante) {
        this.id_estudiante = id_estudiante;
    }

    public String getNombres_estudiante() {
        return nombres_estudiante;
    }

    public void setNombres_estudiante(String nombres_estudiante) {
        this.nombres_estudiante = nombres_estudiante;
    }

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    public String getSegundo_apellido() {
        return segundo_apellido;
    }

    public void setSegundo_apellido(String segundo_apellido) {
        this.segundo_apellido = segundo_apellido;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public FacultadEntity getId_facultad() {
        return id_facultad;
    }

    public void setId_facultad(FacultadEntity id_facultad) {
        this.id_facultad = id_facultad;
    }
}

