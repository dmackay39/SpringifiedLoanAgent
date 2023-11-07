package com.example.SpringifiedLoanApplication;

public class DummyCreditAgency implements ICreditAgency{
    @Override
    public int getCreditScore(String ssn) {
        int creditScore = 720;
        switch (ssn) {
            case "111-11-1111" -> creditScore = 719;
            case "333-33-3333" -> creditScore = 721;
            case "444-44-4444" -> creditScore = 850;
            case "999-99-9999" -> creditScore = 851;
            case "555-55-5555" -> creditScore = 200;
            case "222-22-2222" -> creditScore = 199;
        }
        return creditScore;
    }
}

