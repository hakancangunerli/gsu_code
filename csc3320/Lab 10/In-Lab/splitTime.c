#include<stdio.h> 
// Write the declaration of function split_time 
void split_time(long total_second, int *hr, int *min, int  *sec);

int main()
{ 
  int n, hr, min, sec; 
  printf("Enter seconds: "); 
  scanf("%d",&n); 
  /* Write the statement to call split_time */ 
  split_time(n, &hr, &min, &sec);
  printf("Converted format: %d hour %d mins %d secs", hr, min, sec); 
  return 0; 

} 
void split_time(long total_second, int *hr, int *min, int *sec )
{ 
  *sec = 0;
	*sec = total_second % 60;
  total_second = total_second / 60;
	
  *min = 0;
  *min = total_second % 60;
  total_second = total_second / 60;
	
  
  *hr = 0;
  *hr = total_second % 60;
	total_second = total_second / 60;
  
}