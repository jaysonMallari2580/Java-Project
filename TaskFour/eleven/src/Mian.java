import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*
Write a Java program to sort an array of positive integers of a given array, in the sorted array the value of the first element should be maximum,
second value should be minimum value, third should be second maximum, fourth second be second minimum and so on.
 */
public class Mian {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<Integer>();

        for(int i=0;i<10;i++){
            System.out.println("Enter num"+i);
            arr.add(sc.nextInt());
        }

        Collections.sort(arr);
        System.out.println("initial list: " +arr);

        sortAlternate(arr);
    }

    private static void sortAlternate(ArrayList<Integer> arr) {

        ArrayList<Integer> arr2 = new ArrayList<Integer>();

        for(int i =0; i<=arr.size()/2 ;i++){

            try {
                arr2.add(arr.get(arr.size() - i));
                arr2.add(arr.get(i-1));
            }catch(IndexOutOfBoundsException e){

            }

        }

        System.out.println("Output list: "+arr2);
    }


}
