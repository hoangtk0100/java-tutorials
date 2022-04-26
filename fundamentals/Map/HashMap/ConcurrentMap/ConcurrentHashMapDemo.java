import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * The ConcurrentMap interface of the Java collections framework provides a thread-safe map. That is, multiple threads can access the map at once without affecting the consistency of entries in a map.
 * 
 * ConcurrentMap is known as a synchronized map.
 * 
 * It extends the Map interface.
 */


public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
        // initial capacity: optional - default: 16
        // loadFactor: default - 0.75f (whenever hash map is filled by 75%, the entries are moved to a new has table of double the size of the original hash table)
        ConcurrentHashMap<String, Integer> evenNumbers = new ConcurrentHashMap<>(); 

        /**
         * Insert elements
         */
        // Using put()
        evenNumbers.put("Two", 2);
        evenNumbers.put("Four", 4);
        System.out.println("Original ConcurrentHashMap: " + evenNumbers);

        // Using putIfAbsent()
        evenNumbers.putIfAbsent("Six", 6);
        System.out.println("Updated ConcurrentHashMap(): " + evenNumbers);

        //Creating ConcurrentHashMap of numbers
        ConcurrentHashMap<String, Integer> numbers = new ConcurrentHashMap<>();
        numbers.put("One", 1);
        numbers.put("Three", 3);

        // Using putAll()
        numbers.putAll(evenNumbers);
        System.out.println("New ConcurrentHashMap: " + numbers);


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
        int value1 = numbers.get("Three");
        System.out.println("Returned Number: " + value1);

        // Using getOrDefault()
        int value2 = numbers.getOrDefault("Five", 5);
        System.out.println("Returned Number: " + value2);


        /**
         * Remove elements
         */
        // remove method with single parameter
        int value = numbers.remove("Two");
        System.out.println("Removed value: " + value);

        // remove method with two parameters
        // remove element that has specified key mapped to be the specified value and return a boolean value
        boolean result = numbers.remove("Three", 3);
        System.out.println("Is the entry Three removed? " + result);

        System.out.println("Updated ConcurrentHashMap: " + numbers);



        /**
         *! Bulk ConcurrentHashMap Operations
         */
        /**
         * Variation of forEach() Method
         *      forEachEntry() - executes the specified function for each entry
         *      forEachKey() - executes the specified function for each key
         *      forEachValue() - executes the specified function for each value
         */
        // forEach() without transformer function
        numbers.forEach(4, (k, v) -> System.out.println("key: " + k + " - value: " + v));
        System.out.println();

        // forEach() with transformer function
        numbers.forEach(4, (k, v) -> v, (v) -> System.out.print(v + ", "));

        /**
         ** Search
         * 
         * parallelismThreshold - It specifies that after how many elements operations in a map are executed in parallel.
         * transformer - This will transform the data before the data is passed to the specified function.
         * 
         * Variants of search() Method
         *      searchEntries() - search function is applied to key/value mappings
         *      searchKeys() - search function is only applied to the keys
         *      searchValues() - search function is only applied to the values
         */
        // String key = numbers.search(parallelismThreshold, searchFunction);
        String key = numbers.search(4, (k, v) -> { return v == 3 ? k : null;});
        System.out.println("Searched key: " + key);


        /**
         ** Reduce
         * method accumulates (gather together) each entry in a map. This can be used when we need all the entries to perform a common task, like adding all the values of a map.
         * 
         * parallelismThreshold - It specifies that after how many elements operations in a map are executed in parallel.
         * transformer - This will transform the data before the data is passed to the specified function.
         * 
         * Variants of reduce() Method
         *      reduceEntries() - returns the result of gathering all the entries using the specified reducer function
         *      reduceKeys() - returns the result of gathering all the keys using the specified reducer function
         *      reduceValues() - returns the result of gathering all the values using the specified reducer function
         */
        int sum = numbers.reduce(4, (k, v) -> v, (v1, v2) -> v1 + v2);
        // 4 is a parallel threshold
        // (k, v) -> v is a transformer function. It transfers the key/value mappings into values only.
        // (v1, v2) -> v1+v2 is a reducer function. It gathers together all the values and adds all values.
        System.out.println("Sum of all element values: " + sum);
    }
}
