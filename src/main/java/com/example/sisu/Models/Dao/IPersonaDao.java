package com.example.sisu.Models.Dao;

import org.springframework.data.repository.CrudRepository;

import com.example.sisu.Models.Entity.Persona;

public interface IPersonaDao extends CrudRepository<Persona, Long>{
    
}
