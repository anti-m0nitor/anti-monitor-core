package com.antimonitor.core.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EstablishmentController {

    @PostMapping("/establishment")
    @ResponseStatus(HttpStatus.CREATED)
    public String createEstablishment(){
        return "{\"message\": \"Estabebelecimento criado!\"}";
    }

    @GetMapping("/establishment")
    public String getEstablishment(){
        return "Lista de todos estabelecimentos";
    }

}
