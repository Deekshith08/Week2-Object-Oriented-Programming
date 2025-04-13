//Problem 2: Bank and Account Holders (Association)

public class Bank {
    String bankName;
    int count = 0;

    Bank(String bankName){
        this.bankName = bankName;
    }

    void openAccount(Customer c1){
        c1.customerid = ++count;
        c1.accountOpened = true;
        c1.balance = 500;
        System.out.println(" Customer " + c1.getName() + " have created a new savings account");
    }
}

class Customer{

    String name;
    int customerid;
    int balance;
    boolean accountOpened = false;
    
    Customer(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }

    void setBalance(int balance){
        this.balance = balance;
    }

    int viewBalance(){
        return balance;
    }

    void customerDetails(){
        if(accountOpened){
            System.out.println("----Customer Details----");
            System.out.println("Name : " + name);
            System.out.println("Customer id : " + customerid); 
            System.out.println("Balance : " + balance);
            System.out.println("-----------------------");
        }
        else System.out.println("You haven't opened an account yet");
    }
}

class person{
    public static void main(String[] args) {
        Bank b1 = new Bank("Magadha Bank");
        Customer c1 = new Customer("Raj");
        c1.customerDetails();
        b1.openAccount(c1);
        c1.customerDetails();
        Customer c2 = new Customer("cherry");
        b1.openAccount(c2);
        c2.customerDetails();
    }
}