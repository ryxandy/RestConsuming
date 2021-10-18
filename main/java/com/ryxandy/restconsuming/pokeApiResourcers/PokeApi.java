package com.ryxandy.restconsuming.pokeApiResourcers;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(url = "https://pokeapi-br.herokuapp.com/", name="PokeApi")
public interface PokeApi {

    @GetMapping("/pokemons")
    List<Pokemon> buscarTodosPokemons();

    @GetMapping(path = "/pokemon/{id}")
    Pokemon buscarPorID(@PathVariable("id") String id);

    @GetMapping(path = "/pokemon/fraqueza/{fraqueza}")
    Pokemon buscarPorFraqueza(@PathVariable String fraqueza);



}
