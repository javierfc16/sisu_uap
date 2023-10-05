package com.example.sisu.Models.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sisu.Models.Dao.IPersonaDao;
import com.example.sisu.Models.Entity.Persona;

@Service
public class PersonaServiceImpl implements IPersonaService {

    @Autowired
    private IPersonaDao personaDao;

    @Override
    public List<Persona> findAll() {
        
        return (List<Persona>) personaDao.findAll();
    }

    @Override
    public void save(Persona persona) {
       
        personaDao.save(persona);
    }

    @Override
    public Persona findOne(Long id) {

        return personaDao.findById(id).orElse(null);
      
    }

    @Override
    public void delete(Long id) {

        personaDao.deleteById(id);
        
    }
    
}
