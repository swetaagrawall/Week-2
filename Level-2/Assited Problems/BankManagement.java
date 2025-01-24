import java.util.*;

// Represents a Bank
class Bank {
    private String name;
    private ArrayList<Customer> customers;

    // Constructor
    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    // Method to open an account for a customer
    public void openAccount(Customer customer, double initialDeposit) {
        Account account = new Account(this, initialDeposit);
        customer.addAccount(account);
        if (!customers.contains(customer)) {
            customers.add(customer);
        }
        System.out.println("Account opened for " + customer.getName() + " in " + name);
    }

    public String getName() {
        return name;
    }

    // List all customers of the bank
    public void listCustomers() {
        System.out.println("Customers of " + name + ":");
        for (Customer customer : customers) {
            System.out.println("- " + customer.getName());
        }
    }
}

// Represents a Customer
class Customer {
    private String name;
    private ArrayList<Account> accounts;

    // Constructor
    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    // Method to add an account
    public void addAccount(Account account) {
        accounts.add(account);
    }

    // View the balance of all accounts
    public void viewBalance() {
        System.out.println("Accounts for " + name + ":");
        for (Account account : accounts) {
            System.out.println("  Balance: " + account.getBalance());
        }
    }

    public String getName() {
        return name;
    }
}

// Represents a Bank Account
class Account {
    private Bank bank;
    private double balance;

    // Constructor
    public Account(Bank bank, double initialDeposit) {
        this.bank = bank;
        this.balance = initialDeposit;
    }



    public double getBalance() {
        return balance;
    }

    public Bank getBank() {
        return bank;
    }
}

// Main class to demonstrate the relationship
public class BankManagement{
    public static void main(String[] args) {
        // Create a bank
        Bank bank = new Bank("Global Bank");

        // Create customers
        Customer customer1 = new Customer("Abc");
        Customer customer2 = new Customer("Xyz");

        // Open accounts for customers
        bank.openAccount(customer1,  500.00);
        bank.openAccount(customer1,  1000.00);
        bank.openAccount(customer2,  300.00);

        // View balances for customers
        customer1.viewBalance();
        customer2.viewBalance();

        // List customers of the bank
        bank.listCustomers();
    }
}
