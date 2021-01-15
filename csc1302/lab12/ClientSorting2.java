// csc1302 hakancangunerli labtime monday 3-5pm 
import java.util.*;
/* @author can;  */
public class ClientSorting2 {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] array = new String[5]; // this is selection 
		String[] arrOne = new String[5]; // sort 
		int[] arrTwo = new int[5]; // and finally dual 
		System.out.println("selection sort elements: , limit 5");
		for(int i = 0; i < array.length; i++) {
			array[i] = scan.nextLine();
		}
		SelectionSorter(array);
		System.out.println("insertion sort elements:,limit 5");
		for(int i = 0; i < arrOne.length; i++) { // iterate
			arrOne[i] = scan.nextLine();
		}
		InsertSorter(arrOne);
		System.out.println(" dual sort: ,limit 5 *INTEGERS*");
		for(int i = 0; i < arrOne.length; i++) { // iterate
			arrTwo[i] = scan.nextInt();
		}
		dualSort(arrTwo);
	}



	public static int[] arrRotation(int[] arr1, int i, int j) { // switch the locations of arrays
		int temp = arr1[i];
		arr1[i] = arr1[j];
		arr1[j] = temp;
		return arr1;
	}


	public static void SelectionSorter(String[] arr) {
		System.out.println("selection sort:");
		System.out.println("original" + Arrays.toString(arr));
		for(int i = 0; i < arr.length-1; i++) {
			String temp;
			int max_ind = i;
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[j].compareTo(arr[max_ind]) < 0) {
					max_ind = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[max_ind];
			arr[max_ind] = temp;
		}
		System.out.println("Sorted array is " + Arrays.toString(arr));
		System.out.println();
	}
	public static void InsertSorter(String[] arr1) {
		
		System.out.println("original insertion sort" + Arrays.toString(arr1));
		String temp;
		int a = 1, b;
		while(a < arr1.length) {
			temp = arr1[a];
			b = a - 1;
			while(b >= 0 && arr1[b].compareTo(temp) > 0) {
				arr1[b+1] = arr1[b];
				b -= 1;
			}
			arr1[b+1] = temp;
			a += 1;
		}
		System.out.println("Sorted array is " + Arrays.toString(arr1));
		System.out.println();
	}
	public static void dualSort(int[] arr1) {
		
		System.out.println("original dual sort:" + Arrays.toString(arr1));
		int n = arr1.length;
		for(int i = 0, j = n-1; i < j; i++, j--) {
			int min = arr1[i], max = arr1[i];
			int min_ind = i, max_ind = i;
			for(int k = i+1; k <= j; k++) { // iterate the max
				if(arr1[k] > max) {
					max = arr1[k];
					max_ind = k;
				}else if(arr1[k] < min) { // iterate the min 
					min = arr1[k];
					min_ind = k;
				}
			}
			arrRotation(arr1, i, min_ind);
			
			if(arr1[min_ind] == max) {
				arrRotation(arr1, j, min_ind);
			}else {
				arrRotation(arr1, j, max_ind);
			}
		}
		System.out.println("sorted array:" + Arrays.toString(arr1));
		System.out.println();
	}
	
	


}