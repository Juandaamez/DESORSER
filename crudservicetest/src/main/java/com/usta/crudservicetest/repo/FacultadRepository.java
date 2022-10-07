package com.usta.crudservicetest.repo;

import com.usta.crudservicetest.model.FacultadEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FacultadRepository extends JpaRepository<FacultadEntity, Long> {

    @Query("SELECT COUNT(emp) FROM FacultadEntity emp")
    public Integer countTotalFacultades();

}
