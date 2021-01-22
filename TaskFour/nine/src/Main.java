/*
Write a Java program to find the sum of the two elements of a given array which is equal to a given integer.

Sample array: [1,2,4,5,6]

Target value: 6.
 */

import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<Integer>();

        for(int i=0;i<=5;i++){
            System.out.println("Enter num"+i+": " );
            arr.add(sc.nextInt());
        }

        System.out.println("Enter the target sum: ");
        int target = sc.nextInt();

        ArrayList<Integer> elementsOutput = getSumElementsOfTarger(arr,target);

        System.out.println("OUTPUT: " +elementsOutput.toString());
    }

    static ArrayList<Integer> getSumElementsOfTarger(ArrayList<Integer> arr, int target){

        Map<Integer, Integer> map = new HashMap<Integer,Integer>();

        int container;

        for(int i=0; i<arr.size();i++){
            container = target-arr.get(i);

            if(map.containsKey(container)){

                System.out.println("Indexes: " + new ArrayList<Integer>(Arrays.asList(map.get(container),i)) );
                return  new ArrayList<Integer>(Arrays.asList(container,arr.get(i)));

            }

            map.put(arr.get(i),i);
        }

        throw new IllegalArgumentException(" no two sum solution.");
    }

}
