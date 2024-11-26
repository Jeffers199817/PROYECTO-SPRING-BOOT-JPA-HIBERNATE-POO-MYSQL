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

    //Endpoint para eliminar

    @DeleteMapping("persona/eliminar")
    public String deletePersona(@RequestParam Long id){

        personaService.eliminarPersona(id);
        return "Persona eliminada correctamente";
    }

    //Endpoint para editar una persona

    @PutMapping("/persona/editar/{id_original}")
    public Persona updatePersona(@PathVariable("id_original") Long id_original,
                                @RequestParam(required = false, name="id") Long nuevoId,
                                @RequestParam(required = false, name= "nombre") String nuevoNombre,
                                 @RequestParam(required = false, name="apellido")String nuevoApellido,
                                 @RequestParam(required = false, name = "edad") Integer nuevaEdad){

        personaService.editPersona(id_original,nuevoId,nuevoNombre,nuevoApellido,nuevaEdad);

        Persona persona = personaService.findPersona(id_original);

        return persona;


    }





}
