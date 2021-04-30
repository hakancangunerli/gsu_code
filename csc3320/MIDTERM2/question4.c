
#include <stdio.h>
#include <string.h>
#include <time.h> // i'll use time to do agetwodates, which is a function to retrive the difference of years/days/months of the person's birthday, since that's needed for generate_code()
//structure to hold data related user

struct user
{ // first create a struct to simplify our job.
  char fname[100];
  char lname[100];
  int dd, pdd; // day
  int mm, pmm; // month
  int yy, pyy; // year
  char sex[100];
  int dnumber;
  char vaccinetype[100];
  char zip[100];
};
// they need to be declared here unless you want out-of-scope declaration errors and implicit declarations

void regis(int);
int agetwodates(int pdate, int pmonth, int pyear, int bdate, int bmonth, int byear);
void gen_code(struct user var);
void display(struct user var, int i);

// letting c know that i'll be calling these methods here. in total there're five functions/methods. 

int main(void)
{

  int how_many_people; // this will be given by the user. for now, i'll test up to 10 as requested.
  printf("Enter the number of people you want to register:\n");
  scanf("%d", &how_many_people);
  regis(how_many_people);
  return 0;
}
// in order to get age between two days, i'll use this function called agetwodates
int agetwodates(int pdate, int pmonth, int pyear, int bdate, int bmonth, int byear)
{
  int month[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // the months of the year feb is 28 so
  if (bdate > pdate)
  {
    pdate = pdate + month[bmonth - 1];
    pmonth = pmonth - 1;
  }
  if (bmonth > pmonth)
  {
    pyear = pyear - 1;
    pmonth = pmonth + 12;
  }
  int final_date = pdate - bdate;
  int final_month = pmonth - bmonth;
  int final_year = pyear - byear;
  return final_year;
}
void regis(int len)
{
  int choice;
  char id[9];
  char age[3];
  int amount_of_ppl;
  amount_of_ppl = len;
  struct user person[amount_of_ppl];
  int i;
  for (i = 0; i < amount_of_ppl; i++)
  {
    printf("Enter details for Person # %d:\n", i + 1);

    printf("first name: ");
    scanf("%s", person[i].fname);

    printf("last name ");
    scanf("%s", person[i].lname);

    printf("Enter Birth Date(mm/dd/yyyy) : ");                      // we don't live in europe so, this would need to be changed if it's the uk
    scanf("%d/%d/%d", &person[i].mm, &person[i].dd, &person[i].yy); // put the values in order to the struct

    printf("Choose sex : \n");
    printf("\t1. Male\n");
    printf("\t2. Female\n\t");
    printf("3. Do not wish to identify");
    printf("\n\t Enter choice : ");
    scanf("%d", &choice);

    if (choice == 1)
    {
      strcpy(person[i].sex, "Male");
    }
    else if (choice == 2)
    {
      strcpy(person[i].sex, "Female");
    }
    else if (choice == 3)
    {
      strcpy(person[i].sex, "Do not wish to identify");
    }
    // i'm not gonna return an else, i don't think it's necessary.

    printf("Enter Dose Number : ");
    scanf("%d", &person[i].dnumber);

    if (person[i].dnumber == 2)
    {
      printf("Enter Previous Dose Date(mm/dd/yyyy) : ");
      scanf("%d/%d/%d", &person[i].pmm, &person[i].pdd, &person[i].pyy);
    }

    printf("Choose type of vaccine : \n");
    printf("\t1. Pfizer\n");
    printf("\t2. Moderna\n");
    printf("\t3. Johnson&Johnson\n");
    printf("enter choice, ");
    scanf("%d", &choice);
    if (choice == 1)
    {
      strcpy(person[i].vaccinetype, "Pfizer");
    }
    else if (choice == 2)
    {
      strcpy(person[i].vaccinetype, "Moderna");
    }
    else if (choice == 3)
    {
      strcpy(person[i].vaccinetype, "J&J");
    }
    // i'm not gonna return an else, i don't think it's necessary. just string copy is good enough. 

    printf("Enter Zip : "); // enter zip and store it 
    scanf("%s", &person[i].zip);
  }
  printf("Information about registered people \n"); // print the users using display() 
  for (i = 0; i < amount_of_ppl; i++)
  {
    display(person[i], i);
  }
}
void gen_code(struct user var)
{
  char id[9]; // the size would be this big for the randomly generated uniq code 

  id[0] = var.fname[0]; // get the f name first character 
  id[1] = var.lname[0]; // get the l name first character 

  time_t t = time(NULL);
  struct tm tm = *localtime(&t); // using time.h, get date 

  int ageTemp = agetwodates(tm.tm_mday, tm.tm_mon + 1, tm.tm_year + 1900, var.dd, var.mm, var.yy); // pass parameteres to get the person's bd 

  id[2] = (char)(ageTemp / 10 + '0'); 
  id[3] = (char)(ageTemp % 10 + '0'); // age as the id's 4th element 

  id[4] = var.vaccinetype[0];

  id[5] = var.zip[2]; // the first last three of the zipcode
  id[6] = var.zip[3];
  id[7] = var.zip[4];
  id[8] = '\0';
  printf("Unique code: %s\n\n", id); // unique code is created. 
}
void display(struct user var, int i)
{
  printf("\nPerson %d:\n", i + 1);
  printf("\nFirst Name : %s\n", var.fname); // print results 
  printf("Last Name : %s\n", var.lname);
  printf("Birthdate : %d/%d/%d\n", var.mm, var.dd, var.yy); // print in order. 
  printf("Sex : %s\n", var.sex);
  printf("Dose Number : %d\n", var.dnumber);
  if (var.dnumber == 2)
  {
    printf("Previous Dose Date : %d/%d/%d\n", var.pmm, var.pdd, var.pyy); // if the dose number is two, print that date as well. 
  }
  printf("Vaccine type : %s\n", var.vaccinetype); 
  printf("Zip : %s\n", var.zip);
  gen_code(var);
}