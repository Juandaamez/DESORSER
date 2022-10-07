package com.usta.taller05.service;

import com.usta.taller05.model.EstatusEntity;
import com.usta.taller05.repository.EstatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstatusService {

    @Autowired
   private EstatusRepository estatusRepository;

    public EstatusEntity create(EstatusEntity estatus){
        return estatusRepository.save(estatus);
    }

    public List<EstatusEntity> getAllEstatus(){
        return estatusRepository.findAll();
    }

    public void delete(EstatusEntity estatus){
        estatusRepository.delete(estatus);
    }

    public Optional<EstatusEntity> findById(Long id){
        return estatusRepository.findById(id);
    }

    public void deleteById(Long id){
        estatusRepository.deleteById(id);
    }
}
