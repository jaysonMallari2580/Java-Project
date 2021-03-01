package five;
/*
Program to Count the number of words in the String?
 */

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {


        System.out.println("enter a phrase: ");
        String str =  sc.nextLine();

        String[] arr = str.split(" ");
       int count =(str.isEmpty()||str.length()==0)? 0 : arr.length;
        System.out.println("Count: "+count);

    }
}
