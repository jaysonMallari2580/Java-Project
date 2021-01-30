import java.util.ArrayList;
import java.util.function.Consumer;

public class Mian {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(5);

        Consumer<Integer> method1 = (n) -> System.out.println(n);
        nums.forEach(method1);

        nums.forEach ( (n) -> System.out.println(n));
    }
}
