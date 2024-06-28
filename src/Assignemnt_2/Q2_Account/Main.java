package Assignemnt_2.Q2_Account;

public class Main {
public static void main(String[] args) {

    System.out.println("Checking Account");
    CheckingAccount ca = new CheckingAccount(110112 , 3000 , 0.7 , 3000);
    ca.deposit(200);
    ca.withdrawal(200);

    System.out.println("Saving Account");
    SavingAccount sa = new SavingAccount(110112 , 2000 , 0.3);
    sa.withdrawal(200);
}
}
