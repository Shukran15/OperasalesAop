package com.example.Operasales;

import com.example.Operasales.model.Kategory;
import com.example.Operasales.model.Primera;
import com.example.Operasales.model.Ticket;
import com.example.Operasales.repozitory.OperaRepozitory;
import com.example.Operasales.service.OperaService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(Application.class, args);

        OperaService operaService = applicationContext.getBean(OperaService.class);


        Primera newPr = new Primera(3, "Кармен", "Комик, Париж, Франция", Kategory.PG_13, 20);
        
        operaService.save(newPr);

        operaService.printAll();
        System.out.println("Выберете id премьеру:");

        Scanner scanner = new Scanner(System.in);

        int id = scanner.nextInt();

        Primera pr = operaService.getPremieraById(id);

        Ticket ticket = operaService.buy(pr.getName());


        System.out.println("Вы приобрели билет:");

        System.out.println(ticket);

        operaService.printAll();

    }

}
