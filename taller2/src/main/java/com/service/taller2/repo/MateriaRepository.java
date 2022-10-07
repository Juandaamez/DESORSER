package com.service.taller2.repo;

import com.service.taller2.model.MateriaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MateriaRepository extends JpaRepository<MateriaEntity, Long> {

    @Query("SELECT COUNT(emp) FROM MateriaEntity emp")
    public Integer countTotalMaterias();

    @Query ("SELECT m FROM MateriaEntity m WHERE m.nombre_materia = ?1")
    public MateriaEntity getMateriaByName(String name);
}
