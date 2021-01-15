/*
Hakan (John) Gunerli
lab9 FR 3PM
#002504797
*/

import java.util.Scanner;

public class BlackJackJr {
    public static void main(String[] args) 
    {
        int firstCard=0;
        int secCard=0;
        int firstDealer=0;
        int secDealer=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("pick a number between 1-10");
do {
    firstCard= sc.nextInt();
if (firstCard>10 || firstCard<1){
    System.out.println("out of range, please provide between 1-10.");
}
} while (firstCard< 1 || firstCard> 10);
         
System.out.println("pick another number between 1-10");
do {
    secCard= sc.nextInt();
if (secCard>10 || secCard <1){
    System.out.println("out of range, please provide between 1-10.");
    secCard= sc.nextInt();
    if (secCard>10 || secCard <1){
        System.out.println("out of range, please provide between 1-10.");
    }
}
} while (secCard< 1 || secCard> 10);



         firstDealer=(int) (Math.random()*10+1);

         secDealer=(int) (Math.random()*10+1);
   
         

         System.out.println("you got "+firstCard+" and "+secCard);
         System.out.println("Your total:"+(firstCard+secCard));


         System.out.println("the dealer has "+firstDealer+" and "+secDealer);

         System.out.println("dealer total: "+(firstDealer+secDealer));
         if((firstCard+secCard)>(firstDealer+secDealer)){
             System.out.println("you won!");
        }
        else if
        ((firstCard+secCard)==(firstDealer+secDealer)){
            System.out.println("tie!");
    }
    else
    {
        System.out.println("dealer wins!!");
    }
}
}