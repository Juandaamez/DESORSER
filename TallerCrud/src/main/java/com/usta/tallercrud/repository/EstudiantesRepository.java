package com.usta.tallercrud.repository;

import com.usta.tallercrud.model.EstudiantesEntity;
import com.usta.tallercrud.model.FacultadEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudiantesRepository extends JpaRepository<EstudiantesEntity, Long> {

}
