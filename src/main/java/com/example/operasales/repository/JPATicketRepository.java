package com.example.operasales.repository;

import com.example.operasales.model.Ticket;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JPATicketRepository extends CrudRepository<Ticket, Long> {


    List<Ticket> findAll();
    Ticket save(Ticket ticket);

}
