//Sample Problem 1: Bank Account Types

public class BankAccount {

    long accountNumber;
    int balance;

    BankAccount(long accountNumber, int balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount{

    double interestRate;

    SavingsAccount(long accountNumber,int balance, double interestRate){
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType(){
        System.out.println("\n Savings Account");
    }
}

class CheckingAccount extends BankAccount{

    int withdrawLimit;

    CheckingAccount(long accountNumber,int balance, int withdrawLimit){
        super(accountNumber, balance);
        this.withdrawLimit = withdrawLimit;
    }
    void displayAccountType(){
        System.out.println("\n Checking Account");
    }
}

class FixedDepositAccount extends BankAccount{

    int duration;

    FixedDepositAccount(long accountNumber, int balance, int duration){
        super(accountNumber,balance);
        this.duration = duration;
    }
    void displayAccountType(){
        System.out.println("\n Fixed Deposit Account");
    }
}

class DemoAccount{
    public static void main(String[] args) {
        SavingsAccount s1 = new SavingsAccount(123456789, 10000, 7);
        s1.displayAccountType();

        CheckingAccount c1 = new CheckingAccount(123456789, 25000, 20000);
        c1.displayAccountType();

        FixedDepositAccount f1 = new FixedDepositAccount(784561248, 5000000, 5);
        f1.displayAccountType();
    }
}