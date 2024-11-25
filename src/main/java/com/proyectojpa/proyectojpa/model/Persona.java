package com.proyectojpa.proyectojpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private long id;
    private String nombre;
    private String apellido;
    private int edad;
}
