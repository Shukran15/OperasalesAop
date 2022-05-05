package com.example.operasales.repository;

import com.example.operasales.model.Primera;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;


@Repository
public class InMemoryOperaRepository {



    private ArrayList<Primera> prs = new ArrayList<>();

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



}


