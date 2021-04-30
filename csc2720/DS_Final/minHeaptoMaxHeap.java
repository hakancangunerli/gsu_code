/*
Hakan Can Gunerli 
convert a Minimum Heap to a Maximum Heap 
Time and Space Complexity: O(n)
*/ 

import java.util.*;

class minHeaptoMaxHeap {
    public static void main(String[] args) {
        int givenArray[] = { 3, 5, 9, 6, 8, 20, 10, 12, 18, 9 }; // the array we are given for testing
        System.out.print("Min Heap array : ");
        System.out.println(Arrays.toString(givenArray));
        convert(givenArray, givenArray.length);
        System.out.print("Max Heap array : ");
        System.out.println(Arrays.toString(givenArray));
        System.out.println("");

        /*
         * the result tree should look like this,
         * 
         * 20 18 10 12 9 9 3 (5) (6) (8)
         * 
         * so we should end up with 20,18,10,12,9,9,3,5,6,8
         */

    }

    static void toMax(int arr[], int i, int size) {
        int largest = i; // using this variable for swaps later on.

        // because the largest value is dependent on the right and left, they first need
        // to be initialized
        int right = 2 * i + 2;
        int left = 2 * i + 1;

        if (size > left && arr[left] > arr[i]) { // if array elem on the left is the larger one
            largest = left; // switch that as the largest and do the switch
        }
        if (size > right && arr[right] > arr[largest]) { // if array elem on the right is the larger one
            largest = right; // switch that
        }
        // needs to be in this order from the left, otherwise would print starting from
        // the left like
        // [12, 6, 20, 5, 9, 9, 10, 3, 18, 8]W

        if (largest != i) {
            int temp = arr[i]; // swap
            arr[i] = arr[largest]; // swap
            arr[largest] = temp; // swap
            toMax(arr, largest, size); // send it back to the max
        }
    }

    static void convert(int arr[], int size) {
        int i; // will be used for starting from bottom right of the heap

        do {
            i = (size - 2) / 2; // start from bottom right, build up using toMax;
            while (i >= 0) {
                toMax(arr, i, size); // build using max variable
                --i; // keep making the size smaller until we reach no values available
            }

        } while (size < 1);

    }

}