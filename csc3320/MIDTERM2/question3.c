#include <stdio.h>
#include <stdlib.h>
int sort_numeric(float *array, char input, int length); // the sort_numeric comes from q1.
int main()
{
        int i, len = 0;
        char inp, asc_des;
        float *arr;                               // pointer for storage.
        arr = (float *)malloc(1 * sizeof(float)); // as requested, dynamic size allocation is done here. returns a void to pointer to float  here.
        // c has automatic cast tho so idk if it's needed in c tbh i know cpp
        arr[0] = 0; // the values are added to this array

        printf("Enter 'a' or 'A' for Ascending sort or 'd' or 'D' for Descending sort:\n");
        scanf("%s", &asc_des);
        inp = 'y';

        do // there's multiple ways this could be done, i prefer the do-while
        {
                printf("Enter the element in this array\n");
                scanf("%f", &arr[i]);
                i = i + 1;
                printf("Do you want to enter more elements?\n"); // we need to ask the user each time
                scanf("%s", &inp);
                if (inp == 'y' || inp == 'Y')
                {
                        arr = realloc(arr, (i + 1) * sizeof(float));
                }
        } while (inp == 'y' || inp == 'Y');

        len += i; // iterate, then send to sort_numeric()
        sort_numeric(arr, asc_des, len);
        return 0;
}
int sort_numeric(float *array, char input, int len)
{
        int first, second, i;
        double tmp;                       // temp variable will be used for bubble sort later on, check L17
        if (input == 'a' || input == 'A') // if the input is A or A
        {

                for (first = 0; first < len; first++) // until the length of the array is finished
                {

                        for (second = first + 1; second < len; second++)
                        {
                                if (*(array + first) >= *(array + second)) // if array [the user input] plus first is larger than the second then using temp switch their positions. like a bubble sort.
                                {

                                        tmp = *(array + first);               // compare-switch
                                        *(array + first) = *(array + second); // compare-switch
                                        *(array + second) = tmp;              // compare-switch
                                }
                        }
                }
        }
        else if (input == 'd' || input == 'D')
        {
                for (first = 0; first < len; first++)
                {
                        for (second = first + 1; second < len; second++)
                        {
                                if (*(array + first) <= *(array + second)) // if array [the user input] plus first is less than the second then using temp switch their positions. like a bubble sort.
                                {

                                        tmp = *(array + first);               // compare-switch
                                        *(array + first) = *(array + second); //compare-switch
                                        *(array + second) = tmp;              // compare-switch
                                }
                        }
                }
        }

        else
        {
                printf("option not available .\n"); // return an error if it's malfunctioning
                return 0;
        }
        // just a little personal addition here, tell the user if their inputs are ascending descending or an error.
        if (input == 'a' || input == 'A')
        {
                printf("ascending");
        }
        else if (input == 'd' || input == 'D')
        {
                printf("descending");
        }
        else
        {
                printf("error");
        }

        printf(" values sorted are: ");

        for (i = 0; i < len; i++)
        {
                if (i != len - 1)
                {
                        printf("%f, ", array[i]);
                }
                else
                {
                        printf("%f]", array[i]);
                }
        }
        return 0;
}
