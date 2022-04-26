/**
 * The LinkedHashSet class of the Java collections framework provides functionalities of both the hashtable and the linked list data structure.
 * 
 * It implements the Set interface.
 */

/**
 ** Methods of Set
 *
 * The Set interface includes all the methods of the Collection interface. It's because Collection is a super interface of Set.
 * Some of the commonly used methods of the Collection interface that's also available in the Set interface are:
 *
 * add() - adds the specified element to the set
 * addAll() - adds all the elements of the specified collection to the set
 * iterator() - returns an iterator that can be used to access elements of the set sequentially
 * remove() - removes the specified element from the set
 * removeAll() - removes all the elements from the set that is present in another specified set
 * retainAll() - retains all the elements in the set that are also present in another specified set
 * clear() - removes all the elements from the set
 * size() - returns the length (number of elements) of the set
 * toArray() - returns an array containing all the elements of the set
 * contains() - returns true if the set contains the specified element
 * containsAll() - returns true if the set contains all the elements of the specified collection
 * hashCode() - returns a hash code value (address of the element in the set)
 */

/**
 ** Set Operations
 * 
 * The Java Set interface allows us to perform basic mathematical set operations like union, intersection, and subset.
 * 
 * Union - to get the union of two sets x and y, we can use x.addAll(y)
 * Intersection - to get the intersection of two sets x and y, we can use x.retainAll(y)
 * Subset - to check if x is a subset of y, we can use y.containsAll(x)
 */


import java.util.ArrayList;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        ArrayList<Integer> evenNumbers = new ArrayList<>(2, 4);

        // Create from other ArrayList
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>(evenNumbers);

        System.out.println("LinkedHashSet: " + numbers);


       /**
         ** Insert Elements to
         * 
         * add() - inserts specified enum values to the linked hash set
         * addAll() inserts all the elements of the specified collection to the set
         */
        // Using add()
        numbers.add(5);
        System.out.println("Using add(): " + numbers);
        
        // Using addAll()
        LinkedHashSet<Integer> otherNumbers = new LinkedHashSet<>();
        otherNumbers.add(8);
        otherNumbers.add(9);
        
        numbers.addAll(otherNumbers);
        System.out.println("Using addAll(): " + numbers);


        /**
         ** Access Elements
         */
        System.out.println("Iterating:");
        Iterator<Size> iterate = numbers.iterator();
        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }


        /**
         ** Remove Elements
         *
         * remove() - removes the specified element from the linked hash set
         * removeAll() - removes all the elements from the linked hash set
         */
        // Using remove()
        boolean value1 = numbers.remove(5);
        System.out.println("Is 5 removed? " + value1);

        // Using removeAll()
        boolean value2 = sizes.removeAll(numbers);
        System.out.println("Are all elements removed? " + value2);


        /**
         ** Set Operations
         */
        // Union of 2 sets
        numbers.addAll(evenNumbers);
        System.out.println("Union: " + numbers);
        
        // Intersection
        numbers.retainAll(otherNumbers);
        System.out.println("Intersection: " + numbers);
        
        // Subset
        numbers.containsAll(evenNumbers);
        System.out.println("Subset: " + numbers);

        // Difference
        numbers.containsAll(evenNumbers);
        System.out.println("Difference: " + numbers);
    }
}
