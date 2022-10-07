package com.usta.taller05.model;

import com.sun.istack.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "citas_pacientes")
public class Citas_PacientesEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_citas_pacientes")
    private Long id_citas_pacientes;

    @JoinColumn(name = "id_cita", referencedColumnName = "id_cita")
    @ManyToOne(fetch = FetchType.EAGER)
    private CitasEntity cita;

    @JoinColumn(name = "id_paciente", referencedColumnName = "id_paciente")
    @ManyToOne(fetch = FetchType.EAGER)
    private PacientesEntity paciente;

    public Long getId_citas_pacientes() {
        return id_citas_pacientes;
    }

    public void setId_citas_pacientes(Long id_citas_pacientes) {
        this.id_citas_pacientes = id_citas_pacientes;
    }

    public CitasEntity getCita() {
        return cita;
    }

    public void setCita(CitasEntity cita) {
        this.cita = cita;
    }

    public PacientesEntity getPaciente() {
        return paciente;
    }

    public void setPaciente(PacientesEntity paciente) {
        this.paciente = paciente;
    }
}