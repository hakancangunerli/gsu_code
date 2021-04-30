/*
Hakan Can Gunerli 
 Write a Java program to build an integer hashSet
Time and Space Complexity: O(n^2)
*/ 

import java.util.*;
class hashSetImp {
    List<Integer>[] hashSet;

    @SuppressWarnings("unchecked") // i keep getting error so i'll suppress it here.
    public hashSetImp() {
        hashSet = (List<Integer>[]) new ArrayList[100]; // create a list of the set with a size of 100.
    }

    public static void main(String[] args) {

        hashSetImp hashSet = new hashSetImp();
        System.out.println("----------------");
        
        hashSet.insert(10);
        hashSet.insert(11);
        hashSet.insert(12);
        hashSet.remove(12); // removed 

        hashSet.contains(10); // true 
        hashSet.contains(11); // true 
        
        hashSet.insert(3); 
        hashSet.contains(12); // nothing there 
   
        hashSet.remove(42); // Hey value does not exist at all . 
        System.out.println("----------------");

    }

    public int getPosition(int key, int index) {
        List<Integer> position = hashSet[index]; // create a list of position from hashSet List
        int res = -1; // value that will be used for debugging

        if (position == null) 
        { // if the position is empty, return -1
            return res;
        }

        int size = position.size();
        for (int i = 0; i < size; ++i) 
        {
            if (key == position.get(i)) 
            { // if the key recieved is like the position we get, then res is equal to the
                                          // iteration
                res = i;
                break;
            }
        }

        return res;

    }

    public int getIndex(int key) {

        return key % 100; // the index is the key we get mod 100
    }

    public void insert(int key) 
    {
        int index = getIndex(key); // get index get position
        int position = getPosition(key, index);
        if (position < 0) 
        { // if the position we got from the key is less then zero and index is empty,
                            // create a new arraylist
            if (hashSet[index] == null)
            {
                hashSet[index] = new ArrayList<Integer>();
            }
            hashSet[index].add(key); // if it's not null, add the key to the hashset list
        } 
        else 
        {
            System.out.println("error");
        }
    }

    public void contains(int key) 
    {
        int index = getIndex(key); // get index from the method
        int pos = getPosition(key, index); // get position from the method
        if (pos >= 0) { // if the position found is 0 or equal, then the key is in the set
            
            System.out.println("True");
        } 
        else 
        {
            System.out.println("Hey nothing there");
        }
    }

    public void remove(int key) 
    {
        int index = getIndex(key); // get index get position
        int position = getPosition(key, index);
        if (position >= 0) 
        {
            hashSet[index].remove(position); // if position is higher or eq to 0, remove the val
            System.out.println("Removed");
        } 
        else 
        {
            System.out.println("Hey value does not exist at all"); // if no val to remove, give DNE.
        }
    }

}