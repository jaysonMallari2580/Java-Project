/*
Program to reverse a string in java
 */
package one;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter a phrase: ");
        String str = sc.nextLine();

        System.out.println("Input: "+ str);

        Reverse strRev = (s)->{
            String output="";
            for(int i = s.length()-1 ; i>=0;i--){
                output+=s.charAt(i);
            }
            return output;
        };
        System.out.println("Output:  "+ strRev.rev(str));
    }
}

interface Reverse{
    public String rev(String str);
}
