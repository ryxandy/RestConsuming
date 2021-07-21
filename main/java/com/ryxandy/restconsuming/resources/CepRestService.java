package com.ryxandy.restconsuming.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CepRestService {

    @Autowired
    private CepService cepService;

    @GetMapping(path = "/{cep}")
    public ResponseEntity<Endereco> getCep(@PathVariable String cep){
        System.out.println("CEP successfully consulted ");
        Endereco endereco = cepService.buscarEnderecoPorCep(cep);
        return endereco != null? ResponseEntity.ok().body(endereco) : ResponseEntity.notFound().build();
    }
}
