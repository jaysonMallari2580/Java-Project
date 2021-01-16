import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int num=0;
        while(num>=0){
            System.out.print("num: ");
            num = sc.nextInt();

            if(num%2 !=0){
                System.out.println("NEW");
            }else{
                if(num>=2 && num <=5){
                    System.out.println("OLD");
                }else if(num>=6 && num <=30){
                    System.out.println("NEW");
                }else{
                    System.out.println("OLD");
                }
            }
        }
    }
}
