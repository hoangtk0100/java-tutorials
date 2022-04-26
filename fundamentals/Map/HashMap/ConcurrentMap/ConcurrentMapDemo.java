import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * The ConcurrentMap interface of the Java collections framework provides a thread-safe map. That is, multiple threads can access the map at once without affecting the consistency of entries in a map.
 * 
 * ConcurrentMap is known as a synchronized map.
 * 
 * It extends the Map interface.
 */


public class ConcurrentMapDemo {
    public static void main(String[] args) {
        ConcurrentMap<String, Integer> numbers = new ConcurrentHashMap<>();

        // Insert elements
        numbers.put("Two", 2);
        numbers.put("One", 1);
        numbers.put("Three", 3);

        System.out.println("ConcurrentMap: " + numbers);
        
        // Remove elements
        int removedValue = numbers.remove("Two");
        System.out.println("Removed element: " + removedValue);
        System.out.println("Updated ConcurrentMap: " + numbers);
    }
}
