#include <stdio.h>
#include <stdlib.h>

int main()
{

    FILE *fp;
    char ch, file_name[100]; // create space for the name our file as well as our characters from th efile each time.
    int num_char = 0, word_count = 0, line_count = 0, in_word = 0;

    fp = fopen("test.txt", "r");

    while ((ch = fgetc(fp)) != EOF) // if for each character from our file is not equal to the end of file, keep running the inner code.
    {

        if (ch == ' ' || ch == '\0' || ch == '\n'|| ch == '\t')
        {
            if (in_word)
            {
                in_word = 0;  // used for counting the amount of words
                word_count++; //  iterate to count the amount of words.
            }

            if (ch = '\0' || ch == '\n')
                line_count++; // this is for calculating how many lines, if it's a newline or an empty one.
        }
        else
        {
            in_word = 1;
        }
        num_char++; // for the number of characters.
    }

    printf("Number of characters: %d \n", num_char);
    printf("Number of words: %d \n", word_count); 
    printf("Number of lines: %d \n", line_count);

    return 0;
}