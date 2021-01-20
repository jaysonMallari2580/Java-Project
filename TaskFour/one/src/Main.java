import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList list = new ArrayList(Arrays.asList(1,2,3,4,1,3,2,4,5,6,7,8,9,0,0,8,6,5,4,3,2));

        System.out.println("List of elements with duplicate: " + list);

       Set set = removeDuplicate(list);

        System.out.println("List of elements withOUT duplicate: " +set);

    }

    static Set removeDuplicate(ArrayList list){

        LinkedHashSet set = new LinkedHashSet<>();

        // set cannot have any duplicate
         set.addAll(list);

         return set;

    }
}
