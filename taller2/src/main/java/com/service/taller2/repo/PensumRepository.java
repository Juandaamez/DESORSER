package com.service.taller2.repo;

import com.service.taller2.model.PensumEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PensumRepository extends JpaRepository<PensumEntity, Long> {

    @Query("SELECT COUNT(emp) FROM PensumEntity emp")
    public Integer countTotalPensums();

    @Query("SELECT pem.nombre_pensum, prog.nombre_programa " +
            "FROM PensumEntity as pem INNER JOIN ProgramaEntity as prog ON prog.id_programa = pem.programaEntity.id_programa " +
            "WHERE prog.id_programa = ?1")
    public String getProgramPensum(Long id);

}
