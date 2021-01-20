//Write a Java program to find the second largest element in an array.

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4,101,6,98,98,99,100};

        System.out.println(Arrays.toString(nums));

        int num2nd = numSecondLargest(nums);

        System.out.println("Second largest is: " + num2nd);
    }

    static int numSecondLargest(int[] nums){
        int largest = 0, largest2nd=0;
        for(int num : nums){
            if(num > largest){

                largest2nd = largest;
                largest = num;
            }else if(num > largest2nd && num!= largest){
                largest2nd = num;
            }
        }

        return largest2nd;
    }
}
