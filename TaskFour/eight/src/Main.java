/*
Write a Java program to remove the duplicate elements of a given array and return the new length of the array.
 */

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
            ArrayList<Integer> nums = new ArrayList<Integer>( Arrays.asList(1,2,3,4,5,6,7,8,9,8,7,5,57,5,43,2,1,23));
            ArrayList<Integer> nums2 = new ArrayList<>();

            for(int i=0;i<nums.size();i++){
                if(!nums2.contains(nums.get(i))){
                    nums2.add(nums.get(i));
                }
            }

        System.out.println("Output array: "+nums2.toString());
        System.out.println("Output size: "+nums2.size());
    }
}
