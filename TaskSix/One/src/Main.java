import java.util.Comparator;
import java.util.Scanner;

/*
Print the sum, difference and product of two complex numbers by creating a class named 'Complex'
with separate methods for each operation whose real and imaginary parts are entered by user.

 */
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter numbers : ");
        int real = sc.nextInt();
        int imaginary = sc.nextInt();

        Complex com = new Complex(real, imaginary);

        com.sum();
        com.difference();
        com.product();
    }

}

class Complex{

    private double real;
    private  double imaginary;

    Complex(double real, double imaginary){
        setReal(real);
        SetImaginary(imaginary);
    }

    public void setReal(double real){
        this.real = real;
    }

    public void SetImaginary(double imaginary){
        this.imaginary = imaginary;
    }

    public double getReal(){
        return real;
    }

    public  double getImaginary(){
        return  imaginary;
    }

    public void sum(){
        System.out.println("Sum : "+ (double) (real+imaginary) );
    }

    public void difference(){
        System.out.println("Difference : "+ (double) (real-imaginary) );
    }

    public void product(){
        System.out.println("Product : "+ (double) (real*imaginary) );
    }
}