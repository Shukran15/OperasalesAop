package com.example.Operasales.service;

import com.example.Operasales.model.Primera;
import com.example.Operasales.model.Ticket;
import com.example.Operasales.repozitory.JPAPrimeraRepozitory;
import com.example.Operasales.repozitory.JPATicketRepozitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class OperaService {

    @Autowired
    private JPAPrimeraRepozitory jpaPrimeraRepozitory;

    @Autowired
    private JPATicketRepozitory jpaTicketRepozitory;


    public List<Primera> getAllPrimera() {
        List<Primera> prs = jpaPrimeraRepozitory.findAll();
        return prs;

    }

    public List<Ticket> getAllTicket() {
        List<Ticket> tickets = jpaTicketRepozitory.findAll();
        return tickets;

    }

    public void removePrimerabibyId(long id){
        jpaPrimeraRepozitory.deleteById(id);
    }


    public void printAllPrimera() {
        List<Primera> prs = jpaPrimeraRepozitory.findAll();
        for (Primera primera : prs) {
            System.out.println(primera);
        }


    }

    public void printAllTicket() {
        List<Ticket> tickets = jpaTicketRepozitory.findAll();
        for (Ticket ticket : tickets) {
            System.out.println(ticket);
        }


    }

    public void printPrimera(String name) {

        Primera pr = jpaPrimeraRepozitory.getPrimeraByName(name);

        System.out.println(pr);
    }

    public Ticket buy(String name) {

        Random random = new Random();

        Primera pr = jpaPrimeraRepozitory.getPrimeraByName(name);
        int place = random.nextInt(120);
        double price = 100;
        Ticket t = new Ticket(pr, price, place);
        pr.minusPlace();
        jpaPrimeraRepozitory.save(pr);
        jpaTicketRepozitory.save(t);

        return t;

    }

    public void vozvrat(Ticket ticket) {

        Primera pr = ticket.getPr();
        pr.plusPlace();
        jpaPrimeraRepozitory.save(pr);
    }

    public void save(Primera pr){
        jpaPrimeraRepozitory.save(pr);
    }

    public Primera getPremieraById(long id){
        return jpaPrimeraRepozitory.getPrimeraById(id);
    }
}
