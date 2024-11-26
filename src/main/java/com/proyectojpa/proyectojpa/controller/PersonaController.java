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

    @GetMapping("/personas/traer")
    public List<Persona> getPersonas(){

        return personaService.traerPersonas();

    }

    //Endpoint para traer una solo persona

    @GetMapping("/persona/traer")
    public Persona getPersona(@RequestParam Long id){
        return personaService.findPersona(id);
    }

    //Endpoint para crear una nueva persona

    @PostMapping("/persona/crear")

    public String createPersona(@RequestBody Persona persona){

        personaService.crearPersona(persona);
        return "Persona creada correctamente";
    }

    //Endpoint para eliminar

    @DeleteMapping("/persona/eliminar")
    public String deletePersona(@RequestParam Long id){

        personaService.eliminarPersona(id);
        return "Persona eliminada correctamente";
    }

    //Endpoint para editar una persona

    @PutMapping("/persona/editar/{id_original}")
    public Persona updatePersona(@PathVariable Long id_original,
                                 @RequestParam(required = false, name="nuevoId") Long nuevoId,
                                 @RequestParam(required = false, name="nombre") String nuevoNombre,
                                 @RequestParam(required = false, name="apellido") String nuevoApellido,
                                 @RequestParam(required = false, name="edad") int nuevaEdad) {

        System.out.println("El valor de nueva edad es: " + nuevaEdad);
        // Verificar si nuevaEdad es null antes de usarla
        System.out.println("Su apellido es: " + nuevoApellido+  "El nombre es: " + nuevoNombre + "El edad es: " + nuevaEdad + "El nuevoId es: " + nuevoId);

        personaService.editPersona(id_original,nuevoId,nuevoNombre,nuevoApellido,nuevaEdad);



        System.out.println("nuevaEdad es null, por favor proporciona un valor para edad."); // Puedes decidir aquí cómo manejar este caso, por ejemplo, lanzar una excepción o hacer algo predeterminado.

        Persona persona = personaService.findPersona(nuevoId);

        return persona;
    }





}
