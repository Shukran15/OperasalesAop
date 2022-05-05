package com.example.operasales.service;

import com.example.operasales.model.Primera;
import com.example.operasales.model.Ticket;
import com.example.operasales.repository.JPAPrimeraRepository;
import com.example.operasales.repository.JPATicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Random;

@Service
public class OperaService {

    @Autowired
    private JPAPrimeraRepository jpaPrimeraRepository;

    @Autowired
    private JPATicketRepository jpaTicketRepository;


    public void printAllPrimera() {
        List<Primera> prs = jpaPrimeraRepository.findAll();
        for (Primera primera : prs) {
            System.out.println(primera);
        }


    }

    public void printAllTicket() {
        List<Ticket> tickets = jpaTicketRepository.findAll();
        for (Ticket ticket : tickets) {
            System.out.println(ticket);
        }


    }

    public void printPrimera(String name) {

        Primera pr = jpaPrimeraRepository.getPrimeraByName(name);

        System.out.println(pr);
    }

    @Transactional
    public Ticket buy(String name) {

        Random random = new Random();

        Primera pr = jpaPrimeraRepository.getPrimeraByName(name);
        int place = random.nextInt(120);
        double price = 100;
        Ticket t = new Ticket(pr, price, place);
        pr.minusPlace();
        jpaPrimeraRepository.save(pr);
        jpaTicketRepository.save(t);

        return t;

    }

    public void vozvrat(Ticket ticket) {

        Primera pr = ticket.getPr();
        pr.plusPlace();
        jpaPrimeraRepository.save(pr);
    }

    public void save(Primera pr){
        jpaPrimeraRepository.save(pr);
    }

    public Primera getPremieraById(long id){
        return jpaPrimeraRepository.getPrimeraById(id);
    }
}
