import java.util.HashMap;
import java.util.WeakHashMap;

/**
 * The WeakHashMap class of the Java collections framework provides the feature of the hash table data structure
 * 
 ** Note: Keys of the weak hashmap are of the WeakReference type.
 *
 * The object of a weak reference type can be garbage collected in Java if the reference is no longer used in the program.
 * 
 * The key with weak reference (the key to that entry is no longer use) can be removed out of the hashmap by garbage collection
 */

public class WeakHashMapDemo {
    public static void main(String[] args) {
        // initial capacity: optional - default: 16
        // loadFactor: default - 0.75f (whenever hash map is filled by 75%, the entries are moved to a new has table of double the size of the original hash table)
        WeakHashMap<String, Integer> numbers = new WeakHashMap<>();

        String two = new String("Two");
        int twoValue = 2;

        String four = new String("Four");
        int fourValue = 4;

        numbers.put(two, twoValue);
        numbers.put(four, fourValue);
        System.out.println("WeakHashMap: " + numbers);

        // Make the reference null
        two = null;

        // Call garbage collection
        System.gc();
        System.out.println("WeakHashMap after garbage collection: " + numbers);

        /**
         * Create WeakHashMap from other hashmap
         */
        HashMap<String, Integer> evenNumbers = new HashMap<>();
        String six = new String("Six");
        int sixValue = 6;

        evenNumbers.put(six, sixValue);

        numbers = new WeakHashMap<>(evenNumbers);
        System.out.println("WeakHashMap from other hashmap: " + numbers);


        evenNumbers.put("Four", 4);
        System.out.println("Original WeakHashMap: " + evenNumbers);

        // Using putIfAbsent()
        evenNumbers.putIfAbsent("Six", 6);
        System.out.println("Updated WeakHashMap(): " + evenNumbers);

        // Using put()
        numbers.put("One", 1);

        // Using putAll()
        numbers.putAll(evenNumbers);
        System.out.println("New WeakHashMap: " + numbers);


        /**
         * Access elements
         */
        // Using entrySet()
        System.out.println("Key/Value mappings: " + numbers.entrySet());

        // Using keySet()
        System.out.println("Keys: " + numbers.keySet());

        // Using values()
        System.out.println("Values: " + numbers.values());

        // Using get()
        int value1 = numbers.get("Four");
        System.out.println("Returned Number: " + value1);

        // Using getOrDefault()
        int value2 = numbers.getOrDefault("Five", 5);
        System.out.println("Returned Number: " + value2);


        /**
         * Remove elements
         */
        // remove method with single parameter
        int value = numbers.remove("Six");
        System.out.println("Removed value: " + value);

        // remove method with two parameters
        // remove element that has specified key mapped to be the specified value and return a boolean value
        boolean result = numbers.remove("Three", 3);
        System.out.println("Is the entry Three removed? " + result);

        System.out.println("Updated WeakHashMap: " + numbers);
    }
}
