import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Choose from the following option " +
                "\n1 - Addition  " +
                "\n2 - Subtraction   " +
                "\n3 - Division  " +
                "\n4 - Multiplication  " +
                "\n5 - Average");
        int operator = sc.nextInt();

        System.out.println("Enter two numbers");
        int first = sc.nextInt();
        int second = sc.nextInt();

        int total = calculate(first,second,operator);

        String output = (total < 0) ? "Oops option X(1/2/3/4/5/) is returning the negative number" : Integer.toString(total);

        System.out.println(output);
    }

    public static int calculate(int num1, int num2, int opt){
        int total = 0;

        switch(opt){
            case 1:
                total=num1+num2;
                break;
            case 2:
                total=num1-num2;
                break;
            case 3:
                total =num1 / num2;
                break;
            case 4:
                total=num1*num2;
                break;
            case 5:
                total = (num1+num2)/2;
        }

        return total;
    }
}
