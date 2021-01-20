import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mian {
    public static void main(String[] args) {
       List<Integer> nums = new ArrayList<Integer>(Arrays.asList( 1,2,3,0,0,0,0,4,5,6,0,0,0,0,8,9,0,10,-1,-2,-3,-4,-5,-6,-7,-8,-9));
        System.out.println("original list: " + nums);

        for(int i=0;i< nums.size();i++){
            if(nums.get(i)==0){
                nums.add(nums.get(i));
               nums.remove(nums.get(i));
            }
        }

        System.out.println("OUTPUT list: " + nums);
    }
}
