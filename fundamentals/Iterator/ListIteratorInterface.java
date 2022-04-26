/**
 * The ListIterator interface of the Java collections framework provides the functionality to access elements of a list.
 * 
 * It is bidirectional. This means it allows us to iterate elements of a list in both the direction.
 * 
 * It extends the Iterator interface.
 * 
 * The List interface provides a listIterator() method that returns an instance of the ListIterator interface.
 * 
 ** Methods of ListIterator
 * The ListIterator interface provides methods that can be used to perform various operations on the elements of a list.
 * 
 *      hasNext() - returns true if there exists an element in the list
 *      next() - returns the next element of the list
 *      nextIndex() returns the index of the element that the next() method will return
 *      previous() - returns the previous element of the list
 *      previousIndex() - returns the index of the element that the previous() method will return
 *      remove() - removes the element returned by either next() or previous()
 *      set() - replaces the element returned by either next() or previous() with the specified element
 */

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorInterface {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println("ArrayList: " + numbers);

        // Create an instance of ListIterator
        ListIterator<Integer> iterator = numbers.listIterator();

        // Using next()
        int number1 = iterator.next();
        System.out.println("Next Element: " + number1);

        // Using nextIndex()
        int index1 = iterator.nextIndex();
        System.out.println("Position of Next Element: " + index1);
        
        // Using hashNext()
        System.out.println("Is there any next element? " + iterator.hasNext());        

        // Using previous()
        int previous = iterator.previous();
        System.out.println("Previous Element: " + previous);

        // Using previousIndex()
        int previousIndex = iterator.previousIndex();
        System.out.println("Position of Previous Element: " + previousIndex);
    }
}
