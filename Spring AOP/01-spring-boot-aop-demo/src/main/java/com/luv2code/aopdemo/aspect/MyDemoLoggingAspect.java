package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
    // this is where we add all of our related advices

    //let's start with an @Before Advice

   // @Before("execution (public void com.luv2code.aopdemo.dao.AccountDAO.addAccount())") //matches addAccount() method on all clasess/specific classes  in the app
 //  @Before("execution (public void add*())")
   // @Before("execution(public void updateAccount())")
    //try to match updateAccount() method in any class

   //@Before("execution ( * add*(com.luv2code.aopdemo.Account, ..))") matching one parameter with account obj

    //matching any parameter
   // @Before("execution( * add* (..))") //match with any return type and any number of parameters

    //match method in an package //this is the best practise to do
    @Before("execution(* com.luv2code.aopdemo.dao.*.*(..))")
    //match in com.luv2code.aopdemo.dao package, .* means any class .* means any method .(..) means any num of parameters in method

    public void beforeAddAccountAdvice(){
        System.out.println("\n======>> Executing @Before advice  on addAccount()");
    }
}
