package Exercise1; // Located in package Exercise1

// *******************************************************
// Account.java
//
// A bank account class with methods to deposit to, withdraw from,
// change the name on, charge a fee to, and print a summary of the account.
//
// Contributors: Peter Lillie, Kyle White, and Ricky Sethi
//
// *******************************************************
public class Account
{
    private double balance;
    private String name;
    private long acctNum;
    // ---------------------------------------------
//Constructor -- initializes balance, owner, and account number
// --------------------------------------------
    public Account(double initBal, String owner, long number)
    {
        balance = initBal;
        name = owner;
        acctNum = number;
    }
    // --------------------------------------------
// Checks to see if balance is sufficient for withdrawal.
// If so, decrements balance by amount; if not, prints message.
// --------------------------------------------
    public void withdraw(double amount)
    {
        if (balance >= amount)
            balance -= amount;
        else
            System.out.println("Insufficient funds");
    }
    // --------------------------------------------
// Adds deposit amount to balance.
// --------------------------------------------
    public void deposit(double amount)
    {
        balance += amount;
    }
    // --------------------------------------------
// Returns balance.
// --------------------------------------------
    public String getBalance()
    {
        return "Your account balance is: " + balance;
    }
    // --------------------------------------------
// Returns a string containing the name, account number, and balance.
// --------------------------------------------
    public String toString()
    {
        System.out.println("Owner Name: " + name + "\nAccount Number: " + acctNum + "\nCurrent Balance: " + balance);
        return("");
    }
    // --------------------------------------------
// Deducts $10 service fee //
// --------------------------------------------
    public double chargeFee()
    {
        return(balance-=10);
    }
    // --------------------------------------------
// Changes the name on the account
// --------------------------------------------
    public void changeName(String newName)
    {
        name = newName;
    }
}