package com.usta.crudservicetest.repo;

import com.usta.crudservicetest.model.SeccionalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SeccionalRepository extends JpaRepository<SeccionalEntity, Long> {

    @Query("SELECT COUNT(emp) FROM SeccionalEntity emp")
    public Integer countTotalSeccionales();

}
