public class BankAccount
{
    private String name; // two privates 
    private double balance; // two privates  
    
 public BankAccount( String name_new, double bal_new ) {
     name = name_new;
     balance = bal_new; 
    }
    public BankAccount() {
     
    }
    public String getName() {
        return name;
       }
    public void setName(String newName) {
        name = newName;
    }
    
     public void setBalance(Double newBalance) {
        balance = newBalance;
    }
    
 public double getBalance() {
    return balance;
   }

public double deposit(double amount) {
    balance = balance + amount;
    return balance;
}

public double withdraw(double amount) {
    balance = balance - amount ;
    return balance;
}
public String toString() {
    return ( name + " " + balance );

} 
}