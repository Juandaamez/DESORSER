package com.usta.tallercrud.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "estudiantes_materias")
public class EstudiantesMateriasEntity implements Serializable {

    //Serializacion
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estudiante_materias")
    private Long id_estudiante_materias;

    @NotNull
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_estudiante", referencedColumnName = "id_estudiante")
    private EstudiantesEntity id_estudiante;

    @NotNull
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_materia", referencedColumnName = "id_materia")
    private MateriasEntity id_materia;

    public Long getId_estudiante_materias() {
        return id_estudiante_materias;
    }

    public void setId_estudiante_materias(Long id_estudiante_materias) {
        this.id_estudiante_materias = id_estudiante_materias;
    }

    public EstudiantesEntity getId_estudiante() {
        return id_estudiante;
    }

    public void setId_estudiante(EstudiantesEntity id_estudiante) {
        this.id_estudiante = id_estudiante;
    }

    public MateriasEntity getId_materia() {
        return id_materia;
    }

    public void setId_materia(MateriasEntity id_materia) {
        this.id_materia = id_materia;
    }
}

