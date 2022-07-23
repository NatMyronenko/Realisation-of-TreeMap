package Tree3;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class Main {


    public static void main(String[] args) {
        //create a TreeMap
     TreeMap<Integer, String> days = TreeMap<>();

        //put Key/Value to treemap
        days.put(1, "Monday");
        days.put(2, "Tuesday");
        days.put(3, "Wednesday");
        days.put(4, "Thersday");
        days.put(5, "Friday");
        days.put(6, "Saturday");
        days.put(7, "Sunday");

        //get records
       // Entry<Integer, String> monday = days.ceilingEntry(1);
       // System.out.println("1 recording: " + monday.getKey() + " " + monday.getValue());
       // Entry<Integer, String> tuesday = days.floorEntry(2);
       // System.out.println("2 recording " + tuesday.getKey() + " " + tuesday.getValue());

        //get key
        System.out.println("first key " + days.firstKey());
        System.out.println("floor key " + days.floorKey(2));
        System.out.println("ceiling key " + days.containsKey(3));
        System.out.println("higher key " + days.higherEntry(7));
        System.out.println("Lower key " + days.lowerKey(1));
        System.out.println("last key " + days.lastKey());

        //add to TreeMap
        System.out.println("Poll first day of week: " + days.pollFirstEntry());
        System.out.println("poll last day of week: " + days.pollLastEntry());

        //delete from TreeMap
        // System.out.println("remove key 3 " + days.remove(3));
        // System.out.println("remove entry 4 " + days.remove(4, "Thersday"));
        // System.out.println("now week is " + days);

        //chekin and getting key/value
        System.out.println("kontains key " + days.containsKey(5));
        System.out.println("konyains value " + days.containsValue(4));
        System.out.println("get " + days.get(3));
        System.out.println("get of default " + days.getOrDefault(3, "test"));
        System.out.println("values " + days.values());
        System.out.println(" ");

        //descending sort (сортировка по убыванию)
        System.out.println(days.descendingKeySet());
        System.out.println(days.descendingMap());

        //iteration
        System.out.println("iterator using Entry set ");
        for (Map.Entry<Integer, String> d : days.entrySet())
            System.out.println(d.getKey() + d.getValue());

        System.out.println("Iterator using keySet");
        for (Integer i : days.keySet())
            System.out.println(i + " " + days.get(i));

        System.out.println("Iterator trough NavigableKeySet " + days.navigableKeySet());

        //replace values
        days.replace(5, "Monday");
        days.replace(2, "Tuesday");
        System.out.println("values after replace method\n " + days);

        //exemple methods headMap, subMap and tailMap Java TreeMap
        System.out.println("Output of headMap method:");
        System.out.println(days.headMap(3));
        System.out.println(days.headMap(3, true));
        System.out.println(days.headMap(3, false));

        System.out.println("Output of tailMap method: ");
        System.out.println(days.tailMap(3));
        System.out.println(days.tailMap(3, true));
        System.out.println(days.tailMap(3, false));

        System.out.println("Output of subMap method: ");
        System.out.println(days.subMap(2, 4));
        System.out.println(days.subMap(2, true, 4, true));
        System.out.println(days.subMap(2, false, 4, false));
        System.out.println(days.subMap(2, false, 4, true));
        System.out.println(days.subMap(2, true, 4, false));

        for (int i = 0; i < days.size(); i++) {
            System.out.println("Output values: " + days.get(i));
        }

    }

}


