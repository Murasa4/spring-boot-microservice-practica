package com.murasa.spring_boot_microservice_api_gateway.controller;

import com.murasa.spring_boot_microservice_api_gateway.request.InmuebleServiceRequest;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("gateway/inmueble")
public class InmuebleController {

    @Autowired
    private InmuebleServiceRequest inmuebleServiceRequest;

    @PostMapping
    public ResponseEntity<?> saveInmueble(@RequestBody Object inmueble) {
        return new ResponseEntity<>(inmuebleServiceRequest.saveInmueble(inmueble), HttpStatus.CREATED);
    }

    @DeleteMapping("${inmuebleId}")
    public ResponseEntity<?> deleteInmueble(@PathVariable("inmuebleId") Long inmuebleId) {
        inmuebleServiceRequest.deleteInmueble(inmuebleId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<?> getAllInmuebles() {
        return ResponseEntity.ok(inmuebleServiceRequest.getAllInmuebles());
    }

}
