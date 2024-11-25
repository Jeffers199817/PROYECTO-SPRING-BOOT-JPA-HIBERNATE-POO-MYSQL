package com.proyectojpa.proyectojpa.service;

import com.proyectojpa.proyectojpa.model.Persona;
import com.proyectojpa.proyectojpa.repository.IPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService implements IPersonaService {

    @Autowired
    private IPersonaRepository personaRepository;


    @Override
    public List<Persona> traerPersonas() {

        List<Persona> listaPersonas = personaRepository.findAll();
        return listaPersonas;
    }

    @Override
    public void crearPersona(Persona persona) {
        personaRepository.save(persona);

    }

    @Override
    public Persona findPersona(Long id) {
        Persona perso = personaRepository.findById(id).orElse(null);
        return perso;
    }

    @Override
    public void eliminarPersona(Long id) {

        personaRepository.deleteById(id);

    }

    @Override
    public void editPersona(Long idOriginal, Long idNueva, String nuevoNombre, String nuevoApellido, int nuevaEdad) {

        Persona perso = this.findPersona(idOriginal);

        perso.setId(idNueva);
        perso.setNombre(nuevoNombre);
        perso.setApellido(nuevoApellido);
        perso.setEdad(nuevaEdad);

        this.crearPersona(perso);
    }


}
