import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a natural number: ");
        int num = sc.nextInt();
        int total = 0;

        for(int i=1;i<=num;i++){
            System.out.println(i);
            total+=i;
        }
        System.out.println("total: "+total);
    }
}
