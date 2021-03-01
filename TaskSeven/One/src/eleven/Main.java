package eleven;
/*
Find to sort HashMap in java by keys and values?
 */

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Map<Integer, String> mapRandom = new LinkedHashMap<Integer,String>();
        mapRandom.put(4,"Hello");
        mapRandom.put(7,"world");
        mapRandom.put(5,"sun");
        mapRandom.put(6,"moon");
        mapRandom.put(1,"mars");
        mapRandom.put(2,"new york");

        //sort by Key
        Map<Integer,String> mapSortByKey = new TreeMap<Integer,String>(mapRandom);

        //sort by value
        Map<Integer,String> mapSortByValue = mapRandom.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1,e2)-> e1, LinkedHashMap::new));

        System.out.println("Unsorted "+ mapRandom);
        System.out.println("Sorted by Key " +mapSortByKey);
        System.out.println("Sorted by Value " +mapSortByValue);

    }


}
