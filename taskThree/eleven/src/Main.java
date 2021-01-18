import java.util.Scanner;

public class Main{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter two floating numbers: ");
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();

        String output = Math.abs(num1-num2) <= 0.01? "the same" : "not the same";

        System.out.println(output);
    }
}
