package ten;
/*
Find all possible combinations of String? (using recursion)
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("enter a phrase: ");
        String str = sc.nextLine();

        premutation("", str);


    }

    static void premutation(String s, String r){
        String out = " ";
        if(r.length() == 0){
            System.out.println(s);
        }

        for( int i=0;i<r.length();i++){
            String newS = s + r.charAt(i);
            String newR = r.substring(0,i)+r.substring(i+1);

            premutation(newS,newR);
        }


    }

}
