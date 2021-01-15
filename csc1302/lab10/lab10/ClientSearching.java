import java.util.Arrays;

public class ClientSearching {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 5, 7, 10, 19};
	
		System.out.println("Array "+ Arrays.toString(arr));

		BinarySearch it_bin = new BinarySearch(); 
		int searched = 10; 
		int key = 5;
		int recursiveSearched = 19;

		int result = it_bin.binarySearch(arr, searched);
		BinarySearchRecur rec_bin = new BinarySearchRecur();
		int rec_result = BinarySearchRecur.binSearchrec(arr, 0, arr.length - 1, recursiveSearched);
		if (result == -1 && rec_result == -1)
			System.out.println("-1");
		else{
			System.out.println("Iterated BinarySearch element " + searched + " found at " + "index " + result);
			System.out.println("Recursive BinarySearch element " + recursiveSearched+  " found at " + rec_result);
			System.out.print("Sequential search element " + key + " is indexed at ");
			SequenSearch(arr, key);
		}
		

	
			
	}

	public static void SequenSearch(int arr[], int index) {
		int iti = 0;
		while (arr[iti] < index) {
			iti++;
		}
		if (arr[iti] == index) {

			System.out.println( (iti + 1));
		} else {
			System.out.println("-1");
		}

	}

	public static class BinarySearchRecur {
		public static int binSearchrec(int arr[], int start, int end, int find) {
			if (end >= start) {
				int midfield = start + (end - start) / 2;

				if (arr[midfield] == find)
					return midfield;

				if (arr[midfield] > find)
					return binSearchrec(arr, start, midfield - 1, find);

				return binSearchrec(arr, midfield + 1, end, find);
			}

			return -1;
		}
	}

	static class BinarySearch {
		public int binarySearch(int arr[], int x) {
			int init = 0, iteration = arr.length - 1;
			while (init <= iteration) {
				int midpoint = init + (iteration - init) / 2;

				if (arr[midpoint] == x){return midpoint;}
				if (arr[midpoint] < x){init = midpoint + 1;}
				else{iteration = midpoint - 1;}
					
			}

			return -1;
		}

	}
}
  
	








