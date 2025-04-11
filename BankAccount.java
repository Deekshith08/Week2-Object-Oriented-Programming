//1

public class BankAccount {

    static String bankName = "Magadha Bank";
    String accountHolder;
    final int accountNumber;
    private int balance;
    static int totalAccounts = 0;

    BankAccount(String accountHolder, final int accountNumber, int balance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public boolean checkInstance(BankAccount obj){
        return obj instanceof BankAccount;
    }

    public void displayDetails(BankAccount obj){
        if(checkInstance(obj)){
            System.out.println("---Account Details---");
        System.out.println("Name of Account Holder : " + accountHolder);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance : " + balance);
        System.out.println("----------------------");
        }
        else System.out.println("Not an instance");
    }
}

class account{
    public static void main(String[] args){
        BankAccount b1 = new BankAccount("Yash", 123456789, 100000);
        System.out.println(b1.checkInstance(b1));
        b1.displayDetails(b1);
        BankAccount b2 = new BankAccount("Raj", 789456123, 500014);
        b2.displayDetails(b2);
        System.out.println("Total accounts in " + BankAccount.bankName + " : " + BankAccount.getTotalAccounts());
    }
}