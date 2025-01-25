package inheritance.hierarchical.bankaccounttypes;

public class CheckingAccount extends BankAccount{
    private double withdrawalLimit;

    public CheckingAccount(long accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }
    @Override
    public void displayDetails(){
        displayAccountType();
        super.displayDetails();
        System.out.println("The withdrawal Limit is Rs."+withdrawalLimit);
    }
    public void displayAccountType(){
        System.out.println("The account type is Checking Account");
    }

}
