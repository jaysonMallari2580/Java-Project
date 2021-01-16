import java.util.Scanner;

public class eight {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("character: ");
        char ch = sc.next().toLowerCase().charAt(0);

        String str = (ch=='r'||ch=='a'||ch=='n'||ch=='d'||ch=='o'||ch=='m')? "FOUND" : "NOT FOUND";

        System.out.println(str);
    }
}
