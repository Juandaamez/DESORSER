package com.usta.taller05.repository;

import com.usta.taller05.model.PacientesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PacientesRepository extends JpaRepository<PacientesEntity, Long> {

    @Query("SELECT pac " +
            "FROM PacientesEntity AS pac " +
            "INNER JOIN UsuariosEntity as usr " +
            "ON usr.id_usuario = pac.usuario.id_usuario " +
            "WHERE usr.username = ?1 AND usr.password = ?2")
    public PacientesEntity getPacienteByPass(String username, String pass);

}
