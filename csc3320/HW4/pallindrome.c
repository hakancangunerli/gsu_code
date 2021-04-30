#include <stdio.h>
#include <string.h>

int main()
{
    char input[20];
    printf("Enter pallindrome : ");
    scanf("%s", input);
    int LtR = 0; // start from the left. 
    int RtL = strlen(input) - 1; // start from the right. 

    while (RtL > LtR)
    {
        if (input[LtR++] != input[RtL--]) // keep checking from the left to the right, if they don't match no pallindrome, otherwise they are. 
        {
            printf("%s is not a Palindrome", input); 
            break; // if no match, just break. 
        }
        else{
              printf("%s is a palindrome", input);
          break; // if match, break too. 
        }
    }

    return 0;
}