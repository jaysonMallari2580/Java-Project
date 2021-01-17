import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {


        try{
            System.out.println("Enter the month number to display the number of days");
            int num = sc.nextInt();
            if(num==0){
                throw new ArrayIndexOutOfBoundsException();
            }
            showDaysOfMonth(num);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Details");
        }
    }

    public static void showDaysOfMonth(int num){
        //jan=31, feb=28,mar=31,apr=30,may=31,june=30
        //jul=31, aug=31,sep=30,oct=31,nov=30dec=31

        int[] numOfDaysByMonth = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        System.out.println(numOfDaysByMonth[num]);
    }
}
