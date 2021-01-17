import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        double total = 0;
        for(int i=1;i<=10;i++){
            System.out.println("enter num"+i+": ");
            total+=sc.nextDouble();
        }
        System.out.println("total= "+ total);
        System.out.println("Average= "+total/10);
    }
}
