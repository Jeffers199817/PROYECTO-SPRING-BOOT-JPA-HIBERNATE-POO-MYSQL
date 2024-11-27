package com.proyectojpa.proyectojpa.repository;

import com.proyectojpa.proyectojpa.model.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMascotaRepository extends JpaRepository<Mascota, Long>
{
}
