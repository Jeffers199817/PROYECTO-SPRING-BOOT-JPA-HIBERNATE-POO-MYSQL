package com.proyectojpa.proyectojpa.service;

import com.proyectojpa.proyectojpa.repository.IPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {

    @Autowired
    private IPersonaRepository personaRepository;
}
