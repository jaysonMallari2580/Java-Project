package Seven;
/*
Program to Count occurrences of each character in a string in java?
 */

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a phrase: ");
        String str = sc.nextLine();

        Map<Character,Integer> countChar = new LinkedHashMap<>();

        for(char c : str.toCharArray()){
            countChar.put(c, countChar.containsKey(c)? countChar.get(c)+1:1);
        }
        System.out.println(countChar);
    }
}
