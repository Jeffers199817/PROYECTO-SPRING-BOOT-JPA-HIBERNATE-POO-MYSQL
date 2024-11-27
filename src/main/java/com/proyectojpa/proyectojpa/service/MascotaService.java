package com.proyectojpa.proyectojpa.service;

import com.proyectojpa.proyectojpa.model.Mascota;

import java.util.List;

public class MascotaService implements IMascotaService{

private IMascotaService iMascotaService;

    @Override
    public List<Mascota> findAll() {
        return List.of();
    }

    @Override
    public Mascota findById(int id) {
        return null;
    }

    @Override
    public void save(Mascota mascota) {

    }

    @Override
    public void delete(Mascota mascota) {

    }

    @Override
    public void update(Mascota mascota) {

    }
}
