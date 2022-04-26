/**
 * The Java collections framework provides various algorithms that can be used to manipulate elements stored in data structures.
 * 
 * Algorithms in Java are static methods that can be used to perform various operations on collections.
 * Since algorithms can be used on various collections, these are also known as generic algorithms.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Algorithms {
    public static class CustomComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer number1, Integer number2) {
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
        /**
         ** 1. Sorting Using sort() - default: ASC, custom: DESC  
         * 
        */
        // Creating an array list
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements
        numbers.add(4);
        numbers.add(2);
        numbers.add(3);
        System.out.println("Unsorted numbers: " + numbers);

        // Using the sort() method
        Collections.sort(numbers);
        System.out.println("Sorted numbers(ASC): " + numbers);
        
        // Using the sort() and Comparator
        Collections.sort(numbers, new CustomComparator());
        System.out.println("Sorted numbers(DESC): " + numbers);


        /**
         ** 2. Shuffling Using shuffle()
         */
        // Using the shuffle() method
        Collections.shuffle(numbers);
        System.out.println("numbers using shuffle: " + numbers);
        

        /**
         ** 3. Searching Using binarySearch()
         * It returns the position of the element in the specified collections.
         * 
         ** Note: The collection should be sorted before performing the binarySearch() method.
         */
        // Using binarySearch()
        int position = Collections.binarySearch(numbers, 3);
        System.out.println("The position of 3 is " + position);
        

        /**
         ** 4. Routine Data Manipulation
         * 
         * reverse() - reverses the order of elements
         * swap() - swaps the position of two elements in a collection
         * addAll() - adds all the elements of a collection to other collection
         * fill() - replace every element in a collection with the specified value
         * copy() - creates a copy of elements from the specified source to destination
         */
        // Using reverse()
        Collections.reverse(numbers);
        System.out.println("Reversed numbers: " + numbers);
        
        // Using swap()
        Collections.swap(numbers, 1, 2);
        System.out.println("numbers after swap(): " + numbers);
        
        // Using addAll()
        ArrayList<Integer> newNumbers = new ArrayList<>();
        newNumbers.addAll(numbers);
        System.out.println("newNumbers after addAll(): " + newNumbers);
        
        // Using fill()
        Collections.fill(numbers, 0);
        System.out.println("numbers after fill(): " + numbers);
        
        // Using copy()
        Collections.copy(newNumbers, numbers);
        System.out.println("newNumbers after copy(): " + newNumbers);


        /**
         ** 5. Composition
         * frequency() - returns the count of the number of times an element is present in the collection
         * disjoint() - checks if two collections contain some common element
         */
        // Using frequency()
        int count = Collections.frequency(numbers, 2);
        System.out.println("Count of 2: " + count);
        
        // Using disjoint()
        boolean hasNoCommonElement = Collections.disjoint(numbers, newNumbers);
        System.out.println("Two lists are disjoint: " + hasNoCommonElement);


        /**
         ** 6. Finding Extreme Values
         * min() - find the minimum element
         * max() - find the maximum element
         */
        // Change elements
        numbers.set(0, 2);
        numbers.set(1, 4);
        numbers.set(2, 3);
        
        // Using min()
        int min = Collections.min(numbers);
        System.out.println("Minimum Element: " + min);
        
        // Using max()
        int max = Collections.max(numbers);
        System.out.println("Maximum Element: " + max);
    }
}
