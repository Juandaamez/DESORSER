package com.usta.taller05.repository;

import com.usta.taller05.model.CitasEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CitasRepository extends JpaRepository<CitasEntity, Long> {

    @Query("SELECT cit.titulo, cit.antecedentes, med.email " +
            "FROM CitasEntity as cit " +
            "INNER JOIN MedicosEntity as med ON med.id_medico = cit.medico.id_medico " +
            "WHERE med.nombres = ?1 AND med.telefono = ?2")
    public String getCitaByMedico (String nombre, String numero);

    @Query("SELECT cit.sintomas, cit.antecedentes, pac.alergias " +
            "FROM Citas_PacientesEntity as cipa " +
            "INNER JOIN CitasEntity as cit ON cit.id_cita = cipa.cita.id_cita " +
            "INNER JOIN PacientesEntity as pac ON pac.id_paciente = cipa.paciente.id_paciente " +
            "WHERE pac.nombres = ?1")
    public String getCitaByPaciente (String nombre);

}
