public class BankAccount {
    private  String accountHolderName;
    private final long accountNumber;
    private static String bankName="SBI";
    private static int noOfAccounts=0;

    public BankAccount(String accountHolderName , long accountNumber) {
    this.accountHolderName=accountHolderName;
    this.accountNumber=accountNumber;
    noOfAccounts++;
    }
    public  static  int getTotalAccounts(){
       return noOfAccounts;
    }
     public void display(){
         System.out.println("The name of account holder is "+accountHolderName +"\n The account number is "+ accountNumber);
     }

    public static void main(String[] args) {
    BankAccount ba1 = new BankAccount("Sweta" , 100021555);
    BankAccount ba2 = new BankAccount("Niketa" , 100021556);
    BankAccount ba3 = new BankAccount("Ankita" , 100021557);
    System.out.println("Account 1 :");
    if(ba1 instanceof BankAccount) {
            System.out.println("Yes ba1 is an inatance of BankAccount");
            ba1.display();
        }
    System.out.println("Account 2 :");
    if(ba2 instanceof BankAccount) {
            System.out.println("Yes ba2 is an inatance of BankAccount");
        ba2.display();
        }
    System.out.println("Account 3 :");
    if(ba3 instanceof BankAccount) {
            System.out.println("Yes b2 is an inatance of BankAccount");
            ba3.display();
        }
    System.out.println(" The number of account is "+noOfAccounts);
    }
}