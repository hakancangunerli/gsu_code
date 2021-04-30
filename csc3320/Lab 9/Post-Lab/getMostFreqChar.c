#include <stdio.h>

int main(int argc, char* argv[])
{
FILE* file;
char charac;
int count[26] = { 0 }; // empty array, 26 letters in the alphabet

file = fopen("text.txt", "r");

do 
{
charac = (char)fgetc(file);

if (  charac >= 'A' && charac <= 'Z' ) {count[charac - 'A']++;}

else if (charac >= 'a' && charac <= 'z') {count[charac - 'a']++;}

} while (charac != EOF);

int i; 
int max = -1; 
int maxIndex = -1;

for (i = 0; i < 26; i++) {
  if (max < count[i]) {
     maxIndex = i; 
     max = count[i];
     max++;
     }
}
printf("The most frequent letter is \'%c\'. It appeared %d times.", 'a' + maxIndex, max);

return 0;
}