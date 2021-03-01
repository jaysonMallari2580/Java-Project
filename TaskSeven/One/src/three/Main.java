package three;
/*
Program to find the intersection of two arrays in java?
 */

public class Main {
    public static void main(String[] args) {

        int[] arr1 = { 1,2,3,4,5};
        int[] arr2 = { 6,7,8,9,1,3};

        Intersection intersect = (a1,a2)->{
            for(int i=0;i<a1.length;i++){
                for( int j=0;j<a2.length;j++){
                    if(a1[i] == a2[j]){
                        System.out.println(a2[j]);
                    }
                }
            }
        };
            intersect.printIntersection(arr1,arr2);
    }
}

interface Intersection{
    public void printIntersection(int[] a1, int[] a2);
}