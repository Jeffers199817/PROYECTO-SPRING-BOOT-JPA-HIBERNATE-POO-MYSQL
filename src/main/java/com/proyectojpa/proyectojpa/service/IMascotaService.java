package com.proyectojpa.proyectojpa.service;

import com.proyectojpa.proyectojpa.model.Mascota;

import java.util.List;

public interface IMascotaService {


public List<Mascota> findAll();

public Mascota findById(int id);

public void save(Mascota mascota);

public void delete(Mascota mascota);

public void update(Mascota mascota);


}
