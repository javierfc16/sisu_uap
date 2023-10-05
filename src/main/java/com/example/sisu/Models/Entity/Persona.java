package com.example.sisu.Models.Entity;

import java.io.Serializable;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Persona implements Serializable {

    private static final long serialVersionUID = 2629195288020321924L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id_persona;

    private String nombre;

    private String ap_paterno;

    private String ap_materno;


    
}
