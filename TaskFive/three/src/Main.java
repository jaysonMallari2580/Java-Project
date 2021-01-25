import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter a phrase : ");
        String str =  sc.nextLine();

        System.out.println("Input : "+ str);

        str = str.replaceAll("\\s","");
        System.out.println("Input without space:  "+ str);

    }
}
