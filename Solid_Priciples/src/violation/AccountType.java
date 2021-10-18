package violation;

public class AccountType {
    AccType accountType;
    private  SavingsAccount savingsAccount;
    private  CurrentAccount currentAccount;

    public AccountType(AccType accountType)
    {
      this.accountType=accountType;
    }
    public void createAccount(String name,String email,String gender)
    {
        if (accountType == AccType.Savings) {       //OPEN CLOSED PRINCIPLE IS VIOLATED HERE AS CREATE ACCOUNT METHOD NEEDS TO BE MODIFIED EVERYTIME THERE IS A NEW TYPE OF ACCOUNT
            savingsAccount = new SavingsAccount(name, email, gender);
            savingsAccount.printAccountDetails();

        } else if (accountType == AccType.Current) {
            currentAccount = new CurrentAccount(name, email, gender);
            currentAccount.printAccountDetails();
        }
    }
}
