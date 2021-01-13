import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){

      try{
          System.out.println("Enter two numbers in between 1-10: ");
          int inputOne = sc.nextInt();
          int inputTwo = sc.nextInt();

          if((inputOne < 1 || inputOne >10) ||(inputTwo <1 || inputTwo > 10)){
              throw new InputMismatchException("Invalid Input");
          }

          System.out.println("Inputs "+ inputOne +" " + inputTwo);

          addtwoNumUsingZ(inputOne,inputOne);
      }catch (Exception e){
          System.out.println("Invalid input! Error: "+ e);
      }
    }

    public static void addtwoNumUsingZ(int num1,int num2){
        int z=0;
        z= num1+num2;
        z+=30;

        System.out.println("Output: "+ z);
    }
}
