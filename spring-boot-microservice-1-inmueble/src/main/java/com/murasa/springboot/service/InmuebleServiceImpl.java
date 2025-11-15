package com.murasa.springboot.service;

import com.murasa.springboot.model.Inmueble;
import com.murasa.springboot.repository.InmuebleRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class InmuebleServiceImpl implements InmuebleService {

    private final InmuebleRepository inmuebleRepository;

    public InmuebleServiceImpl(InmuebleRepository inmuebleRepository){

        this.inmuebleRepository = inmuebleRepository;
    }

    @Override
    public Inmueble saveInmueble(Inmueble inmueble) {
        inmueble.setFechaCreacion(LocalDateTime.now());
        // esto retorna mi objeto y lo guarda
        return inmuebleRepository.save(inmueble);
    }

    @Override
    public void deleteInmueble(Long inmuebleId) {

        inmuebleRepository.deleteById(inmuebleId);
    }

    @Override
    public List<Inmueble> findAllInmueble() {
        return inmuebleRepository.findAll();
    }

}
