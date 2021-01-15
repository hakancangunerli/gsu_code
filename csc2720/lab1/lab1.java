/*
Left up quadrant prints out 16 times.
The right upper quadrant prints out once.
Mid left prints infinitely. 
Mid right prints none because i is not defined correctly, if it was it would be 139 times.
Left lower quadrant would print y 4 times.
Right lower quadrant, i and j are not declared correctly. If they were it would be 4719 times.
*/ 
import java.util.*; 
public class lab1 {
    
    public static void main(String[] args) {
        int[] nums1 = { 4,9,5 };
        int[] nums2 = { 9,4,7,8 };

        System.out.println(Arrays.toString(common_elements(nums1, nums2))); // order does not matter as instructed. 

}
    public static int[] common_elements(int[] nums1, int[] nums2) {
        Arrays.sort(nums1); // we need to make the orders, so that if the user puts unsorted, it is sorted before it is used. 
        Arrays.sort(nums2);// we need to make the orders, so that if the user puts unsorted, it is sorted before it is used.
       
        int x = 0;
        int y = 0;
         List<Integer> final_array = new ArrayList<>(); // arraylist for dynamic resizability, we'll add the elements there. 
        while (x < nums1.length && y < nums2.length) {
            if (nums1[x] == nums2[y]) {
                final_array.add(nums1[x]);
                x++;
                y++;
            } else if (nums1[x] < nums2[y]) {
                x++;
            } else {
                y++;
            }
        }
       
        return arraylist_to_array(final_array); // converted arraylist to array bc lab TA said so. 
    }

    private static int[] arraylist_to_array(List<Integer> list) {
        int[] result = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }

}