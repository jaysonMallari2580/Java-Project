/*
Write a Java program to find the two elements from a given array of positive and negative numbers such that their sum is closest to zero.
 */

import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<Integer>();

        for (int i=-0;i<10;i++){
            System.out.println("Enter a positive or negative number: ");
            arr.add(sc.nextInt());
        }

        findTwoElementsNearZero(arr);
    }

    public static void findTwoElementsNearZero(ArrayList arr){

        int minSum = Integer.parseInt(arr.get(0).toString()) + Integer.parseInt(arr.get(1).toString());
        int i1=0,i2=0;
        int sum =0;

        for(int i=0;i<arr.size() -1;i++){
            for (int j =i+1; j<arr.size();j++){
                sum = Integer.parseInt(arr.get(i).toString()) + Integer.parseInt(arr.get(j).toString());

                if(Math.abs(minSum) > Math.abs(sum)){
                    minSum = sum;
                    i1=i;
                    i2=j;
                }
            }
        }


        Map<Integer,Object> map = new LinkedHashMap<Integer, Object>();
        map.put(i1,arr.get(i1));
        map.put(i2,arr.get(i2));


        System.out.println("The two indexes that sum is closer to zero are : " +  map);
    }
}

