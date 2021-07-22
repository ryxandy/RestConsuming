package com.ryxandy.restconsuming.pokeApiResourcers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
public class PokeApiService {

    @Autowired
    private PokeApi pokeApi;

    @GetMapping(path = "/pokemons/{id}")
    public ResponseEntity<Pokemon> getTodosPokemons(@PathVariable String id){
        System.out.println("Procuramos pelo Pokemon em específico");
        Pokemon pokemon = pokeApi.buscarPorID(id);
        System.out.println(Objects.requireNonNull(ResponseEntity.ok().body(pokemon).getBody()).toString());
        return pokemon != null? ResponseEntity.ok().body(pokemon): ResponseEntity.notFound().build();
    }
}
