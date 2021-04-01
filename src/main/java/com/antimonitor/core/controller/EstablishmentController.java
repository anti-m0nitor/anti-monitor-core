package com.antimonitor.core.controller;

import com.antimonitor.core.model.Establishment;
import com.antimonitor.core.model.EstablishmentRequestDTO;
import com.antimonitor.core.model.EstablishmentResponseDTO;
import com.antimonitor.core.repository.EstablishmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class EstablishmentController {

    @Autowired
    private EstablishmentRepository establishmentRepository;

    @PostMapping("/establishment")
    @ResponseStatus(HttpStatus.CREATED)
    public EstablishmentResponseDTO createEstablishment(@RequestBody EstablishmentRequestDTO establishmentRequestDTO) {



        return new EstablishmentResponseDTO("Establishment was successfully created.");

    }



    @GetMapping("/establishment")
    public List<Establishment> listEstablishments() {

        return (List<Establishment>) establishmentRepository.findAll();

    }



    @PostMapping("/createestablishment")
    public Establishment createEstablishment(@RequestBody Establishment establishment) {

//        establishmentRequestDTO.setId(uuidRandom());
//        establishmentRequestDTO.setName("Jonatas");

        return establishmentRepository.save(establishment);
    }


    public static UUID uuidRandom() {
        UUID uuid = UUID.randomUUID();
        String uuidAsString = uuid.toString();

        return uuid;
    }






}
