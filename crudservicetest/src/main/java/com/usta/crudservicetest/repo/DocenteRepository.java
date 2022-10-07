package com.usta.crudservicetest.repo;

import com.usta.crudservicetest.model.DocenteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DocenteRepository extends JpaRepository<DocenteEntity, Long> {

    @Query("SELECT COUNT(emp) FROM DocenteEntity emp")
    public Integer countTotalDocentes();

}
