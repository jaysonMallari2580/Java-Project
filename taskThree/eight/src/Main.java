import java.time.Year;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a year: ");
        int year = sc.nextInt();

        Year year1 = Year.of(year);

        String str = year1.isLeap()? "Leap Year" : "NOT Leap Year";

        System.out.println(str);

    }
}
