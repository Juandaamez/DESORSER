package com.service.taller2.repo;

import com.service.taller2.model.SemestreEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SemestreRepository extends JpaRepository<SemestreEntity, Long> {

    @Query("SELECT COUNT(emp) FROM SemestreEntity emp")
    public Integer countTotalSemestres();

    @Query("SELECT sem FROM SemestreEntity as sem WHERE sem.nombre_semestre = ?1")
    public List<SemestreEntity> getSemByName(String name);

}
