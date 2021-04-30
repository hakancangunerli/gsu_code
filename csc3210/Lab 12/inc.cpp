#include <iostream>

using namespace std; 

int main() {
int array1[4] = {19,20,21,22};
int array2[4] = {18,19,20,21};
int length1 = sizeof(array1)/sizeof(array1[0]);
int length2 = sizeof(array2)/sizeof(array2[0]);
int maxlength = length1 / length2; 
int sample1= 48; 
int sample2 =5; 
int index =0; 
int exp1; 

while (index < maxlength){
    if (array1[index] > array2[index])
    {
        exp1 = (array1[1] * sample1) / (array2[index] * sample2);
        
    }
    else{
        exp1=0;
    }
    index = index +1; 
}

cout << "exp1 is " << exp1;
    return 0;
}