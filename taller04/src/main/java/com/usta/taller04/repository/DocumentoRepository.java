package com.usta.taller04.repository;

import com.usta.taller04.model.DocumentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentoRepository extends JpaRepository<DocumentoEntity, Long> {

}
