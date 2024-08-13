package com.luv2code.aopdemo.aspect;

import com.luv2code.aopdemo.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;


@Aspect
@Component
@Order(2)
public class MyDemoLoggingAspect {

    //adding a new advice  for @AfterReturning on the findAccounts method

    @AfterReturning(
            pointcut = "execution(* com.luv2code.aopdemo.dao.AccountDAO.findAccounts(..))",
            returning = "result")
    public void afterReturningFindAccountsAdvice(JoinPoint theJoinpoint, List<Account> result){

        //print out which methods we are advising on
        String method =  theJoinpoint.getSignature().toShortString();
        System.out.println("/n===>> Executing @AfterReturning on method: " + method);

        //print out the result of the method call
        System.out.println("/n=====> result is: "+ result);
    }



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
   // @Before("execution(* com.luv2code.aopdemo.dao.*.*(..))")
    //match in com.luv2code.aopdemo.dao package, .* means any class .* means any method .(..) means any num of parameters in method



    @Before("com.luv2code.aopdemo.aspect.LuvAopExpression.forDaoPackageNoGetterSetter()") //using pointcut declaration
    public void beforeAddAccountAdvice(JoinPoint thejoinpoint){
        System.out.println("\n======>> Executing @Before advice  on addAccount()");

        //JoinPoint has metadata about method call
        //display the method signature
        MethodSignature methodSignature = (MethodSignature) thejoinpoint.getSignature();

        System.out.println("Method: "+ methodSignature);


        //display the method arguments

        //get args
        Object []  args =  thejoinpoint.getArgs();

        //loop through args
        for(Object tempArg : args){
            System.out.println(tempArg);

            if(tempArg instanceof Account){
                //downcast and  print account  specific     stuff
                Account theAccount = (Account) tempArg;

                System.out.println("account name: "+ theAccount.getName() );
                System.out.println("account level: "+ theAccount.getLevel());
            }
        }



    }

}

