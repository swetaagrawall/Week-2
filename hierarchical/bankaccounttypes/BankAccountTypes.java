package inheritance.hierarchical.bankaccounttypes;

public class BankAccountTypes {
    public static void main(String[] args) {
        BankAccount ba;
        ba=new SavingsAccount(10001,25000,10);
        ba.displayDetails();
        System.out.println("================================================");
        ba=new CheckingAccount(200002,55000,30000);
        ba.displayDetails();
        System.out.println("================================================");
        ba=new FixedDepositAccount(300003,950000,4);
        ba.displayDetails();

    }
}
