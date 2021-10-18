package violation;

public class Account {
     private int balance=0, accountNo, depositAmount, withdrawalAmount;
    public int getBalance(){
        return balance;
    }
    public int getAccountNo(){
        return accountNo;
    }

    public void setDepositAmount(int depositAmount) {
        this.depositAmount = depositAmount;
    }

    public int getDepositAmount() {
        return depositAmount;
    }

    public int getWithdrawalAmount() {
        return withdrawalAmount;
    }

    public void setWithdrawalAmount(int withdrawalAmount) {
        this.withdrawalAmount = withdrawalAmount;
        balance=getBalance()-withdrawalAmount;
    }
    public void createDebitCard()
    {
        System.out.println("Created debit card");
    }
    public void printAccountDetails(){};
}
