package com.example.Operasales.service;

import com.example.Operasales.model.Primera;
import com.example.Operasales.model.Role;
import com.example.Operasales.model.User;
import com.example.Operasales.repozitory.RoleRipozitory;
import com.example.Operasales.repozitory.UserRepozitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {


    private UserRepozitory userRepozitory;
    @Autowired
    public void setUserRepozitory(UserRepozitory userRepozitory){
        this.userRepozitory = userRepozitory;
    }

    public List<User> findAll(){
        return userRepozitory.findAll();
    }

    public void save(User user){
        userRepozitory.save(user);
    }




}
