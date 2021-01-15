public class SwapArrayTest {
  

    public static void main(String[] args) {
        int[] a1 = {11, 42, -5, 27, 0, 89};
        int[] a2 = {10, 20, 30, 40, 50, 60};
       
       
        swapAll(a1, a2); 
        System.out.print("new a1: ");
        for(int i=0; i<a1.length; i++) // start switching from the zeroth index, end when you cannot anymore. without this, it just prints the zeroth index.
            System.out.print(a1[i]+" ");
        System.out.println();
               
        System.out.print("new a2: "); 
        for(int i=0; i<a2.length; i++) // start switching from the zeroth index, end when you cannot anymore. without this, it just prints the zeroth index.
            System.out.print(a2[i]+" ");
        System.out.println();
    }



    public static void swapAll(int arr1[], int arr2[]){
       
        for(int i=0; i<arr1.length; i++){
            int temporary = arr1[i]; // strong the content temporarily, 
            arr1[i] = arr2[i]; // replace a1 with a2 
            arr2[i] = temporary; 
        }
 
 }
 
 
}