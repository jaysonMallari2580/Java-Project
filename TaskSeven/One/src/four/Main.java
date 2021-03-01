package four;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
Program to find if String has all Unique Characters?
 */
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a phrase: ");
        String str = sc.nextLine();

        Set<Character> setChar = new HashSet<Character>();

        for(Character c:  str.toCharArray()){
            setChar.add(c);
        }
        Boolean output = (setChar.size() == str.length() ? true : false);

        System.out.println("Output: " + output);
    }
}
