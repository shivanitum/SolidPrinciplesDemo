package violation;

public class CurrentAccount extends Account implements AccountServices{
CurrentAccount(String name,String email,String gender){
    System.out.println("Created current account with details"+name+" "+email+" "+gender);
}
    public void printAccountDetails()
    {
        System.out.println("The account no is"+getAccountNo()) ;
        System.out.println("The remaining balance is"+getBalance());
        System.out.println("The amount deposited is"+getDepositAmount());
        System.out.println("The amount withdrawn is"+getWithdrawalAmount());
    }
    public void getMinimumBalance() {
        System.out.println("You need a minimum balance of 10000 rupees to create a current account");
    }

    @Override
    public void getInterestRate() {
        throw new UnsupportedOperationException("no interest rate for current account");
    }
}