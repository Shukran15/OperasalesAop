package com.example.Operasales.repozitory;

import com.example.Operasales.model.Primera;
import com.example.Operasales.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Repository
public class OperaRepozitory {

    @Autowired
    private ArrayList<Primera> prs;

    public void save(Primera pr) {

        System.out.println("Начало добавления примьеры " + pr);
        prs.add(pr);
        System.out.println("Завершение добавления примьеры " + pr);

    }

    public List<Primera> getAll() {
        return prs;
    }





    public void removeById(long id) {
        for (Primera primera : prs) {
            if (primera.getId() == id) {
                prs.remove(primera);
                break;
            }
        }
    }

    public Primera getPremieraById(long id) {
        for (Primera primera : prs) {
            if (primera.getId() == id) {
                return primera;
            }
        }

        return null;
    }

    public Primera getPremieraByName(String name) {
        for (Primera primera : prs) {
            if (primera.getName().equals(name)) {
                return primera;
            }
        }

        return null;
    }

    public void update(Primera p){
    }


}


