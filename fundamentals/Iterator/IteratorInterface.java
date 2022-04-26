/**
 * The Iterator interface of the Java collections framework allows us to access elements of a collection. It has a subinterface ListIterator.
 * 
 * All the Java collections include an iterator() method. This method returns an instance of iterator used to iterate over elements of collections.
 * 
 * 
 ** Methods of Iterator
 * The Iterator interface provides 4 methods that can be used to perform various operations on elements of collections.
 * 
 *       hasNext() - returns true if there exists an element in the collection
 *       next() - returns the next element of the collection
 *       remove() - removes the last element returned by the next()
 *       forEachRemaining() - performs the specified action for each remaining element of the collection
 */

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorInterface {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("ArrayList: " + numbers);

        // Creating an instance of Iterator
        Iterator<Integer> iterate = numbers.iterator();

        // Using the next()
        int number = iterate.next();
        System.out.println("Accessed Element: " + number);

        // Using the remove()
        iterate.remove();
        System.out.println("Removed Element: " + number);

        System.out.print("Updated ArrayList: ");

        // Using the hasNext()
        while(iterate.hasNext()) {
            // Using the forEachRemaining()
            iterate.forEachRemaining((value) -> System.out.print(value + ", "));
            // (value) -> System.out.print(value + ", ")) - lambda expression as an argument
        }
    }
}
