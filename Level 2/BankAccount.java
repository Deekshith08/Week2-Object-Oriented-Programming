//5
/*Create a BankAccount class with attributes accountHolder, accountNumber, and balance. Add methods for:
Depositing money.
Withdrawing money (only if sufficient balance exists).
Displaying the current balance.
 */


public class BankAccount {
    String accountHolder;
    String accountNumber;
    int balance;

    BankAccount(String accountHolder, String accountNumber, int balance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(int amount){
        balance = balance+amount;
        System.out.println("Balance after depositing : " + (balance));
    }

    public void withdraw(int amount){
        if(balance-amount > 0){
            balance = balance-amount; 
            System.out.println("Balance after withdraw : " + (balance));
        }
        else{
            System.out.println("Not enough balance");
        }
    }

    public void currentBalance(){
        System.out.println("Current Balance : " + balance);
    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Yash", "47013185847", 5000);
        b1.currentBalance();
        b1.deposit(500);
        b1.withdraw(5000);
        b1.withdraw(500);
        
    }
}
