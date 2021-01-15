public class BankAccountClient
{
    public static void main (String[] args) {
   


        /// part b1 here ////// 
    BankAccount B1 = new BankAccount("Jake",40.0);
    B1.deposit(500.0); // depo method to deposit 300  
     
    B1.withdraw(300.0); // withdraw method to withdraw 300 


    System.out.println(B1.toString()); // print b1 
    
/// part b2 here ////// 
    BankAccount B2 = new BankAccount();

    System.out.println(B2.getName()); // here we first do it without init
    System.out.println(B2.getBalance());  // here we first do it without init 
    B2.setName("Adam"); // assign it after 
    B2.setBalance(500.0); // assign it after 
    
    System.out.println(B2.toString());
    
    

}
}