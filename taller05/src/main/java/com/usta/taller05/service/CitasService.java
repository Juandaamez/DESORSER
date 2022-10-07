package com.usta.taller05.service;

import com.usta.taller05.model.CitasEntity;
import com.usta.taller05.repository.CitasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CitasService {

    @Autowired
   private CitasRepository citasRepository;

    public CitasEntity create(CitasEntity citas){
        return citasRepository.save(citas);
    }

    public List<CitasEntity> getAllCitas(){
        return citasRepository.findAll();
    }

    public void delete(CitasEntity citas){
        citasRepository.delete(citas);
    }

    public Optional<CitasEntity> findById(Long id){
        return citasRepository.findById(id);
    }

    public void deleteById(Long id){
        citasRepository.deleteById(id);
    }

    public String getCitaByMedico(String nombre, String numero){
        return citasRepository.getCitaByMedico(nombre, numero);
    }

    public String getCitaByPaciente(String nombre){
        return citasRepository.getCitaByPaciente(nombre);
    }
}
