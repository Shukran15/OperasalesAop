package com.example.operasales.repository;

import com.example.operasales.model.Primera;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface JPAPrimeraRepository extends CrudRepository<Primera, Long> {

     List<Primera> findAll();
     Primera save(Primera primera);
     void removeById(Long id);
     Primera getPrimeraById(Long id);
     Primera getPrimeraByName(String name);



}

