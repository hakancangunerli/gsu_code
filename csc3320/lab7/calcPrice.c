#include <stdio.h> 
int main(){ 
    int item_num; 
    double unit_price; 
    int quantity_amount; 
    char purch_date[10];
    printf("Enter item number:"); 
    scanf("%d", &item_num); 


    printf("Enter unit price:"); 
    scanf("%lf", &unit_price); 
    
    printf("Enter quantity:"); 
    scanf("%d", &quantity_amount); 
    
    printf("Enter purchase date:");
    scanf("%s", purch_date); 
    
    double total_val = unit_price * quantity_amount; 
    printf("Item\tUnit Price($)\t QTY\tPurchase Date\tTotal Amount\n"); 
    printf("%d \t$ %9.2lf \t %d \t %s \t $%9.2lf \n\n", item_num, unit_price, quantity_amount, purch_date, total_val); 
    return 0; 
}
