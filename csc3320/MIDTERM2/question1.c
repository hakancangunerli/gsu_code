
#include <stdio.h>
int sort_numeric(float *array, char input, int len);

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

int main()
{
        char inp;
        int len, i;

        printf("Enter 'a' or 'A' for ascending or 'd' or 'D' for descending\n"); // ask the user for their input
        scanf("%c", &inp);

        printf("Enter the number of elements in the array and enter the elements one after the other:\n");
        scanf("%d", &len); // how many elements, which will be used for iteration later on
        float arr[len];
        printf("Enter the elements\n");
        for (i = 0; i < len; i++) // ask the user for their input one by one
        {
                scanf("%f", &arr[i]); // scan all as float since we have some that have decimal points on em.
        }
        sort_numeric(arr, inp, len); // pass that to the method
        return 0;
}
