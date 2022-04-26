package com.example.Operasales.repozitory;

import com.example.Operasales.model.Primera;
import com.example.Operasales.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepozitory extends CrudRepository<User, Long> {

    List<User> findAll();
    User save(User user);


}
