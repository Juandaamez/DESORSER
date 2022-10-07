package com.usta.taller05.model;

import com.sun.istack.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "citas")
public class CitasEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cita")
    private Long id_cita;

    @NotNull
    @Column(name = "titulo")
    private String titulo;

    @NotNull
    @Column(name = "nota")
    private String nota;

    @NotNull
    @Column(name = "fecha_cita")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date fecha_cita;

    @NotNull
    @Column(name = "sintomas")
    private String sintomas;

    @NotNull
    @Column(name = "medicamentos")
    private String medicamentos;

    @NotNull
    @Column(name = "tipo_cita")
    private int tipo_cita;

    @NotNull
    @Column(name = "antecedentes")
    private boolean antecedentes;

    @JoinColumn(name = "id_medico", referencedColumnName = "id_medico")
    @ManyToOne(fetch = FetchType.EAGER)
    private MedicosEntity medico;

    @JoinColumn(name = "id_pago", referencedColumnName = "id_pago")
    @ManyToOne(fetch = FetchType.EAGER)
    private PagosEntity pago;

    @JoinColumn(name = "id_estatus", referencedColumnName = "id_estatus")
    @ManyToOne(fetch = FetchType.EAGER)
    private EstatusEntity estatus;

    public Long getId_cita() {
        return id_cita;
    }

    public void setId_cita(Long id_cita) {
        this.id_cita = id_cita;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public Date getFecha_cita() {
        return fecha_cita;
    }

    public void setFecha_cita(Date fecha_cita) {
        this.fecha_cita = fecha_cita;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }

    public int getTipo_cita() {
        return tipo_cita;
    }

    public void setTipo_cita(int tipo_cita) {
        this.tipo_cita = tipo_cita;
    }

    public boolean isAntecedentes() {
        return antecedentes;
    }

    public void setAntecedentes(boolean antecedentes) {
        this.antecedentes = antecedentes;
    }

    public MedicosEntity getMedico() {
        return medico;
    }

    public void setMedico(MedicosEntity medico) {
        this.medico = medico;
    }

    public PagosEntity getPago() {
        return pago;
    }

    public void setPago(PagosEntity pago) {
        this.pago = pago;
    }

    public EstatusEntity getEstatus() {
        return estatus;
    }

    public void setEstatus(EstatusEntity estatus) {
        this.estatus = estatus;
    }
}