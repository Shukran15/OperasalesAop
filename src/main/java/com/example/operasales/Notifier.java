package com.example.operasales;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Notifier {

    @Pointcut ("execution(* com.example.operasales.repository.InMemoryOperaRepository.buy(*))")
    public void notiffy(){

    }

    @After("notiffy()")
    public void sendnotiffy(JoinPoint jp){


        System.out.println("Мы отправили сообщение!!!!!");
    }



}
