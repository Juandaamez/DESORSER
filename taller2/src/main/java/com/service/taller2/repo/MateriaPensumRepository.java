package com.service.taller2.repo;

import com.service.taller2.model.MateriaEntity;
import com.service.taller2.model.MateriaPensumEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MateriaPensumRepository extends JpaRepository<MateriaPensumEntity, Long> {

    @Query("SELECT COUNT(emp) FROM MateriaPensumEntity emp")
    public Integer countTotalMateriasPensum();

    @Query("SELECT mat.referencia_materia, pen.nombre_pensum " +
            "FROM MateriaPensumEntity as matpen " +
            "INNER JOIN MateriaEntity as mat ON mat.id_materia = matpen.materiaEntity.id_materia " +
            "INNER JOIN PensumEntity as pen ON pen.id_pensum = matpen.pensumEntity.id_pensum")
    public String getRefName();

    @Query("SELECT mat.referencia_materia, mat.nombre_materia, sem.nombre_semestre\n" +
            "FROM MateriaPensumEntity as matpen\n" +
            "INNER JOIN MateriaEntity as mat ON mat.id_materia = matpen.materiaEntity.id_materia\n" +
            "INNER JOIN SemestreEntity as sem ON sem.id_semestre = matpen.semestreEntity.id_semestre")
    public String getRefSemestre();

    @Query("SELECT matpen\n" +
            "FROM MateriaPensumEntity as matpen\n" +
            "INNER JOIN MateriaEntity as mat ON mat.id_materia = matpen.materiaEntity.id_materia\n" +
            "INNER JOIN SemestreEntity as sem ON sem.id_semestre = matpen.semestreEntity.id_semestre\n" +
            "INNER JOIN PensumEntity as pem ON pem.id_pensum = matpen.pensumEntity.id_pensum")
    public List<MateriaPensumEntity> getAllRompimiento();

    @Query("SELECT mat.nombre_materia, sem.nombre_semestre " +
            "FROM MateriaPensumEntity as matpen " +
            "INNER JOIN MateriaEntity as mat ON mat.id_materia = matpen.materiaEntity.id_materia " +
            "INNER JOIN SemestreEntity as sem ON sem.id_semestre = matpen.semestreEntity.id_semestre " +
            "WHERE matpen.materiaEntity.id_materia = ?1")
    public String getNameMatSem(Long id);
}
