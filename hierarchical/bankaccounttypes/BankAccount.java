package inheritance.hierarchical.bankaccounttypes;

public class BankAccount {
    private long accountNumber;
    private double balance;

    public BankAccount(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void displayDetails(){
        System.out.println("The account no is "+accountNumber+"\nThe balance is Rs."+balance);
    }
}
