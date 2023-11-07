package originajunittests;

import com.example.SpringifiedLoanApplication.ILoanApplication;

public class TestingLoanApplicationStub implements ILoanApplication {
    @Override
    public String getSSN() {
        return "444-44-4444";
    }

    @Override
    public void setSSN(String ssn) {

    }
}
