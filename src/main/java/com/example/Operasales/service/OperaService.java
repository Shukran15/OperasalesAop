package com.example.Operasales.service;

import com.example.Operasales.model.Primera;
import com.example.Operasales.model.Ticket;
import com.example.Operasales.repozitory.JPARepozitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class OperaService {

    @Autowired
    private JPARepozitory jpaRepozitory;

    public void printAll() {
        List<Primera> prs = jpaRepozitory.findAll();
        for (Primera primera : prs) {
            System.out.println(primera);
        }
    }

    public void printPrimera(String name) {

        Primera pr = jpaRepozitory.getPremieraByName(name);

        System.out.println(pr);
    }

    public Ticket buy(String name) {

        Random random = new Random();

        Primera pr = jpaRepozitory.getPremieraByName(name);
        int place = random.nextInt(120);
        double price = 100;
        Ticket t = new Ticket(pr, price, place);
        pr.minusPlace();
        jpaRepozitory.update(pr);

        return t;

    }

    public void vozvrat(Ticket ticket) {

        Primera pr = ticket.getPr();
        pr.plusPlace();
        jpaRepozitory.update(pr);
    }

    public void save(Primera pr){
        jpaRepozitory.save(pr);
    }

    public Primera getPremieraById(long id){
        return jpaRepozitory.getPremieraById(id);
    }
}
