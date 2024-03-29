package com.example.sisu.Models.Service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.example.sisu.Models.Entity.Persona;

@Service
public interface IPersonaService {

    public List<Persona> findAll(); //MOSTRAR TODOS LOS REGSITROS

    public void save(Persona persona);  //GUARDAR REGISTRO

    public Persona findOne(Long id);  // MOSTRAR UN REGSITRO

    public void delete(Long id); // ELIMINAR REGISTRO
    
}
