package solid;
import java.util.*;
public class UserInput {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String name,emailId,gender,typeOfAccount;
        long phoneNo;
       //Takes users details                                                          Single Responsibility principle
        System.out.println("Enter your name");
          name=scanner.next();
        System.out.println("Enter your mail id");
        emailId=scanner.next();
        System.out.println("Enter your phone number");
        phoneNo=scanner.nextLong();
        System.out.println("Enter your gender");
        gender=scanner.next();
        System.out.println("Would you like to open savings account or current account?");
        typeOfAccount=scanner.next();

        //passes the instance of the account type to creation of account class
        if(typeOfAccount.equalsIgnoreCase("savings"))
        {
            CreationOfAccount creationOfAccount=new CreationOfAccount(new SavingsAccount());
        }
        else
        {
            CreationOfAccount creationOfAccount=new CreationOfAccount(new CurrentAccount());
        }
        //OPEN CLOSED PRINCIPLE -AS THE ACCOUNT CLASS IS OPEN FOR EXTENSION AND CLOSED FOR MODIFICATION
        // LISKOV SUBSTITUTION PRINCIPLE -AS THE PARENT ACCOUNT IS COMPLETELY SUBSTITUTABLE BY THE SAVINGS ACCOUNT OR CURRENT ACCOUNT IN THE CREATION OF ACCOUNT CLASS
        //INTERFACE SEGREGATION PRINCIPLE- INTEREST RATE AND MINIMUM BALANCE ARE SEGREGATED
        // DEPENDENCY INVERSION PRINCIPLE- PARENT CLASS REFERENCE IS USED TO REFER TO THE CHILD CLASS SO THEY ARE LOOSELY COUPLED
    }
}

