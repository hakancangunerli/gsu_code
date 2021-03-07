#include <stdio.h>
int main(int argc, char const *argv[])// i come from a java background, please excuse that ;p 
{
    unsigned int input; // can't be a negative, it'll ruin the script. 
    
    printf("enter an input: ");
    scanf("%d", &input);
    int shifted = (input <<3)+ ~input; 

    printf("3 bit one's complement of %d is %d\n", input, shifted);
    printf("goodbye.");
    return 0;
}
