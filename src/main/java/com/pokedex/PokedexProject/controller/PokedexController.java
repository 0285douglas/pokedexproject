package com.pokedex.PokedexProject.controller;

import com.pokedex.PokedexProject.model.Pokemon;
import com.pokedex.PokedexProject.repository.PokedexRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pokedex")
public class PokedexController {

    @Autowired
    private PokedexRepository pokedexRepository;

    @PostMapping
    public String savePokemon(@RequestBody Pokemon pokemon) {
        try {
            pokedexRepository.savePokemon(pokemon);
            return "Pokemon salvo com sucesso!";
        } catch (Exception e) {
            return "Erro ao salvar Pokémon: " + e.getMessage();
        }
    }


}
