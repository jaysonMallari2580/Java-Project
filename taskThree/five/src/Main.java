import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter a long value");
        long numLong = sc.nextLong();
        System.out.println("Long input: "+numLong );

        int sum =0;
        for(int i=0;i<Long.toString(numLong).length();i++){
            sum+=Integer.parseInt(String.valueOf(i));
        }
        System.out.println("total: "+sum);
    }
}
