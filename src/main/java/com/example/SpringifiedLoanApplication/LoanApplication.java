package com.example.SpringifiedLoanApplication;

public class LoanApplication implements ILoanApplication{

    private String ssn ="";

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public String getSSN() {
        if (ssn.isBlank()) {
            int rand = getRandomNumber(1, 6);
            //String ssn = "000-00-0000";
            switch (rand) {
                case 1 -> ssn = "111-11-1111";
                case 2 -> ssn = "222-22-2222";
                case 3 -> ssn = "333-33-3333";
                case 4 -> ssn = "444-44-4444";
                case 5 -> ssn = "555-55-5555";
                case 6 -> ssn = "999-99-9999";
            }
        }
        return ssn;
    }


    public void setSSN(String ssn) {
        this.ssn = ssn;
    }
}
