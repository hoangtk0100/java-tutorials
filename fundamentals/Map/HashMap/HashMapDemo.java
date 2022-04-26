import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> languages = new HashMap<>();

        // Add elements
        languages.put(1, "Java");
        languages.put(2, "Python");
        languages.put(3, "JavaScript");
        System.out.println("Original HashMap: " + languages);

        // Get element
        System.out.println("Value with key(2): " + languages.get(2));
        // System.out.println("Value with key(5) - getOrDefault: " +
        // languages.getOrDefault(2, 10));

        // Get keys
        System.out.println("Keys: " + languages.keySet());

        // Get values
        System.out.println("Values: " + languages.values());

        // Get key/ value pairs
        System.out.println("Pairs: " + languages.entrySet());

        // Change element value
        languages.replace(2, "C++");
        System.out.println("HashMap using replace(k, v): " + languages);

        languages.replace(2, "C+++", "Python");
        System.out.println("HashMap using replace(k, ov, nv) != ov: " + languages);

        languages.replace(2, "C++", "Python");
        System.out.println("HashMap using replace(k, ov, nv) == ov: " + languages);

        // Remove element
        String removedValue = languages.remove(1);
        System.out.println("Removed element: " + removedValue);
        System.out.println("HashMap(remove 1): " + languages);


        // iterate through keys only
        System.out.print("Keys: ");
        for (Integer key : languages.keySet()) {
            System.out.print(key);
            System.out.print(", ");
        }

        // iterate through values only
        System.out.print("\nValues: ");
        for (String value : languages.values()) {
            System.out.print(value);
            System.out.print(", ");
        }

        // iterate through key/value entries
        System.out.print("\nEntries: ");
        for (Entry<Integer, String> entry : languages.entrySet()) {
            System.out.print(entry);
            System.out.print(", ");
        }
    }
}
