#include <stdio.h>

int main (int argc, char* argv[]) 
{

struct dialing_code {
    char *country;
    int code;
};


    int intl_code; // code for exit, in case the user wants to exit the program. 
    
    const struct dialing_code country_codes[] = {
        {"Argentina", 54}, {"Bangladesh",        880},  {"Germany",    49},          {"India",              91},
       {"Indonesia", 62}, {"Russia",              7},  {"Brazil",     55},          {"Iran",               98},
        {"Ethiopia", 251}, {"France",             33},  {"China",      86},        {"Colombia",           57},
        {"Italy",      39}, {"Congo,Dem.",        243}, {"Egypt",     20},         {"Japan",              81}, 
        {"Mexico",     52}, {"Nigeria",           234}, {"Burma",    95},           {"Turkey",     90},{"United States",     1},
        
        
        };


    do // i would like to ask the same question until i get a response, or a quit sequence so i'll use do-while. 
    {
      int country_code_found; // a variable for holding the value. 

        printf("Please input the international code: "); // ask input 
        scanf("%d", &intl_code);  
  
        for (int i = 0; i < sizeof(country_codes) / sizeof(*country_codes) ; i++) { // for loop until we reach the size of the country codes, array and pointer. 
            if (country_codes[i].code == intl_code) // if we have a match within each iteration and input 
            {
                printf("The country is: %s\n", country_codes[i].country); // print the code and the country 
              country_code_found+=1;    
                            break; 
            }
        }
        if (!country_code_found){ // if the found code has not changed, then it's code not found. 
  printf("Code not found.\n");
        }
          
    } while(1); // same thing as saying while True, 

    return 0;
}