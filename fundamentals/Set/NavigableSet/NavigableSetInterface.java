/**
 * The NavigableSet interface of the Java Collections framework provides the features to navigate among the set elements.
 * 
 * It is considered as a type of SortedSet.
 * 
 * * TreeSet -> implement SortedSet -> extends Set -> extends Collection
 * 
 ** booleanValue: default - False
 *      False: not including the specified element Which is pass to method
 *      True: including the specified element Which is pass to method
 * 
 * headSet(element, booleanValue) - returns all the elements of the set before the specified element
 * tailSet(element, booleanValue) - returns all the elements of the set after the specified element including the specified element
 * subSet(element1, booleanValue1, element2, booleanValue2) - returns all the elements between the element1 and element2 including element1
 * 
 ** Methods for Navigation
 * The NavigableSet provides various methods that can be used to navigate over its elements.
 * 
 * descendingSet() - reverses the order of elements in a set
 * descendingIterator() - returns an iterator that can be used to iterate over a set in reverse order
 * ceiling() - returns the lowest element among those elements that are greater than or equal to the specified element
 * floor() - returns the greatest element among those elements that are less than or equal to the specified element
 * higher() - returns the lowest element among those elements that are greater than the specified element
 * lower() - returns the greatest element among those elements that are less than the specified element
 * pollFirst() - returns and removes the first element from the set
 * pollLast() - returns and removes the last element from the set
 */
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetInterface {
    public static void main(String[] args) {
        // Creating NavigableSet using the TreeSet
        NavigableSet<Integer> numbers = new TreeSet<>();

        // Insert elements to the set
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("NavigableSet: " + numbers);

        // Access the first element
        int firstElement = numbers.first();
        System.out.println("First Number: " + firstElement);

        // Access the last element
        int lastElement = numbers.last();
        System.out.println("Last Element: " + lastElement);

        // Remove the first element
        int number1 = numbers.pollFirst();
        System.out.println("Removed First Element: " + number1);

        // Remove the last element
        int number2 = numbers.pollLast();
        System.out.println("Removed Last Element: " + number2);
    }
}
