package com.antimonitor.core.controller;

import com.antimonitor.core.model.Establishment;
import com.antimonitor.core.model.EstablishmentRequestDTO;
import com.antimonitor.core.model.EstablishmentResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.antimonitor.core.repository.EstablishmentRepository;

@RestController
public class EstablishmentController {

    @Autowired
    private EstablishmentRepository establishmentRepository;

    @PostMapping("/establishment")
    @ResponseStatus(HttpStatus.CREATED)
    public EstablishmentResponseDTO createEstablishment(@RequestBody EstablishmentRequestDTO establishmentRequestDTO) {


        //Validacoes do meu estabelecimento (establishmentRequestDTO);
        /*
        - Não receber o ID na request, e criá-lo na aplicação usando a lib de UUID do java.
        - Adicionar o id na response.
        - Tentar complementar um type.
        - Validar se o usuário informou no máximo 5 image URLs.
        - No response, formatar a data e hora para o padrao: dd/MM/yyyy hh24:mi
         */

        //Salvar as informacoes no banco (establishmentRequestDTO);

        //Criar um end-point onde o usuário consegue abrir ou fechar um estabeleciomento.

        //Criar branch, commitar e enviar Pull Request!!!!


        return new EstablishmentResponseDTO("Establishment was successfully created.");

    }

    @GetMapping("/establishment")
    public String getEstablishment() {

        Establishment establishment = new Establishment();
        establishment.setId("Pado");
        establishment.setName("vese");


        establishmentRepository.save(establishment);


        return "Lista de todos estabelecimentos";
    }

}
