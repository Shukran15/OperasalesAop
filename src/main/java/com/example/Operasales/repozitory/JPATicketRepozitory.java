package com.example.Operasales.repozitory;

import com.example.Operasales.model.Primera;
import com.example.Operasales.model.Ticket;
import org.hibernate.mapping.Set;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JPATicketRepozitory extends CrudRepository<Ticket, Long> {


    List<Ticket> findAll();
    Ticket save(Ticket ticket);

}
