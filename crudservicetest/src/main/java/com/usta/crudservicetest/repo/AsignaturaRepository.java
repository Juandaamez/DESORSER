package com.usta.crudservicetest.repo;

import com.usta.crudservicetest.model.AsignaturaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AsignaturaRepository extends JpaRepository<AsignaturaEntity, Long> {

    @Query("SELECT COUNT(emp) FROM AsignaturaEntity emp")
    public Integer countTotalAsignaturas();

}
