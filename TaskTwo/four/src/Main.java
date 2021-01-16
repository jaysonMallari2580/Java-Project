import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        int num = 0;

        while(num >= 0){
            System.out.print("Enter a number: ");
            num = sc.nextInt();

            if(num < 0){
                System.out.println("It's Over");
                break;
            }else{
                System.out.println("Good Going");
                continue;
            }
        }
    }
}
