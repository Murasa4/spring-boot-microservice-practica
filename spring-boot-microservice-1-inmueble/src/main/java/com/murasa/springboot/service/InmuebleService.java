package com.murasa.springboot.service;

import com.murasa.springboot.model.Inmueble;

import java.util.List;

public interface InmuebleService {

    Inmueble saveInmueble(Inmueble inmueble);

    void deleteInmueble(Long inmuebleId);

    List<Inmueble> findAllInmueble();
}
