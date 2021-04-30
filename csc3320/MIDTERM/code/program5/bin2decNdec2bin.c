#include <stdio.h>
#include <math.h>
int main(){
        char letter;
        printf("target conversion, (b for binary, d for decimal) ");
        scanf("%s", &letter);
        if(letter == 'b'){
                int a[10], n; // i'll use these to store the results from binary inside. 
                printf("input decimal value: ");
                scanf("%d", &n);
                int i = 0;
                for(i;n>0;i++){
                        a[i]=n%2; // divisible by two. 
                        n=n/2;
                }
                printf("your input roughly in binary is: ");
                i = i-1; // condition, 
                
                for(i;i>=0;i--){
                        printf("%d",a[i]);
                }
                printf(" goodbye.");

        }else if (letter == 'd'){
                int rem; 
                long long bin;
                int dec = 0;
                int j = 0;
                printf("input binary value ");
                scanf("%lld", &bin);
                while(bin != 0){
                        rem = bin % 10;
                        bin /= 10;
                        dec += rem * pow(2, j);
                        j += 1;
                }
                printf("value in decimal is %d\n", dec);
                printf("goodbye.");
        }else{
                printf("i do not understand your input, please try again.");
                }
                return 0;
}