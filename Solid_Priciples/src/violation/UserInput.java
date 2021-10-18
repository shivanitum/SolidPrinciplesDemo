package violation;
import java.util.*;

import static violation.AccType.Savings;

public class UserInput {
    private static Object SavingsAccount;
    private static Object CurrentAccount;
    private static Object AccountType;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name, emailId, gender, typeOfAccount;

        long phoneNo;

        System.out.println("Enter your name");
        name = sc.next();
        System.out.println("Enter your mail id");
        emailId = sc.next();
        System.out.println("Enter your phone number");
        phoneNo = sc.nextLong();
        System.out.println("Enter your gender");
        gender = sc.next();
        System.out.println("Would you like to open savings account or current account?");
        typeOfAccount = sc.next();



        if (typeOfAccount.equalsIgnoreCase("savings")) {
            AccountType account= new AccountType(AccType.Savings);
            account.createAccount(name,emailId,gender);

        } else {
            AccountType account=new AccountType(AccType.Current);
            account.createAccount(name,emailId,gender);

        }
        //VIOLATION OF SOLID PRINCIPLES
        //SINGLE RESPONSIBILITY PRINCIPLE IS VIOLATED AS ACCOUNT IS ALSO CREATING A DEBIT CARD WHEN ITS RESPONSIBILITY IS ONLY TO STATE THE COMMON FEATURES OF ALL ACCOUNTS
        //OPEN CLOSED PRINCIPLE IS VIOLATED HERE AS CREATE ACCOUNT METHOD NEEDS TO BE MODIFIED EVERYTIME THERE IS A NEW TYPE OF ACCOUNT IN ACCOUNT TYPE CLASS
        // LISKOV SUBSTITUTION PRINCIPLE IS VIOLATED AS ACCOUNT SERVICES IS NOT COMPLETELY IMPLEMENTED BY CURRENT ACCOUNT.
        //INTERFACE SEGREGATION PRINCIPLE IS VIOLATED AS ACCOUNT SERVICES HAS TWO METHODS WHICH ARE NOT USED BY ALL CLASSES EXTENDING THE INTERFACE.
        // DEPENDENCY INVERSION PRINCIPLE IS VIOLATED AS THE CHILD ACCOUNT IS NOT REFERENCED BY PARENT ACCOUNT.
    }
}








