//3
/*Create a BankAccount class with:
accountNumber (public).
accountHolder (protected).
balance (private).
Write methods to:
Access and modify balance using public methods.
Create a subclass SavingsAccount to demonstrate access to accountNumber and accountHolder.
 */



public class BankAccount {
    public long accountNumber;
    protected String accountHolder;
    private int balance;
    
    BankAccount(long accountNumber, String accountHolder, int balance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getBalance(){
        return balance;
    }

    public void setBalance(int balance){
        this.balance = balance;
    }
}
class SavingsAccount{
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(1234678, "Yash", 1000);
        System.out.println(b1.getBalance());
        b1.setBalance(2000);
        System.out.println(b1.getBalance());
        System.out.println("Account Number : " + b1.accountNumber);
        System.out.println("Account Holder : " + b1.accountHolder);
    }
}
