package com.usta.crudservicetest.repo;

import com.usta.crudservicetest.model.UniversidadEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UniversidadRepository extends JpaRepository<UniversidadEntity, Long> {

    @Query("SELECT COUNT(emp) FROM UniversidadEntity emp")
    public Integer countTotalUniversidades();

}
