
#include <stdio.h>  
#include <string.h>  
    void subs(char firstStr[], char secondStr[], int start, int end){  // i'll make this a function for substringing.
       int i=0; 
       while ((i) < end) {   // while the length exists, i want to add the the value of firstStr (start+i) into secondStr. 
          secondStr[i] = firstStr[start+i];  // iterate
          i++;  // keep doing until reaching end 
       }   
    }  
      
int main()  
{  
    char str1[20] = "testingthis"; 
    char str2[20] = "valuetestin";  
      
    printf("string one : %s",str1);  
    printf("\nstring two:  %s ", str2 );  

    printf("\n---------------------------");
      
    strcat(str1, str2);   // concat the strings into a large array 

    subs(str1, str2, 0, (strlen(str1) - strlen(str2)));  // iterate starting from 0 to the length starting from the val of str1 - str2

    subs(str1, str1, strlen(str2), strlen(str1));  // iterate within the lenght of the char arrays 
     
    printf("\nstring one : %s",str1);  
    printf("\nstring two:  %s", str2 );  
      
    return 0;  
}  
