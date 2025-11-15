package com.murasa.springboot.repository;

import com.murasa.springboot.model.Inmueble;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InmuebleRepository extends JpaRepository<Inmueble, Long> {
}
