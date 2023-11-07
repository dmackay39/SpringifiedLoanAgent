package com.example.SpringifiedLoanApplication;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name="dummyLoanApplication")
    public LoanApplication getLoanApplication(){
        return new LoanApplication();
    }

    @Bean(name="dummyCreditAgency")
    public DummyCreditAgency getCreditAgency(){
        return new DummyCreditAgency();
    }

    @Bean(name="dummyErrorLog")
    public DummyErrorLog getErrorLog(){
        return new DummyErrorLog();
    }

    @Bean(name="loanAgent")
    public LoanAgent getLoanAgent(){
        LoanAgent loanAgent = new LoanAgent();
        loanAgent.setAgency(getCreditAgency());
        loanAgent.setErrorLog(getErrorLog());
        return loanAgent;
    }



}
