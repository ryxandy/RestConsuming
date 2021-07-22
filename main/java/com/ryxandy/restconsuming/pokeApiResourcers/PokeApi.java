package com.ryxandy.restconsuming.pokeApiResourcers;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "https://pokeapi-br.herokuapp.com/", name="PokeApi")
public interface PokeApi {

    @GetMapping("pokemons")
    Pokemon buscarTodosOsPokemons();

    @GetMapping(path = "/pokemon/{id}")
    Pokemon buscarPorID(@PathVariable("id") String id);



}
