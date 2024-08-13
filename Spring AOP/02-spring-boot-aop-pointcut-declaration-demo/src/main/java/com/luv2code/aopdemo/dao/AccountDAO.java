package com.luv2code.aopdemo.dao;

import com.luv2code.aopdemo.Account;

import java.util.List;

public interface AccountDAO {
    void addAccount(Account theAccount, boolean VipFlag);

    boolean doWork();

    public String getName() ;
    public void setName(String name) ;
    public String getServiceCode();
    public void setServiceCode(String serviceCode);
    //adding a new method: findAccounts();

    List<Account>findAccounts();
}
