/*
Write a JAVA program that takes out the even from the odds and odd from the list of even numbers,
[Text Wrapping Break]For eg, => {23,25,75,87,47,1,91,51,2} //Output for this case =>2

=> {22,44,64,76,98,12,43,54,90} // Output for this case =>43.
 */

public class Main {
    public static void main(String[] args) {

        int[] arr1 = {23,25,75,87,47,1,91,51,2};
        int[] arr2 = {22,44,64,76,98,12,43,54,90};

        System.out.println("Find the even number {23,25,75,87,47,1,91,51,2} ");
        int even = findEven(arr1);
        System.out.println("Output " + even);

        System.out.println("Find the even number {22,44,64,76,98,12,43,54,90} ");
        int odd = findOdd(arr2);
        System.out.println("Output " + odd);

    }

    private static int findEven(int[] arr1) {
        int out = 0;
        for(int i : arr1){
            if(i%2==0){
               return i;
            }
        }

        return out;
    }

    private static int findOdd(int[] arr1) {
        int out = 1;
        for(int i : arr1){
            if(i%2!=0){
                return i;
            }
        }

        return out;
    }
}
