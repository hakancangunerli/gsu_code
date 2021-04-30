#include <stdio.h>
int main() {
    char result_Phoneval[12];
    char inputval_phone[13];
    int i = 1;

    printf("Enter Phone Number (format like[(999)999-9999]) :\n");
    scanf("%s", inputval_phone);
    for (i = 0; i < 13; i++) {
        if (i == 4) {
            result_Phoneval[i - 1] = '-';
        }
        else {
            result_Phoneval[i - 1] = inputval_phone[i];
        }
    }
    printf("You entered %.12s\t", result_Phoneval);
    return 0;
}