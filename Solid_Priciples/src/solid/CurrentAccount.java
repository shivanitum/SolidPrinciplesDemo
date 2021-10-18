package solid;

public class CurrentAccount extends Account implements MinimumBalance {
    CurrentAccount()
    {
        System.out.println("Created Current account.");

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
    public void getMinimumBalance() {
        System.out.println("You need a minimum balance of 10000 rupees to create a current account");
    }
}
