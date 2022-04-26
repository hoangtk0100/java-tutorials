import java.util.EnumMap;

/**
 * The EnumMap class of the Java collections framework provides a map implementation for elements of an enum.
 * 
 * Enum elements are the keys
 */


public class EnumMapDemo {
    enum Size {
        SMALL,
        MEDIUM,
        LARGE,
        EXTRA_LARGE,
    }

    public static void main(String[] args) {
        EnumMap<Size, Integer> sizes = new EnumMap<>(Size.class);

        /**
         ** Insert elements
         */
        // Use put()
        sizes.put(Size.SMALL, 1);
        sizes.put(Size.MEDIUM, 2);
        System.out.println("Size1: " + sizes);
        
        // Use putAll()
        EnumMap<Size, Integer> size2 = new EnumMap<>(Size.class);
        size2.putAll(sizes);
        size2.put(Size.LARGE, 3);
        System.out.println("Size2: " + size2);


        /**
         ** Access elements
         */
        // Using the entrySet() Method
        System.out.println("Key/Value mappings: " + sizes.entrySet());

        // Using the keySet() Method
        System.out.println("Keys: " + sizes.keySet());

        // Using the values() Method
        System.out.println("Values: " + sizes.values());
        
        // Using the get() Method
        System.out.println("Get(SMALL): " + sizes.get(Size.SMALL));


        /**
         ** Remove element
         */
        // Using the remove() Method
        int value = sizes.remove(Size.MEDIUM);
        System.out.println("Removed Value: " + value);

        boolean result = sizes.remove(Size.SMALL, 28);
        System.out.println("Is the entry {SMALL=28} removed? " + result);

        System.out.println("Updated EnumMap: " + sizes);


        /**
         ** Replace elements
         */
        // Using the replace() Method
        sizes.replace(Size.MEDIUM, 30);
        sizes.replace(Size.LARGE, 36, 34);
        System.out.println("EnumMap using replace(): " + sizes);

        // Using the replaceAll() Method
        sizes.replaceAll((key, oldValue) -> oldValue + 3); // using lambda expression
        System.out.println("EnumMap using replaceAll(): " + sizes);

        
    }
}
