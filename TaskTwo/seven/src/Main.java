import java.util.Map;
import java.util.Scanner;
public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Float: ");
        float flt= sc.nextFloat();

        if(flt == 0){
            System.out.println("zero");
        }else if(flt <0){
            System.out.println("negative");
            System.out.println("small");
        }else{
            System.out.println("positive");
            if(flt>1000000){
                System.out.println("large");
            }
        }

    }
}
