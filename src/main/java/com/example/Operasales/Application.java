package com.example.Operasales;


import com.example.Operasales.model.Primera;
import com.example.Operasales.model.Ticket;
import com.example.Operasales.service.OperaService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Scanner;

import static com.example.Operasales.model.Kategory.*;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(Application.class, args);

        OperaService operaService = applicationContext.getBean(OperaService.class);



        Primera primera1 = new Primera(1L, "Мастер и Маргарита", "Мюзикл, балет", R, 100);
        Primera primera2 = new Primera(2L, "Лебединное озеро", "Мюзикл, балет", PG, 120);
        Primera primera3 = new Primera(3L, "Кармен", "Комик, Париж, Франция", PG_13, 20);
        operaService.save(primera1);
        operaService.save(primera2);
        operaService.save(primera3);

        operaService.printAllPrimera();
        System.out.println("Выберете id премьеру:");

        Scanner scanner = new Scanner(System.in);

        int id = scanner.nextInt();

        Primera pr = operaService.getPremieraById(id);

        Ticket ticket = operaService.buy(pr.getName());


        System.out.println("Вы приобрели билет:");

        System.out.println(ticket);

        operaService.printAllPrimera();

        operaService.printAllTicket();

    }

}
