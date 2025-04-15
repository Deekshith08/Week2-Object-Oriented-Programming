
interface Lonable{
    boolean applyForLoan(boolean requst);
    void calculateLoanEligibility();
}

abstract class BankAccount{

    private int accountnumber;
    private String accountHolder;
    private double balance;

    BankAccount(int number, String name, double balance){
        this.accountnumber = number;
        this.accountHolder = name;
        this.balance = balance;
    }

    public int getAccountnumber() { return accountnumber; }
    public String getAccountHolder() { return accountHolder; }
    public double getBalance() { return balance; }

    void deposit(double amount){
        if(amount>0) balance += amount;
        else System.out.println("Enter a valid amount");
    }

    public void withdwaw(double amount){
        if(balance-amount >0) balance=-amount;
        else System.out.println("No sufficient Funds");
    }

    abstract double calculateIntrest();
}

class SavingsAccount extends BankAccount implements Lonable{
    boolean request;
    double intrestPercent = 6;

    SavingsAccount(int number, String name, double balance,boolean request){
        super(number, name, balance);
        this.request = request;
    }
    @Override
    public boolean applyForLoan(boolean request){
        return request;
    }
    @Override
    public void calculateLoanEligibility(){
        if(applyForLoan(request)){
            if(getBalance()>20000){
                System.out.println("Eligible for loan");
            }
            else System.out.println("Not eligible for loan");        }
        else System.out.println("Not eligible for loan");        
    }
    @Override
    double calculateIntrest(){
        return getBalance()*0.06;
    }

    public void getAccountInfo(){
        System.out.println("\n----Account Details----");
        System.out.println("Account Number : " + getAccountnumber());
        System.out.println("Account Holder : " + getAccountHolder());
        System.out.println("Balance : " + getBalance());
        System.out.println("Intrest : " + calculateIntrest());
        calculateLoanEligibility();
    }
}

class CurrentAccount extends BankAccount implements Lonable{
    boolean request;
    double intrestPercent = 6.5;

    CurrentAccount(int number, String name, double balance,boolean request){
        super(number, name, balance);
        this.request = request;
    }
    @Override
    public boolean applyForLoan(boolean request){
        return request;
    }
    @Override
    public void calculateLoanEligibility(){
        if(applyForLoan(request)){
            if(getBalance()>20000){
                System.out.println("Eligible for loan");
            }
            else System.out.println("Not eligible for loan");        }
        else System.out.println("Not eligible for loan");        
    }
    @Override
    double calculateIntrest(){
        return getBalance()*0.065;
    }
    public void getAccountInfo(){
        System.out.println("\n----Account Details----");
        System.out.println("Account Number : " + getAccountnumber());
        System.out.println("Account Holder : " + getAccountHolder());
        System.out.println("Balance : " + getBalance());
        System.out.println("Intrest : " + calculateIntrest());
        calculateLoanEligibility();
    }
}

class DemoAccount{
    public static void main(String[] ar){
        BankAccount b1 = new SavingsAccount(12345678, "Siva", 55000, false);
        BankAccount c1 = new CurrentAccount(78521456,"Raj",22000,true);

        ((SavingsAccount)b1).getAccountInfo();
        ((CurrentAccount)c1).getAccountInfo();
        
    }
}


