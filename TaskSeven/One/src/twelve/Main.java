package twelve;
/*
Program to find all the sub-array whose sum is equal to the given number?
 */

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,-1,-2,-3};
        int sum= 9;
        int[] arr2 = { 3, 4, -7, 1, 3, 3, 1, -4 };
        int sum2 = 7;

        System.out.println("test1");
        findSubArray(arr,sum);
        System.out.println("test2");
        findSubArray(arr2,sum2);
    }

    static void findSubArray(int[] arr, int sum){
        for(int i=0;i<arr.length;i++){

            int newSum = 0;
            for(int j=i;j<arr.length;j++){
                newSum+=arr[j];

                if(newSum==sum){
                    print(arr,i,j);
                }
            }
        }
    }

    static void print(int[] arr, int i , int j){
        System.out.println(IntStream.range(i,j+1)
                            .mapToObj(k-> arr[k])
                            .collect(Collectors.toList()));
    }
}
