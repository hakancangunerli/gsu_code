#include<stdio.h>
#include <string.h>

int main(){

char ch[10]; // initiate 10 character string 

printf("Enter a password : ");
scanf("%s", ch); // scan that 

int length=strlen(ch); //  the amount of characters in our ch string 
int points,length_sub_ten; // we'll use these variables to calculate the points

if(length!=10) 
{ // if the amount of character is not 10, which is safe, run 
 
length_sub_ten=10-length; // how many characters are missing, 
points=5*length_sub_ten; // give that a number 

if(points>30) // if the point calculated is higher than 30, give an error 
{ printf("Deduction points amount: %d \n The password is unsafe! Please reset.", points); }
else { printf("The password is safe."); }

}

else
{ //  this is for the upper if. 
 printf("The password is safe.");
}

return 0;

}