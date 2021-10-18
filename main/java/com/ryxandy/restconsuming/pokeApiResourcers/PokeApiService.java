package com.ryxandy.restconsuming.pokeApiResourcers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PokeApiService {

    @Autowired
    private PokeApi pokeApi;

    @GetMapping(path = "/pokemon/{id}")
    public Pokemon buscarPorID(@PathVariable String id){
        System.out.println("Procuramos pelo Pokemon em específico");
        return pokeApi.buscarPorID(id);
    }

    @GetMapping(path = "/pokemons")
    public List<Pokemon>BuscarTodosPokemons(){
        return pokeApi.buscarTodosPokemons();
    }

    @GetMapping(path = "/pokemon/fraqueza/{fraqueza}")
    public Pokemon buscarPorFraqueza(@PathVariable String fraqueza){
        System.out.println("Procurando por pokemon com essa fraqueza");
        return pokeApi.buscarPorFraqueza(fraqueza);
    }
}
