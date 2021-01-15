import java.util.Arrays;

public class SequenSearch {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 5, 7, 10, 19};
		int key = 2;
		SequenSearch(arr, key);
	}
	
	public static void sequenSearch(int arr[], int key) {
        System.out.println("original array is " + Arrays.toString(arr));
		int i=0;
		while(arr[i]<key) {
			i++;
		}
		if(arr[i]==key) {
			
			System.out.println("index "+(i+1));
		}else {
			System.out.println("-1");
		}
		
	}
}