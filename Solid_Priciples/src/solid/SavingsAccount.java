package solid;

public class SavingsAccount extends Account implements MinimumBalance, InterestRate {
    SavingsAccount()
    {
        System.out.println("Created Savings account.");

    }

    @Override
    public void printAccountDetails()
    {
       System.out.println("The account no is"+getAccountNo()) ;
       System.out.println("The remaining balance is"+getBalance());
       System.out.println("The amount deposited is"+getDepositAmount());
       System.out.println("The amount withdrawn is"+getWithdrawalAmount());
    }

    @Override
    public void getInterestRate()
    {
        System.out.println("Interest rate is 3.5% pa");
    }

    @Override
    public void getMinimumBalance() {
        System.out.println("you need a minimum balance of 2000 rupees to create a savings account");
    }
}
