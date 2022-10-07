package com.usta.taller05.model;

import com.sun.istack.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "estatus")
public class EstatusEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estatus")
    private Long id_estatus;

    @NotNull
    @Column(name = "nombre_estatus")
    private String nombre_estatus;

    public Long getId_estatus() {
        return id_estatus;
    }

    public void setId_estatus(Long id_estatus) {
        this.id_estatus = id_estatus;
    }

    public String getNombre_estatus() {
        return nombre_estatus;
    }

    public void setNombre_estatus(String nombre_estatus) {
        this.nombre_estatus = nombre_estatus;
    }
}