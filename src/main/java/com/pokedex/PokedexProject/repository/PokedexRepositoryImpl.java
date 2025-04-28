package com.pokedex.PokedexProject.repository;

import com.pokedex.PokedexProject.model.Pokemon;
import com.pokedex.PokedexProject.utils.LoadSqlFromFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static com.pokedex.PokedexProject.utils.LoadSqlFromFile.loadSqlFromFile;

@Repository
public class PokedexRepositoryImpl implements PokedexRepository{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void savePokemon(Pokemon pokemon) throws Exception {
        String sql = new String(Files.readAllBytes(Paths.get("src/main/resources/sql/InsertPokemon.sql")), StandardCharsets.UTF_8);
        jdbcTemplate.update(sql, pokemon.getNome(), pokemon.getTipo(), pokemon.getNumeroPokedex());
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
