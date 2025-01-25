package inheritance.hierarchical.bankaccounttypes;

public class SavingsAccount extends BankAccount{
    private double interestRate;

    public SavingsAccount(long accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    @Override
    public void displayDetails(){
        displayAccountType();
        super.displayDetails();
        System.out.println("The interest rate is "+interestRate+"%");
    }
    public void displayAccountType(){
        System.out.println("The account type is Savings Account");
    }

}
