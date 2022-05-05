package com.example.operasales.Init;

import com.example.operasales.model.Primera;
import com.example.operasales.service.OperaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

import static com.example.operasales.model.Kategory.*;

//@Component
public class JPAInit {

    @Autowired
    private OperaService operaService;

    @PostConstruct
    public void initDb(){
        Primera primera1 = new Primera(1L, "Мастер и Маргарита", "Мюзикл, балет", R, 100);
        Primera primera2 = new Primera(2L, "Лебединное озеро", "Мюзикл, балет", PG, 120);
        Primera primera3 = new Primera(3L, "Кармен", "Комик, Париж, Франция", PG_13, 20);
        operaService.save(primera1);
        operaService.save(primera2);
        operaService.save(primera3);
    }

}
