import java.util.SortedMap;
import java.util.TreeMap;

import javax.swing.JSpinner.NumberEditor;

/**
 * The SortedMap interface of the Java collections framework provides sorting of keys stored in a map.
 * 
 * It extends Map interface
 */


public class SortedMapDemo {
    public static void main(String[] args) {
        SortedMap<String, Integer> numbers = new TreeMap<>();

        /**
         ** Insert elements
         */
        numbers.put("Two", 2);
        numbers.put("One", 1);
        System.out.println("SortedMap: " + numbers);
        numbers.put("Aaa", 3);
        System.out.println("SortedMap: " + numbers);
        
        /**
         ** Access element
         */
        System.out.println("First key: " + numbers.firstKey());
        System.out.println("Last key: " + numbers.lastKey());

        // returns all the entries of a map whose keys are less than the specified key
        System.out.println("Head map(One): " + numbers.headMap("One"));

        // returns all the entries of a map whose keys are greater than or equal to the specified key
        System.out.println("Tail map(One): " + numbers.tailMap("One"));

        // returns all the entries of a map whose keys lies in between key1 and key2 including key1
        System.out.println("Sub map(One - Two): " + numbers.subMap("One", "Two"));

        
        // Remove element
        int removedValue = numbers.remove("One");
        System.out.println("Removed value: " + removedValue);
    }
}
