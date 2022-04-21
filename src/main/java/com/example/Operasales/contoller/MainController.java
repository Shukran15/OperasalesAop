package com.example.Operasales.contoller;

import com.example.Operasales.model.Primera;
import com.example.Operasales.model.Ticket;
import com.example.Operasales.service.OperaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController {


    @Autowired
    private OperaService operaService;

    @GetMapping(value = "/allprimera")
    public List<Primera> getAllPrimera(){
        return operaService.getAllPrimera();

    }

    @GetMapping(value = "/allticket")
    public List<Ticket> getAllTickets(){
        return operaService.getAllTicket();
    }

    @PostMapping(value = "/addprimera")
    public String addPrimera(@RequestBody Primera pr){
        operaService.save(pr);
        return"ok";
    }

    @DeleteMapping(value= "/deleteprimera/{id}")
    public ResponseEntity<Long> deleteprimerabyid(@PathVariable int id){
        operaService.removePrimerabibyId(id);
        return new ResponseEntity<Long>(1L, HttpStatus.ACCEPTED);
    }

    @GetMapping(value = "/buyticket")
    public ResponseEntity<Ticket> buyticket(@RequestParam String name){
        Ticket ticket = operaService.buy(name);
        return new ResponseEntity<>(ticket, HttpStatus.OK);
    }

}
