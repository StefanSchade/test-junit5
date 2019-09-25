package demoapplication;

public class Account {

    private Customer customer;
    private double balance;

    public Account(Customer customer, double initialbalance) {
        this.customer = customer;
        this.balance = initialbalance;
    }

    public void deposit(double amount) {
        balance =+ amount;
    }

    public void withdraw(double amount) {
        if (balance-amount >= 0) {
            balance =-amount;
        } else {
            throw new IllegalArgumentException("Insufficient Deposit");
        }
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }
}
