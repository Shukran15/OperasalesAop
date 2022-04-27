package com.example.Operasales.service;

import com.example.Operasales.repozitory.UserRepozitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImple implements UserDetailsService {

    @Autowired
    private UserRepozitory userRepozitory;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepozitory.findUserByLogin(username);
    }
}
