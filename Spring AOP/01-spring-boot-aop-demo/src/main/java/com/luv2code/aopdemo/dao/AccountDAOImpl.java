package com.luv2code.aopdemo.dao;


import com.luv2code.aopdemo.Account;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDAOImpl implements AccountDAO{
    @Override
    public void addAccount(Account theAccount, boolean VipFlag) {
        System.out.println(getClass() + ": Doing my db work : Adding an Account");
    }

    @Override
    public boolean doWork() {
        System.out.println(getClass() + ": doWork()");
        return false;
    }
}
