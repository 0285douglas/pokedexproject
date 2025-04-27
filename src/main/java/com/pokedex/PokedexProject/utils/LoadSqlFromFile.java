package com.pokedex.PokedexProject.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LoadSqlFromFile {
    public static String loadSqlFromFile(String filePath) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filePath)));
    }
}
