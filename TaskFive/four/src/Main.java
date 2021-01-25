import java.util.*;

/*
Write a JAVA method to return a boolean true if the string doesn’t have repeating letters and consecutive or nonconsecutive i.e.
all the letters of the string be unique (isogram) else false.

Write a JAVA program that reverse the words of a sentence.

For eg, => “Be Happy and Stay Motivated” => “eB yppah dna yatS detavitoM”.
 */
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter a phrase: " );
        String str = sc.nextLine();

        boolean isogram = isIsogram(str);

        System.out.println("Output: "+ isogram);
    }

    static boolean isIsogram(String str){
        char[] chars = str.toCharArray();
        boolean iso = true;
        ArrayList strOut =  new ArrayList();

        for(char ch : chars){
            if( strOut.contains(ch)){
                return false;
            }else{
                strOut.add(ch);
            }
        }
        System.out.println(strOut);
        return true;
    }

}
