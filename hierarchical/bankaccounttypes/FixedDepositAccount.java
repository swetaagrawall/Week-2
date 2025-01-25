package inheritance.hierarchical.bankaccounttypes;

public class FixedDepositAccount extends BankAccount{
    private int duration;

    public FixedDepositAccount(long accountNumber, double balance, int duration) {
        super(accountNumber, balance);
        this.duration = duration;
    }
    @Override
    public void displayDetails(){
        displayAccountType();
        super.displayDetails();
        System.out.println("The duration is "+duration+" years");
    }
    public void displayAccountType(){
        System.out.println("The account type is FixedDeposit Account");
    }

}
