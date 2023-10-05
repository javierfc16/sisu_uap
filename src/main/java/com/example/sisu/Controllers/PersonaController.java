package com.example.sisu.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.sisu.Models.Entity.Persona;
import com.example.sisu.Models.Service.IPersonaService;



@Controller
public class PersonaController {

    @Autowired
    private IPersonaService personaService;

    @GetMapping(value ="/vistaForm")
    public String mostrar(Model model){

        model.addAttribute("persona", new Persona());
        model.addAttribute("peronas", personaService.findAll());

        return "";
    }
    
}
