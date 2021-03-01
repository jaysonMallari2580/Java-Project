package six;
/*
Program to check the number is Armstrong number?
153 = (1*1*1)+(5*5*5)+(3*3*3)
where:
(1*1*1)=1
(5*5*5)=125
(3*3*3)=27
So:
1+125+27=153
 */

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a integer: ");
        int num = sc.nextInt();

        int temp = num;
        int count = 0;
        int a;

        while(num>0){
            a=num%10;
            count+=(a*a*a);
            num/=10;
        }

        String output = (temp == count)? "Armstrong number":"NOT";
        System.out.println("Output: "+ output);

    }
}
