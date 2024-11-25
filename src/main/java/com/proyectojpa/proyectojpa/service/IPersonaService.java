package com.proyectojpa.proyectojpa.service;

import com.proyectojpa.proyectojpa.model.Persona;

import java.util.List;

public interface IPersonaService {

    public List<Persona> traerPersonas();

    public void crearPersona(Persona persona);

    public Persona findPersona(Long id);

    public void eliminarPersona(Long id);

    public void editPersona(Long idOriginal, Long idNueva, String nuevoNombre, String nuevoApellido, int nuevaEdad);

}
