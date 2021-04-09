package com.antimonitor.core.controller;

import com.antimonitor.core.model.Establishment;
import com.antimonitor.core.model.EstablishmentRequestDTO;
import com.antimonitor.core.model.EstablishmentResponseDTO;
import com.antimonitor.core.repository.EstablishmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.UUID;

@Service
@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class EstablishmentController {

    @Autowired
    private EstablishmentRepository establishmentRepository;

    @PostMapping("/establishment")
    @ResponseStatus(HttpStatus.CREATED)
    public EstablishmentResponseDTO createEstablishment(@RequestBody EstablishmentRequestDTO establishmentRequestDTO) throws ResponseStatusException {

        Establishment establishment = new Establishment();

        establishment.setName(establishmentRequestDTO.getName());
        establishment.setDescription(establishmentRequestDTO.getDescription());
        establishment.setImage_urls(establishmentRequestDTO.getImage_urls());


        if(establishment.getImage_urls().length > 5){

            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "The user has registered more than 5 image_urls");
        }

        establishmentRepository.save(establishment);

        return new EstablishmentResponseDTO("Establishment was successfully created.");
    }

    @GetMapping("/establishment")
    public List<Establishment> listEstablishments() {

        return (List<Establishment>) establishmentRepository.findAll();

    }

    @PostMapping("/createestablishment")
    public Establishment createEstablishment(@RequestBody Establishment establishment) {

        return establishmentRepository.save(establishment);
    }



    @GetMapping("/findestablishment/{id}")
    public Establishment findEstablishment(@PathVariable("id") UUID id){

        return establishmentRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/deleteestablishment/{id}")
    public void deleteEstablishment(@PathVariable("id") UUID id) {

        establishmentRepository.delete(findEstablishment(id));
    }









}
