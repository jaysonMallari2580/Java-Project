import javax.security.auth.Destroyable;
import java.time.Month;
import java.time.Year;
import java.util.Scanner;

public class Mian {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Input a month number: ");
        int month = sc.nextInt();

        System.out.println("Input a year: ");
        int year = sc.nextInt();

        getDays(month,year);
    }

    public static void getDays(int month,int year){
        Month month1 = Month.of(month);
        Year year1 = Year.of(year);

        boolean isLeap = year1.isLeap();

        if(month==2 && isLeap){
            System.out.println(month1 +" "+year + " has " + month1.length(isLeap)+ " days");
        }else{
            System.out.println(month1 + " "+year + " has "+ month1.length(isLeap)+ " days");
        }
    }
}
