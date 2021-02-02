/*
Program to reverse a string in java
 */

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    private static Scanner sc = new Scanner((System.in));
    public static void main(String[] args) {

        System.out.println("Enter a phrase: ");
        String str = sc.nextLine();

        StringReverse reverse = (str1) ->{
            String result="";
                    for(int i=str.length()-1;i>=0;i--){
                        result += str.charAt(i);
                    }
            return result;
        };

        System.out.println("Rev1: " + reverse.rev(str));


        Stream.of(str).map(str1 -> new StringBuilder(str1).reverse()).forEach(System.out::print);
    }
}

interface StringReverse{
    String rev(String n);
}
