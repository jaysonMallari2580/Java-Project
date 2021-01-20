//Write a Java program to add two matrices of the same size

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] n1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] n2 = {{9,8,7},{6,5,4},{3,2,1}};
        int[][] sum = new int[n1.length][n1[0].length];

        for(int i=0;i<n1.length;i++){
            for(int j=0;j<n1[i].length;j++){
                sum[i][j] = n1[i][j] + n2[i][j];

            }
        }

        for(int[] nums : sum){
            System.out.println(Arrays.toString(nums));
        }

    }
}
