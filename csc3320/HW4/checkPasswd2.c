//import useful libraries...
#include <stdio.h>
#include <string.h>

int main() {
char password[10]; //declare char string, 
int points = 0;

printf("Enter the password: ");
scanf("%s",password); //Tae password from the user...
  
int len = strlen(password); // length of the value 


int lower_count = 0; 
int upper_count=0;
for(int i = 0;i<len;i++)
{
if(password[i] >= 'A' && password[i] <= 'Z')  // user input and iterate through the passwd [UPPERCASE]
{
upper_count += 1;
}
if(password[i] >= 'a' && password[i] <= 'z') // user input and iterate through the passwd [LOWERCASE]
{
lower_count += 1;
}

}


if(upper_count < 2) // lack of capital letters, implying there needs to be at least 2 
{
points += 20; 
}

if(lower_count <= 0) // missing lower case, implying we only need one. 
{
points += 20; 
}


int num_count=0;

for(int i = 0;i<len;i++)
{
if(password[i] >= '0' && password[i] <= '9')
{
num_count += 1;
}
}
  
if(num_count <= 0)
{
points += 20; 
}

int consecutive_count = 0;
// we'll do nested iteration to check for consective counts. 
for(int i=0;i<len;i++)
{
for(int j = i+1;j<len;j++) 
{
if(password[j] - password[i] == 1)  { consecutive_count += 1;} // if the i and the one next to it is the same, then consecutive_count goes up
}
}
  
if(consecutive_count >= 2) // if there are more than 2 consecutive, add points to the tally 
{
points += 20; 
}
if(points > 30) // finally if the deduction points is higher than 30, say the passwd is bad. 
{
printf("Deduction Points: %d, The password is unsafe! Please reset.", points);
}
else
{
printf("Deduction Points: %d, the password is safe.",points);
}
  
return 0;
}