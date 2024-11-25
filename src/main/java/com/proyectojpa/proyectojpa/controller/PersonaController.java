package com.proyectojpa.proyectojpa.controller;

import com.proyectojpa.proyectojpa.model.Persona;
import com.proyectojpa.proyectojpa.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonaController {

    @Autowired
    private IPersonaService personaService;

    //Endpoint para obtener todas las personas;

    @GetMapping("personas/traer")
    public List<Persona> getPersonas(){

        return personaService.traerPersonas();

    }

    //Endpoint para crear una nueva persona

    @PostMapping("persona/crear")

    public String createPersona(@RequestBody Persona persona){

        personaService.crearPersona(persona);
        return "Persona creada correctamente";
    }





}
