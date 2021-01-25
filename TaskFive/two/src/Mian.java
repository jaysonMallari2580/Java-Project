import java.util.Arrays;

public class Mian {
    public static void main(String[] args) {
        int[] nums = {23,45,12,56,89,11,23,54,88,96,2};

        Arrays.sort(nums);
        System.out.println("Sorted : " + Arrays.toString(nums));

        int sum =0;
        for(int i=0;i<nums.length;i++){
            if(i==0 || i == nums.length -1){
                continue;
            }
            System.out.print(nums[i] + "  + ");
            sum+=nums[i];
        }

        System.out.println("total : "+ sum);
    }
}
