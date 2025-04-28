package com.pokedex.PokedexProject.controller;

import com.pokedex.PokedexProject.model.Pokemon;
import com.pokedex.PokedexProject.repository.PokedexRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pokedex")
public class PokedexController {

    @Autowired
    private PokedexRepository pokedexRepository;

    @PostMapping("/save")
    public String savePokemon(@RequestBody Pokemon pokemon) {
        try {
            pokedexRepository.savePokemon(pokemon);
            return "Pokémon salvo com sucesso!";
        } catch (Exception e) {
            return "Erro ao salvar Pokémon: " + e.getMessage();
        }
    }

    @PutMapping("/update")
    public String updatePokemon(@RequestBody Pokemon pokemon) throws Exception{
        try {
            pokedexRepository.updatePokemon(pokemon);
            return "Tipo do Pokémon atualizado com sucesso!";
        } catch (Exception e) {
            return "Erro ao atualizar o tipo do Pokémon " + e.getMessage();
        }
    }

    @DeleteMapping("/delete")
    public String deletePokemon(@RequestBody Pokemon pokemon) throws Exception{
        try {
            pokedexRepository.deletePokemon(pokemon);
            return "O pokemon " + pokemon + " foi removido da Pokédex";
        } catch (Exception e) {
            return "Erro ao tentar exlcuir o pokémon da Pokédex " + e.getMessage();
        }
    }
}
