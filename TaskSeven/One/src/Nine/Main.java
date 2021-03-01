package Nine;
/*
Find the maximum value in Array without using Collection?
 */

public class Main {
    public static void main(String[] args) {

            int[] arr = {1,10,9,8,6,7,5,3,2,0,-1};

            int max = 0;
            int min =0;

        for(int i: arr){
            max = (max<i)?i:max;
            min = (min>i)?i:min;
        }
        System.out.println("MAX: "+max);
        System.out.println("MIN: "+min);
    }
}
