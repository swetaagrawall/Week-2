//class ATM
class BankAccount{
    //private members
    private String accountHolder;
    private long accountNumber;
    private double balance;
    //constructor
    public BankAccount(String accountHolder,long accountNumber,double balance){
        this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    //method for depositing money
    public void depositingMoney(double amount){
        balance=balance+amount;
    }
    //method for withdrawing money
    public void withdrawingMoney(double amount){
        if(amount<=balance)
            balance=balance-amount;
        else
            System.out.println("Insufficient balance!");
    }
    public void currentBalance(){
        System.out.println("Account holder : "+accountHolder);
        System.out.println("Account number : "+accountNumber);
        System.out.println("Current Balance : "+balance);
    }
}
//Main class
public class ATM {
    public static void main(String[] args) {
        //object creation
        BankAccount account1 = new BankAccount("abc", 111111111111l, 90000);
        BankAccount account2 = new BankAccount("xyz", 222222222222l, 85000);
        //displaying account details
        account1.currentBalance();
        account2.currentBalance();
        //depositing money
        System.out.println("After depositing 20000 money in account1 : ");
        account1.depositingMoney(20000);
        //displaying balance
        account1.currentBalance();
        //withdrawing money
        System.out.println("After withdrawing 60000 money from account2 : ");
        account2.withdrawingMoney(60000);
        account2.currentBalance();
        //withdrawing insufficient amount
        account2.withdrawingMoney(40000);

    }
}
