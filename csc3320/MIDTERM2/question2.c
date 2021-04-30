
#include <stdio.h>
#include <string.h>
#include <ctype.h>
#include <stdlib.h>

void sort_alphabetic(char *string[]); // telling the compiler that i'll be using this.

int main(void)
{
    int val;
   

    printf("how many elements?: ");
    scanf("%d", &val);
     char *list[val*100]; // {"Systems ", "Programming", "Deep", "Learning", "Internet", "Things", "Robotics", "Course"}; 

     // the size of the list will be allocated depending on the size provided by the user. 

    for (int i = 0; i < val; i++) // depends on the size the user wishes, i'll just do the test case here.
    {
        printf("enter string: ");      // enter user input
        list[i] = (char *)malloc(sizeof(list)*10); /// 100 bc i've had issues with the sizing, dynamic allocation. // the size will be allocated depending on the user input 
        scanf("%s", list[i]); // scan the inputs
    }
    sort_alphabetic(list);
    return 0;
}

void sort_alphabetic(char *the_list[])
{
    int i;        // will be used for iteration.
    int j;        // will be used for iteration.
    char *tmp;    // will be used for bubblesort
    char asc_des; // ask user if they want A or D
    printf("ascending or descending? ");
    scanf(" %c", &asc_des);

    for (i = 0; the_list[i]; i++) // double iteration for comparison
    {
        for (j = 0; the_list[j]; j++) // double iteration for comparison
        {

            if (asc_des == 'a' || asc_des == 'A')
            {
                if (strcmp(the_list[i], the_list[j]) < 0) // if strcmp between two characters is less than 0, which means they are not the same and also smaller in value
                {
                    tmp = the_list[i];         // bubblesort
                    the_list[i] = the_list[j]; // bubblesort
                    the_list[j] = tmp;         // bubblesort
                }
            }
            else if (asc_des == 'd' || asc_des == 'D')
            {
                if (strcmp(the_list[i], the_list[j]) > 0) // if it's larger, which means it's z coming first
                {
                    tmp = the_list[i];         // bubblesort
                    the_list[i] = the_list[j]; // bubblesort
                    the_list[j] = tmp;         // bubblesort
                }
            }
        }
    }

    // personal addition here, i just like that the user knows which one they picked.
    if (asc_des == 'a' || asc_des == 'A')
    {
        printf("in ascending order the list is \n");
    }
    else if (asc_des == 'd' || asc_des == 'D')
    {
        printf("in descending order the list is \n");
    }

    for (i = 0; the_list[i]; i++)
    {
        printf("%s\n", the_list[i]); // print the list
    }
}
