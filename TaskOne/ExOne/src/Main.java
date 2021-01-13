import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){

        System.out.println("Please enter two numbers: ");
        int var1 = sc.nextInt();
        int var2 = sc.nextInt();

        System.out.println("Before swap: " + var1 + " " +var2);

        swapWithThirdVar(var1,var2);
        swapWithXOr(var1,var2);
    }

    public static void swapWithThirdVar( int var1, int var2){
        int var3 = var1;
        var1= var2;
        var2= var3;

        System.out.println("Value swapped using 3rd variable: "+var1 +" "+var2);
    }

    public static void swapWithXOr( int var1, int var2){
        var1 = var1^var2;
        var2 = var1^var2;
        var1 = var1^var2;

        System.out.println("Value swapped using XOR: "+var1 +" "+var2);
    }
}
