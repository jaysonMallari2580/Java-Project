//Write a Java program to find the second smallest element in an array

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,0,9,8,7,5,4,3,33,45,67,100,1,99,-1};

        System.out.println("List of numbers : "+ Arrays.toString(nums));

        int lowest2nd = findtheSecondLowest(nums);

        System.out.println("2nd lowest: " + lowest2nd);
    }

    static int findtheSecondLowest(int[] nums){
        int low2nd =Integer.MAX_VALUE;
        int lowest = Integer.MAX_VALUE;

        for(int num : nums){
            if (num < lowest){
                low2nd = lowest;
                lowest = num;
            }else if(num < low2nd && num != lowest){
                low2nd = num;
            }
        }

        return low2nd;
    }
}
