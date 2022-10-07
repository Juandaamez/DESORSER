package com.usta.taller05.service;

import com.usta.taller05.model.PagosEntity;
import com.usta.taller05.model.UsuariosEntity;
import com.usta.taller05.repository.PagosRepository;
import com.usta.taller05.repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuariosService {

    @Autowired
   private UsuariosRepository usuariosRepository;

    public UsuariosEntity create(UsuariosEntity usuarios){
        return usuariosRepository.save(usuarios);
    }

    public List<UsuariosEntity> getAllUsuarios(){
        return usuariosRepository.findAll();
    }

    public void delete(UsuariosEntity usuarios){
        usuariosRepository.delete(usuarios);
    }

    public Optional<UsuariosEntity> findById(Long id){
        return usuariosRepository.findById(id);
    }

    public void deleteById(Long id){
        usuariosRepository.deleteById(id);
    }
}
