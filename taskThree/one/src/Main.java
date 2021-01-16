import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        for(int i=0;i<=10;i++){
            System.out.println(i + " x "+num+ " = "+i*num);
        }

    }
}
