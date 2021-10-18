package solid;

public class CreationOfAccount {
    private Account account;
    CreationOfAccount(Account account)
    {
        this.account=account;
    }
    // LISKOV SUBSTITUTION PRINCIPLE -AS THE PARENT ACCOUNT IS COMPLETELY SUBSTITUTABLE BY THE SAVINGS ACCOUNT OR CURRENT ACCOUNT IN THE CREATION OF ACCOUNT CLASS
}
