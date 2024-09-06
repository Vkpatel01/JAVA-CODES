import java.util.*;

public class Banking {
    public static void main(String[] args) {
        Accounts a = new Accounts();
        a.deposit();
        a.withdraw();
        a.View_Balance();
        /* Calling the Sub class "Savings" */
        Savings obj = new Savings();
        obj.Account_type();
        obj.Account_closure();
        obj.withdraw();
        obj.deposit();
        /* Calling the Sub class "Recurring" */
        Reccuring period = new Reccuring();
        period.deposit();
        period.Tenure();
        period.View_Balance();

    }
}

class Accounts {
    int Account_numb;
    int Balance;
    float interest_rate;
    String Customer_name;
    int Amount;
    Scanner sc = new Scanner(System.in);

    void deposit() {

        System.out.println("Enter the amount you want to deposit: \n");
        Amount = sc.nextInt();
        System.out.println("The deposited amount are: " + Amount);
        Balance = Balance + Amount;
    }

    void withdraw() {
        System.out.println("Enter the amount you want to withdraw: \n");
        Amount = sc.nextInt();
        System.out.println("The amount withdrawn from account are: " + Amount);
        Balance = Balance - Amount;
    }

    void View_Balance() {
        System.out.println("The Total Balance available in the Account are: \n" + Balance);
    }
}

class Savings extends Accounts {
    String whichType;

    void Account_type() {
        System.out.println("Enter the Account type (Single/ Joint) :\n");
        whichType = sc.next();
        System.out.println("It is a " + whichType + " Account\n");
    }

    void Account_closure() {
        String date;
        System.out.println("When do you want to close your account:\n");
        date = sc.next();
        System.out.println("Your Account will close on: " + date);

    }
}

class Reccuring extends Accounts {
    int tenure;

    void Tenure() {
        System.out.println("\nThis is the Reccuring Account section\n");
        System.out.println("Enter the tenure period of the account: \n");
        tenure = sc.nextInt();
        System.out.println("The tenure for this account are: " + tenure + "years\n");
    }

}