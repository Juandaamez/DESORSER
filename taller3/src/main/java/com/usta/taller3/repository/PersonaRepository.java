package com.usta.taller3.repository;

import com.usta.taller3.model.PersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
public interface PersonaRepository extends JpaRepository<PersonaEntity, Long> {

}
