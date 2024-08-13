package com.luv2code.aopdemo.dao;


import com.luv2code.aopdemo.Account;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AccountDAOImpl implements AccountDAO{
    private String name;
    private String serviceCode;

    @Override
    public void addAccount(Account theAccount, boolean VipFlag) {
        System.out.println(getClass() + ": Doing my db work : Adding an Account");
    }

    @Override
    public boolean doWork() {
        System.out.println(getClass() + ": doWork()");
        return false;
    }

    public String getName() {
        System.out.println(getClass() + " in getName()");
        return name;
    }

    public void setName(String name) {
        System.out.println(getClass() + " in setName()");
        this.name = name;
    }

    public String getServiceCode() {
        System.out.println(getClass() + ": in getServiceCode");
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        System.out.println(getClass() + ": in setServiceCode");
        this.serviceCode = serviceCode;
    }

    @Override
    public List<Account> findAccounts() {
        List<Account>myAccounts = new ArrayList<>();

        //create sample account
        Account temp1 =  new Account("John","silver");
        Account temp2 =  new Account("Madhu","Platinum");
        Account temp3 =  new Account("Luca","Gold");

        //and add them  to our account list
        myAccounts.add(temp1);
        myAccounts.add(temp2);
        myAccounts.add(temp3);

        return myAccounts;
    }
}
