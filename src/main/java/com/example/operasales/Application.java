package com.example.operasales;

import com.example.operasales.model.Primera;
import com.example.operasales.model.Ticket;
import com.example.operasales.service.OperaService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Scanner;

import static com.example.operasales.model.Kategory.*;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(Application.class, args);

        OperaService operaService = applicationContext.getBean(OperaService.class);


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
