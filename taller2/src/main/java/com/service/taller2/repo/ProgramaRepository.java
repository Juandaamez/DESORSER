package com.service.taller2.repo;

import com.service.taller2.model.ProgramaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProgramaRepository extends JpaRepository<ProgramaEntity, Long> {

    @Query("SELECT COUNT(emp) FROM ProgramaEntity emp")
    public Integer countTotalProgramas();

}
