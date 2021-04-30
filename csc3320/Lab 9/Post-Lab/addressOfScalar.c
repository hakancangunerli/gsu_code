#include <stdio.h>

int main(int argc, char* argv[])
{
  char charvar = '\0';
// intialize a char variable, print its address and the next address char charvar = '\0';
printf("address of charvar = %p\n", (void *)(&charvar)); printf("address of charvar - 1 = %p\n", (void *)(&charvar - 1));
printf("address of charvar + 1 = %p\n", (void *)(&charvar + 1)); // intialize an int variable, print its address and the next address printf("address of intvar = %p\n", (void *)(&intvar));
int intvar = 1;
printf("address of intvar - 1 = %p\n", (void *)(&intvar - 1));
 printf("address of intvar + 1 = %p\n", (void *)(&intvar + 1));

return 0;
}

// Answer :
// the intvar would be shifted 4 bytes as supposed to 1 beaucse the integer value is 4 bytes.