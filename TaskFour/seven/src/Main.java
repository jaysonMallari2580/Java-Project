import java.util.Arrays;

/*
Write a Java program to get the difference between the largest and smallest values in an array of integers. The length of the array must be 1 and above.
 */
public class Main {
    public static void main(String[] args) {

        int[] arr = {100,99,88,27,2,2,3,3,4,4,4,5,4,3,2,158,456,11,11,11,11,177};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int sum =arr[arr.length -1] - arr[0];
        System.out.println("Sum of max and min : " + sum );
    }
}
