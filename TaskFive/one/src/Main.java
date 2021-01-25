import java.util.ArrayList;
import java.util.Scanner;

/*
Write a JAVA program that takes given String of words and return the length of the shortest word.
 */
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<String>();

        for(int i=0; i<= 5;i++){
            System.out.println("Enter a word: ");
            words.add(sc.nextLine());
        }

        shortWord(words);

    }

    private static void shortWord(ArrayList<String> words) {
        int counter = Integer.MAX_VALUE;
        int index = 0;

        for(int i=0;i<words.size();i++){
            if (words.get(i).length() < counter){
                counter=words.get(i).length();
                index=i;
            }
        }
        System.out.println("The shortest word is: "+ words.get(index));
        System.out.println(words instanceof Object );
    }
}
