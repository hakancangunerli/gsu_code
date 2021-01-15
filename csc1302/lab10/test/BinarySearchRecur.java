import java.util.Arrays; 
public class BinarySearchRecur {  
    public static int binSearchrec(int arr[], int l, int r, int x) 
    { 
        if (r >= l) { 
            int mid = l + (r - l) / 2; 
  
         
            if (arr[mid] == x) 
                return mid; 
  
 
            if (arr[mid] > x) 
                return binSearchrec(arr, l, mid - 1, x); 
  
         
            return binSearchrec(arr, mid + 1, r, x); 
        } 
  

        return -1; 
    } 
  
    public static void main(String args[]) 
    { 
        BinarySearchRecur ob = new BinarySearchRecur(); 
        int arr[] = { 2, 3, 4, 10, 40 }; 
        int n = arr.length; 
        int x = 10; 
        int result = BinarySearchRecur.binSearchrec(arr, 0, n - 1, x);
        System.out.print("original");
        System.out.println(Arrays.toString(arr));

        if (result == -1) 
            System.out.println("-1"); 
        else
            System.out.println("element found at " + result);
    } 
}