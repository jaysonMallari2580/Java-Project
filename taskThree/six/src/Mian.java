import java.util.Scanner;

public class Mian {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter 3 numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if(num3>num2 && num2>num1){
            System.out.println("INCREASING");
        }else if(num1>num2 && num2>num3){
            System.out.println("DECREASING");
        }else{
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
