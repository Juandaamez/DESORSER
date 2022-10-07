package com.service.taller2.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "materias_pensum")
public class MateriaPensumEntity implements Serializable {

    //Serializacion
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_materiaPensum")
    private Long id_materiaPensum;

    @JoinColumn(name = "id_semestre", referencedColumnName = "id_semestre")
    @ManyToOne(fetch = FetchType.EAGER)
    private SemestreEntity semestreEntity;

    @JoinColumn(name = "id_pensum", referencedColumnName = "id_pensum")
    @ManyToOne(fetch = FetchType.EAGER)
    private PensumEntity pensumEntity;

    @JoinColumn(name = "id_materia", referencedColumnName = "id_materia")
    @ManyToOne(fetch = FetchType.EAGER)
    private MateriaEntity materiaEntity;

    public Long getId_materiaPensum() {
        return id_materiaPensum;
    }

    public void setId_materiaPensum(Long id_materiaPensum) {
        this.id_materiaPensum = id_materiaPensum;
    }

    public SemestreEntity getSemestreEntity() {
        return semestreEntity;
    }

    public void setSemestreEntity(SemestreEntity semestreEntity) {
        this.semestreEntity = semestreEntity;
    }

    public PensumEntity getPensumEntity() {
        return pensumEntity;
    }

    public void setPensumEntity(PensumEntity pensumEntity) {
        this.pensumEntity = pensumEntity;
    }

    public MateriaEntity getMateriaEntity() {
        return materiaEntity;
    }

    public void setMateriaEntity(MateriaEntity materiaEntity) {
        this.materiaEntity = materiaEntity;
    }
}

