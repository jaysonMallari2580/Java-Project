/*
Program to find the first non-repeated character in the String
 */
package two;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;

public class Mian {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter a phrase: ");
        String str = sc.nextLine();

       FirstNonRepeat fnr = (s)->{
           Map<Character, Integer> mapCounts = new LinkedHashMap<Character, Integer>();

           for(char c : s.toCharArray()){
               mapCounts.put(c, mapCounts.containsKey(c)? mapCounts.get(c)+1:0);
           }

           for(Map.Entry<Character,Integer> entry : mapCounts.entrySet()){
               if(entry.getValue() == 0){
                   return entry.getKey();
               }
           }
           throw new RuntimeException("didn't find any non repeated character");
       };
        System.out.println("The first non repeated character is : "+ fnr.nonRepeat(str));
    }

}

interface FirstNonRepeat{
    public Character nonRepeat(String s);
}
