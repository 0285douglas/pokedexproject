package com.pokedex.PokedexProject.repository;

import com.pokedex.PokedexProject.model.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class PokedexRepositoryImpl implements PokedexRepository{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void savePokemon(Pokemon pokemon) throws Exception {

    }

    @Override
    public void updatePokemon(int id, Pokemon pokemon) throws Exception {

    }

    @Override
    public void deletePokemon(int id) throws Exception {

    }

    @Override
    public List<Pokemon> pokemonList() {
        return List.of();
    }
}
