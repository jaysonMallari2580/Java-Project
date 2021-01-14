import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        try{
            System.out.println("Enter a number");
            int num = sc.nextInt();

            if((num%3==0)&&(num%5==0)){
                System.out.println("Consultadd JAVA Training");
            }else if(num%3== 0){
                System.out.println("Consultadd");
            }else if(num%5==0) {
                System.out.println("JAVA Training");
            }else{
                System.out.println("Not divisible by 5 or 3.");
            }
        }catch (InputMismatchException e){
            System.out.println("Invalid input. Error: "+e);
        }
    }
}
