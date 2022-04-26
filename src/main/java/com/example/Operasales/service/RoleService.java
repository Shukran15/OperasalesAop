package com.example.Operasales.service;

import com.example.Operasales.model.Role;
import com.example.Operasales.repozitory.RoleRipozitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleRipozitory roleRipozitory;
    public void save(Role role){
        roleRipozitory.save(role);
    }


}
