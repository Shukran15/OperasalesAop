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

        return primeras;

    }
}
