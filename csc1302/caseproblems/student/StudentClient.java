// Hakan Gunerli Lab 5 #002504797

import java.util.*; 

public class StudentClient 
{
   public static void main(String[] args) 
   {
      Undergraduate Alex = new Undergraduate("CS",3.9,54,true);
      Graduate Mary = new Graduate("Computer Science",3.91,54,"Masters","Data Science",1);
      Exchange YingShu = new Exchange("CS",3.9,54,false,"Taiwan","Fall 2020");
      
      System.out.println("Alex:");
      System.out.println(Alex.getMajor() + "\n" + Alex.getgradepointaverage() + "\n" + Alex.getYear());
      if( Alex.isHonor()) {
         System.out.println("Honor \n"); 
      } else {
         System.out.println("Not Honor \n");   
      }
      System.out.println("Mary:");
      System.out.println(Mary.getConcentration() + "\n" + Mary.getYears() + "\n" + Mary.getMajor() +"\n");
      
      System.out.println("YingShu the Exchange Student:");
      System.out.println(YingShu.getgradepointaverage() + "\n" + YingShu.getMajor() + "\n" + YingShu.getCountry());
   } 
}