package com.example.SpringifiedLoanApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringifiedLoanApplication {

	public static void main(String[] args) throws InvalidCreditScoreException {
		//SpringApplication.run(SpringifiedLoanApplication.class, args);

		//ApplicationContext appContext = new ClassPathXmlApplicationContext("LoanAppConfig.xml");

		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

		LoanAgent loanAgent = appContext.getBean("loanAgent", LoanAgent.class);

		loanAgent.processLoanApplication(appContext.getBean("dummyLoanApplication", LoanApplication.class));


	}
}

/*
TODO:  Add the appropriate beans to the LoanAppConfig.xml file

TODO (done):  Create a dummy implementation of the ICreditAgency interface that
	returns 719 for a social security number of 111-11-1111
	returns 721 for a social security number of 333-33-3333
	returns 850 for a social security number of 444-44-4444
	returns 851 for a social security number of 999-99-9999
	returns 200 for a social security number of 555-55-5555
	returns 199 for a social security number of 222-22-2222
	defaults to a credit score of 720 for all other social security numbers

TODO (done):  create a dummy implementation of the ILoanApplication that returns a social security number.
 We will want to be able to return each of the social security numbers listed above

TODO (done):  add code to the processLoanApplication() function to print out the social security number,
 credit score and result of the method

TODO: Rewrite the main method to retrieve a loan agent object from the IOC container and then process
 loan applications using each of the social security numbers above

 TODO:  re-run your tests.  Did they pass?  Notice that the tests are not using Spring at all.
  We will cover how to do unit testing with Spring in a subsequent section
 */
