/*
6. Write a program to remove the duplicates from a sorted array change them into 0 and add 0 in the end.

input: [2,2,3,3,4,4,4,11,11,11,11]

output:[2,3,4,11,0,0,0,0,0,0,0]
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
            ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2,2,3,3,4,4,4,11,11,11,11));

        System.out.println("original List: " +arr);

        ArrayList<Integer> output = changeDuplicateToZeroEnd(arr);

        System.out.println("Output: "+ output);
    }

    private static ArrayList<Integer> changeDuplicateToZeroEnd(ArrayList<Integer> arr) {

            Map<Integer,Integer> map = new LinkedHashMap<Integer, Integer>();

            for(int i=0;i<arr.size();i++) {
                if (map.containsKey(arr.get(i))) {
                    arr.set(i, 0);
                }
                map.put(arr.get(i), i);
            }

        arr= moveZeros(arr);

        return arr;

    }

    private static ArrayList<Integer> moveZeros(ArrayList<Integer> nums) {

        for(int i=0;i< nums.size();i++){
            if(nums.get(i)==0){
                nums.add(nums.get(i));
                nums.remove(nums.get(i));
            }
        }

        return nums;
    }


}
