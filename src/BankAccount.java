import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
   The BankAccount class is an abstract class that holds
   general data about a bank account. Classes representing
   specific types of bank accounts should inherit from
   this class.
*/

public abstract class BankAccount
{

   protected static int numberOfAccounts = 100001;
   private double balance;
   private String owner;
   private String accountNumber;

   /**default constructor*/
   public BankAccount()
   {
      balance = 0;
      accountNumber = numberOfAccounts + "";
      numberOfAccounts++;
   }

   public BankAccount(String name, double amount)
   {
      owner = name;
      balance = amount;
      accountNumber = numberOfAccounts + "";
      numberOfAccounts++;
   }

   public BankAccount(BankAccount oldAccount, double amount)
   {
      owner = oldAccount.owner;
      balance = amount;
      accountNumber = oldAccount.accountNumber;
   }

   public void deposit(double amount)
   {
      balance = balance + amount;
   }

   public boolean withdraw(double amount)
   {
      boolean completed = true;

      if (amount <= balance)
      {
         balance = balance - amount;
      }
      else
      {
         completed = false;
      }
      return completed;
   }

   public double getBalance()
   {
      return balance;
   }

   public String getOwner()
   {
      return owner;
   }

   public String getAccountNumber()
   {
      return accountNumber;
   }

   public void setBalance(double newBalance)
   {
      balance = newBalance;
   }

   public void setAccountNumber(String newAccountNumber)
   {
      accountNumber = newAccountNumber;
   }

   public void setAccountNum(String num, String id)
   {
      accountNumber = num + id;
   }
}