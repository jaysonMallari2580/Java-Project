// Java program for Pascal's Triangle
// A O(n^2) time and O(1) extra
// space method for Pascal's Triangle

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input number of rows: ");
        int rows = sc.nextInt();

        pascalTriangle(rows);
    }

    static void pascalTriangle(int rows){
        for(int line=1;line<=rows;line++){

            //the first and last value in line is always 1
            int c=1;//used to represent c(line,i)
            for(int i=1;i<=line;i++){
                System.out.print(c+ " ");
                c= c *(line-i)/i;
            }
            System.out.println();
        }
    }

}
