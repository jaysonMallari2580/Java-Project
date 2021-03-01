package eight;
/*
Print all permutations of the String
Input: str = “cd”
Output: cd dc

Input: str = “abb”
Output: abb abb bab bba bab bba
 */

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a phrase");
        String str = sc.nextLine();

        permutation("",str);
    }

    static void permutation(String str,String remaining){
        if(remaining.length() == 0){
            System.out.println(str);
        }

        for(int i=0;i<remaining.length();i++){
            String newStr = str + remaining.charAt(i);
            System.out.println(i+ "newStr: " +newStr);

            String newRemaining  = remaining.substring(0,i)+remaining.substring(i+1);
            System.out.println(i+ "newRemaining: " +newRemaining);

            permutation(newStr,newRemaining);
        }
    }
}
