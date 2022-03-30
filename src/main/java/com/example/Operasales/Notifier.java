package com.example.Operasales;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Notifier {

    @Pointcut ("execution(* com.example.Operasales.repozitory.OperaRepozitory.buy(*))")
    public void notiffy(){

    }

    @After("notiffy()")
    public void sendnotiffy(JoinPoint jp){


        System.out.println("Мы отправили сообщение!!!!!");
    }



}
