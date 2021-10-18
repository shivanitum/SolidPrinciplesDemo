package solid;

public abstract class Account {
    private int balance, accountNo, depositAmount, withdrawalAmount;
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

    public abstract void printAccountDetails();  //OPEN CLOSED PRINCIPLE -AS THE ACCOUNT CLASS IS OPEN FOR EXTENSION AND CLOSED FOR MODIFICATION
}

