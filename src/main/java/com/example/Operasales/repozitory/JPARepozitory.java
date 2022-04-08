package com.example.Operasales.repozitory;

import com.example.Operasales.model.Primera;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface JPARepozitory extends CrudRepository<Primera, Long> {

     List<Primera> findAll();
     Primera save(Primera primera);
     void removeById(Long id);
     Primera getPremieraById(Long id);
     Primera getPremieraByName(String name);
     void update(Primera p);


}

