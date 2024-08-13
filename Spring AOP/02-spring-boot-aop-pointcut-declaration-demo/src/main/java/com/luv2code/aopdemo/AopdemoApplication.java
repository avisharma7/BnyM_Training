package com.luv2code.aopdemo;

import com.luv2code.aopdemo.dao.AccountDAO;
import com.luv2code.aopdemo.dao.MembershipDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;


@SpringBootApplication
 public class AopdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopdemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner (AccountDAO theAccountDAO, MembershipDAO theMembershipDAO ){
		return runner -> {
		//	demoTheBeforeAdvice(theAccountDAO, theMembershipDAO);
			demoTheAfterReturningAdvice(theAccountDAO);
		};
	}

	private void demoTheAfterReturningAdvice(AccountDAO theAccountDAO) {
		//call methods to find the account
		List<Account> theAccounts = theAccountDAO.findAccounts();

		//display the accounts
		System.out.println("\n\n Main program: demoTheAfterReturningAdvice");
		System.out.println("------------");
		System.out.println(theAccounts);
		System.out.println("/n");
	}

	private void demoTheBeforeAdvice(AccountDAO theAccountDAO, MembershipDAO theMembershipDAO) {

		Account myAccount = new Account();
		myAccount.setName("Aviral");
		myAccount.setLevel("platinum");

		//call the business methods
		theAccountDAO.addAccount(myAccount, true);
		theAccountDAO.doWork();

		//call the account get and setter method
		theAccountDAO.setName("Aviral");
		theAccountDAO.setServiceCode("9814500390");

		String name = theAccountDAO.getName();
		String code = theAccountDAO.getServiceCode();
		//call the membership business method
		theMembershipDAO.addSillyMember();
		theMembershipDAO.goToSleep();

	}

}
