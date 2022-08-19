package com.usta.crudservicetest.repo;

import com.usta.crudservicetest.model.EmpresaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmpresaRepository extends JpaRepository<EmpresaEntity, Long> {

    @Query("SELECT COUNT(emp) FROM EmpresaEntity emp")
    public Integer countTotalEmpresas();

}
