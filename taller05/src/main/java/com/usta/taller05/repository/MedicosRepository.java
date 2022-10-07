package com.usta.taller05.repository;

import com.usta.taller05.model.MedicosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MedicosRepository extends JpaRepository<MedicosEntity, Long> {

    @Query("SELECT med " +
            "FROM MedicosEntity as med " +
            "INNER JOIN CategoriasEntity as cate " +
            "ON cate.id_categoria = med.categoria.id_categoria " +
            "WHERE cate.nombre_categoria = ?1 ")
    public MedicosEntity getMedicosByCategoria(String categoria);
}
