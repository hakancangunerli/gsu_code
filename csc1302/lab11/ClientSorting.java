// hakan can "john" gunerli, csc1302
import java.util.* ;
public class ClientSorting {

    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        System.out.print("enter how many elements you are wishing to add: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the elements of the array.  ");
        for(int i = 0 ; i < n; i++) // iterating through the elements given. 
            arr[i] = sc.nextInt();
        System.out.print("not-sorted array" );
        for(int val : arr){
            System.out.print(val + " ");
        }
           // it will actually wait until you put three elements, if you put space it'll continue asking here. 
        System.out.println("");
        SelectionSorter(arr);
        System.out.print("selection-sorted array output:" );
        for(int val : arr)
            System.out.print(val + " ");
        System.out.println("");


        BubbleSorter(arr);

        System.out.print("bubble-sorted array output:" );
        for(int val : arr)
            System.out.print(val + " ");
        System.out.println("");

        System.out.print("insert-sorted array output:" );
        InsertSorter(arr);
        for(int val : arr)
        System.out.print(val + " ");
    System.out.println("");

        sc.close(); // bc there's a LEAK, im ending the scanner here, (as if anybody gives a damn)
 
    }

   public static void SelectionSorter(int[] arr) {
       

       for (int start = 0; start < arr.length - 1; start++) {

           int minimum_index_value = start;
           for (int j = start + 1; j < arr.length; j++)
               if (arr[j] < arr[minimum_index_value])
                   minimum_index_value = j;

           int temp = arr[minimum_index_value];  // switch here, i think it's called array rotation? 
           arr[minimum_index_value] = arr[start];
           arr[start] = temp;
       }
   }

   public static void BubbleSorter(int[] arr) {
       
       int temp;
       for (int i = 0; i < arr.length - 1; i++)
           for (int j = 0; j < arr.length - i - 1; j++)
               if (arr[j] > arr[j + 1]) {
                   temp = arr[j];    // the switcheroo here again,
                   arr[j] = arr[j + 1];
                   arr[j + 1] = temp;
               }
   }

   public static void InsertSorter(int[] arr) {
       
       for (int j = 1; j < arr.length; j++) {
           int arr_key = arr[j];
           int i = j - 1;
           while ((i > -1) && (arr[i] > arr_key)) {
               arr[i + 1] = arr[i];
               i--; // we don't need a switcheroo here, the point of this is to swap anyway. 
           }
           arr[i + 1] = arr_key;
       }
   }

  

}