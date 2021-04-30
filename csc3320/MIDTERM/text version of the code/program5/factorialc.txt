#include <stdio.h>
int main() 
{
int user_input;

unsigned long long factorial = 1;
printf("Enter an integer: ");
scanf("%d", &user_input);


if (user_input < 0)
{
printf("Error! Factorial of a negative number doesn't exist.");   
}
else if (user_input == 0)
{
  printf("factorial of zero is 1.");
}

else 
{
  int i; // used for iterating for the loop. 
i=1; 
for (i; i <= user_input; i++) 
{
factorial *= i;
}
printf("factorial of the given number %d is %llu.\n ", user_input, factorial);
}

return 0;
}

// note: this application will not work after 20, simply due to the size in which unsigned long long can hold. 