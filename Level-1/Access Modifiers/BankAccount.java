class BankAccount{
    public long accountNumber;
    protected String accoutHolder;
    private double balance;
    //parameterized constructor
    public BankAccount(long accountNumber,String accoutHolder,double balance){
        this.accountNumber=accountNumber;
        this.accoutHolder=accoutHolder;
        this.balance=balance;
    }
    public void modifyBalance(double balance){
        this.balance=balance;
    }
    public void display(){
        System.out.println("Account holder : "+accoutHolder+", Account number : "+accountNumber+", Balance : "+balance);
    }

    public static void main(String[] args) {
        BankAccount account1=new BankAccount(100245555,"abc",89000);
        System.out.println("Account1:");
        account1.display();
        account1.modifyBalance(85000);
        System.out.println("Account1 after modifying balance : ");
        account1.display();
        SavingsAccount account2=new SavingsAccount(100247777,"xyz",75000);
        System.out.println("Account2: ");
        account2.displayAccountHolder();
        account2.displayAccountNumber();

    }
}
	
	class SavingsAccount extends BankAccount{
    public SavingsAccount(long accountNumber,String accountHolder,double balance){
        super(accountNumber,accountHolder,balance);
    }
    public void displayAccountNumber(){
        System.out.println("Account number : "+accountNumber);
    }
    public void displayAccountHolder(){
        System.out.println("Account holder : "+accoutHolder);
    }
}

