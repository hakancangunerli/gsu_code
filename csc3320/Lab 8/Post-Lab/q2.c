#include <stdio.h>
int main(int argc, char const *argv[])
{
    int letters;
    int words;
    char character;
    int space;
    printf("Enter a sentence");
    while ((character = getchar()) != '\n')
    {
        if (character != ' ')

        {
            if (!space)
            {
                words++;
                space = 1;
            }
            letters++;
        }
        else
        {
            space = 0;
        }
    }
    printf("average word length: %.1f", (double)letters / words);
    return 0;
}
