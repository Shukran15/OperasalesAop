package com.example.Operasales.config;

import com.example.Operasales.model.Primera;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

import static com.example.Operasales.model.Kategory.PG;
import static com.example.Operasales.model.Kategory.R;

@Configuration
public class Config {


    @Bean
    public ArrayList<Primera> primeras(){
        ArrayList<Primera> primeras = new ArrayList<>();
        Primera primera1 = new Primera(1L, "Мастер и Маргарита", "Мюзикл, балет", R, 100);
        Primera primera2 = new Primera(2L, "Лебединное озеро", "Мюзикл, балет", PG, 120);
        primeras.add(primera1);
        primeras.add(primera2);
        return primeras;

    }
}
