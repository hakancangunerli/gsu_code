import java.util.*;
class MeanMedian2
{
   public static void main(String[] args)
   {
    Scanner sc= new Scanner(System.in);
      int[] nums = new int[20];
      int num = 0;
      String entry;
      String list = "You entered: ";
      int a, b;
      int temp;
      double median;
      int total = 0;
      double mean = 0;
      final int QUIT = 9999;
      int size = 0;
      for(a = 0; num != QUIT && a < nums.length; ++a)
      {
         System.out.println("input values");
         num = sc.nextInt();
         System.out.println(list + num);
         nums[a] = num; 
         
      }
     System.out.println("size is " + a);
      if(num != QUIT)
         size = nums.length;
      else
         size = a - 1;
      System.out.println("size is " + size);
      System.out.println(list);
      int comparisonsToMake = size - 1;
      for(a = 0; a < size - 1; ++a)
      {
         for(b = 0; b < comparisonsToMake; ++b)
         {
            if(nums[b] > nums[b + 1])
            {
               temp = nums[b];
               nums[b] = nums[b + 1];
               nums[b + 1] = temp;
            }
         }
         --comparisonsToMake;
      }
      
        int summation = 0;
for(int i =0; i<size; i++){
summation += nums[i];
}
mean = summation / (double)size;
// i hate this, it does not even intellisense my stuff

if (size % 2 == 0){
    median = 0.5 *(nums[size/2] + nums[size/2 -1] );

}else{
    median = nums[size/2];
}

      System.out.println("The mean is " + mean +
         " and the median is " + median);

   }
}
   
// if the program says that you cannot see an update, it is because i had to open this file in vscode THIS GIVES ME NO HELP DOES NOT FILL ANYTHING
