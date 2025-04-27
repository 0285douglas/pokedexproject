package com.pokedex.PokedexProject.repository;

import com.pokedex.PokedexProject.model.Pokemon;

import java.util.List;

public interface PokedexRepository {

    void savePokemon(Pokemon pokemon) throws Exception;

    void updatePokemon(int id, Pokemon pokemon) throws Exception;

    void deletePokemon(int id) throws Exception;

    List<Pokemon> pokemonList();

}
