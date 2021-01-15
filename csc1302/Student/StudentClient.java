import java.util.*; 

public class StudentClient 
{
   public static void main(String[] args) 
   {
      Undergraduate Maya = new Undergraduate("CS",3.9,54,true);
      Graduate John = new Graduate("computer science",4.10,50,"Masters","Cybersecurity",1);
      Exchange exchange = new Exchange("CS",2.3,78,false,"Australia","Summer 2017");
      
      System.out.println("Maya:");
      System.out.println(Maya.getMajor() + "\n" + Maya.getGpa() + "\n" + Maya.getYear());
      if( Maya.isHonor()) {
         System.out.println("Honor \n"); 
      } else {
         System.out.println("Not Honor \n");   
      }
      
      System.out.println("John:");
      System.out.println(John.getConcentration() + "\n" + John.getYears() + "\n" + John.getMajor() +"\n");
      
      System.out.println("Exchange Student:");
      System.out.println(exchange.getGpa() + "\n" + exchange.getMajor() + "\n" + exchange.getCountry());
   } 
}