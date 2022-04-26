import java.util.TreeMap;
import java.util.Comparator;

/**
 * The TreeMap class of the Java collections framework provides the tree data structure implementation.
 * 
 * TreeMap --> implement(NavigableMap) --> extends(SortedMap) --> extends(Map)
 * 
 * Elements in TreeMap sorted naturally (ASC)
 * Customize sorting the elements by using Comparator
 */

public class TreeMapDemo {
    public static class CustomComparator implements Comparator<String> {
        @Override
        public int compare(String number1, String number2) {
            int value = number1.compareTo(number2);
            // elements are sorted in reverse order
            if (value > 0) {
                return -1;
            } else if (value < 0) {
                return 1;
            }

            return 0;
        }
    }

    public static void main(String[] args) {
        // Creating TreeMap of even numbers
        TreeMap<String, Integer> numbers = new TreeMap<>();


        /**
         ** Insert elements
         */
        // Using put()
        numbers.put("Two", 2);
        numbers.put("Four", 4);
        numbers.put("Three", 3);
        numbers.put("Five", 5);

        // Using putIfAbsent()
        numbers.putIfAbsent("Six", 6);
        System.out.println("TreeMap of numbers: " + numbers);

        //Creating TreeMap of numbers
        TreeMap<String, Integer> otherNumbers = new TreeMap<>();
        otherNumbers.put("One", 1);

        // Using putAll()
        numbers.putAll(otherNumbers);
        System.out.println("TreeMap of numbers: " + numbers);


        /**
         ** Access elements
         */
        // Using entrySet()
        System.out.println("Key/Value mappings: " + numbers.entrySet());

        // Using keySet()
        System.out.println("Keys: " + numbers.keySet());

        // Using values()
        System.out.println("Values: " + numbers.values());

        // Using get()
        int value1 = numbers.get("Three");
        System.out.println("Using get(): " + value1);

        // Using getOrDefault()
        int value2 = numbers.getOrDefault("Five", 5);
        System.out.println("Using getOrDefault(): " + value2);


        /**
         ** Remove elements
         */
        // remove method with single parameter
        int value = numbers.remove("Two");
        System.out.println("Removed value: " + value);

        // remove method with two parameters
        boolean result = numbers.remove("Three", 3);
        System.out.println("Is the entry {Three=3} removed? " + result);

        System.out.println("Updated TreeMap: " + numbers);


        /**
         ** Replace elements
         */
        // Using replace()
        numbers.replace("Two", 22);
        numbers.replace("Three", 3, 33);
        System.out.println("TreeMap using replace: " + numbers);

        // Using replaceAll()
        numbers.replaceAll((key, oldValue) -> oldValue + 2);
        System.out.println("TreeMap using replaceAll: " + numbers);


        /**
         *! Methods for Navigation
         */
        /**
         ** 1. First and Last Methods
         */
        // Using the firstKey() method
        String firstKey = numbers.firstKey();
        System.out.println("First Key: " + firstKey);

        // Using the lastKey() method
        String lastKey = numbers.lastKey();
        System.out.println("Last Key: " + lastKey);

        // Using firstEntry() method
        System.out.println("First Entry: " + numbers.firstEntry());

        // Using the lastEntry() method
        System.out.println("Last Entry: " + numbers.lastEntry());


        /**
         ** 2. Ceiling, Floor, Higher and Lower Methods
         */
        // Using higher()
        System.out.println("Using higherKey(): " + numbers.higherKey("Four"));
        System.out.println("Using higherEntry(): " + numbers.higherEntry("Four"));

        // Using lower()
        System.out.println("\nUsing lowerKey(): " + numbers.lowerKey("Four"));
        System.out.println("Using lowerEntry(): " + numbers.lowerEntry("Four"));

        // Using ceiling()
        System.out.println("\nUsing ceilingKey(): " + numbers.ceilingKey("Four")); // Returns the lowest key among those keys that are greater than the specified key. If the key passed as an argument is present in the map, it returns that key.
        System.out.println("Using ceilingEntry(): " + numbers.ceilingEntry("Four"));

        // Using floor()
        System.out.println("\nUsing floorKey(): " + numbers.floorKey("Four")); // Returns the greatest key among those keys that are less than the specified key. If the key passed as an argument is present, it returns that key.
        System.out.println("Using floorEntry(): " + numbers.floorEntry("Four"));


        /**
         ** 3. pollFirstEntry() and pollLastEntry() Methods
         */
        // Using the pollFirstEntry() method
        System.out.println("Using pollFirstEntry(): " + numbers.pollFirstEntry());

        // Using the pollLastEntry() method
        System.out.println("Using pollLastEntry(): " + numbers.pollLastEntry());

        System.out.println("Updated TreeMap: " + numbers);


        /**
         ** 4. headMap(), tailMap() and subMap() Methods
         */
        System.out.println("\nUsing headMap() Method:");

        // Using headMap() with default booleanValue
        System.out.println("Without boolean value: " + numbers.headMap("Fourth"));

        // Using headMap() with specified booleanValue
        System.out.println("With boolean value: " + numbers.headMap("Fourth", true));

        // =========
        System.out.println("\nUsing tailMap() Method:");
        // Using tailMap() with default booleanValue
        System.out.println("Without boolean value: " + numbers.tailMap("Second"));

        // Using tailMap() with specified booleanValue
        System.out.println("With boolean value: " + numbers.tailMap("Second", false));


        /**
         *! Sorting the elements in TreeMap
         */
        TreeMap<String, Integer> sortedNumbers = new TreeMap<>(new CustomComparator());

        sortedNumbers.put("First", 1);
        sortedNumbers.put("Fourth", 4);
        sortedNumbers.put("Third", 3);
        sortedNumbers.put("Second", 2);

        System.out.println("Sorted Map: " + sortedNumbers);
    }
}
