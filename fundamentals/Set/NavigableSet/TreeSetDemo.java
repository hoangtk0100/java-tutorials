/**
 * The TreeSet class of the Java collections framework provides the functionality of a tree data structure.
 * 
 * It extends the NavigableSet interface.
 */

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static class CustomComparator implements Comparator<String> {
        @Override
        public int compare(String name1, String name2) {
            int value = name1.compareTo(name2);

            // Elements are sorted in reverse order
            if (value > 0) {
                return -1;
            } else if (value < 0) {
                return 1;
            }

            return 0;
        }
    }
    
    public static void main(String[] args) {
        // TreeSet default sorting by ASC
        TreeSet<Integer> evenNumbers = new TreeSet<>();
        
        /**
         ** Insert elements
         */
        // Using add()
        evenNumbers.add(2);
        evenNumbers.add(4);
        evenNumbers.add(6);
        System.out.println("TreeSet of evenNumbers: " + evenNumbers);
        
        // Using addAll()
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.addAll(evenNumbers);
        numbers.add(5);
        System.out.println("TreeSet of numbers: " + numbers);
        System.out.println();
        
        /**
         ** Access elements
         */
        Iterator<Integer> iterate = numbers.iterator();
        System.out.println("Iterating: ");
        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }
        System.out.println();
        
        
        /**
         ** Remove elements
         */
        // Using remove()
        boolean isRemoved = numbers.remove(5);
        System.out.println("Is 5 removed " + isRemoved);
        
        // Using removeAll()
        boolean isRemovedAll = numbers.removeAll(numbers);
        System.out.println("Are all elements removed: " + isRemovedAll);
        System.out.println("TreeSet of numbers: " + numbers);
        System.out.println();
        
        
        /**
         ** Set Operations
         * 
         * The Java Set interface allows us to perform basic mathematical set operations like union, intersection, and subset.
         * 
         * Union - to get the union of two sets x and y, we can use x.addAll(y)
         * Intersection - to get the intersection of two sets x and y, we can use x.retainAll(y)
         * Subset - to check if x is a subset of y, we can use y.containsAll(x)
         */
        TreeSet<Integer> set1 = new TreeSet<>();
        set1.add(2);
        set1.add(4);
        System.out.println("TreeSet1: " + set1);
        
        TreeSet<Integer> set2 = new TreeSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        System.out.println("TreeSet2: " + set2);
        
        // Union of 2 sets
        set2.addAll(set1);
        System.out.println("Union: " + set2);
        
        // Intersection
        set2.retainAll(set1);
        System.out.println("Intersection: " + set2);
        
        // Subset
        set2.containsAll(set1);
        System.out.println("Subset: " + set2);
        
        // Difference
        set2.removeAll(set1);
        System.out.println("Difference: " + set2);
        System.out.println();

        /**
         *! Methods for Navigation
         */
        /**
         ** 1. first() and last() Methods
         */
        numbers.addAll(evenNumbers);
        numbers.add(5);
        numbers.add(7);

        // Using the first() method
        int first = numbers.first();
        System.out.println("First Number: " + first);

        // Using the last() method
        int last = numbers.last();
        System.out.println("Last Number: " + last);
        System.out.println();


        /**
         ** 2. ceiling(), floor(), higher() and lower() Methods
         * 
         * higher(element) - Returns the lowest element among those elements that are greater than the specified element.
         * lower(element) - Returns the greatest element among those elements that are less than the specified element.
         * ceiling(element) - Returns the lowest element among those elements that are greater than the specified element. If the element passed exists in a tree set, it returns the element passed as an argument.
         * floor(element) - Returns the greatest element among those elements that are less than the specified element. If the element passed exists in a tree set, it returns the element passed as an argument.
         */
        // Using higher()
        System.out.println("Using higher: " + numbers.higher(4));

        // Using lower()
        System.out.println("Using lower: " + numbers.lower(4));

        // Using ceiling()
        System.out.println("Using ceiling: " + numbers.ceiling(4));

        // Using floor()
        System.out.println("Using floor: " + numbers.floor(3));
        System.out.println();


        /**
         ** 3. pollFirst() and pollLast() Methods

         * pollFirst() - returns and removes the first element from the set
         * pollLast() - returns and removes the last element from the set
         */
        // Using pollFirst()
        System.out.println("Removed First Element: " + numbers.pollFirst());

        // Using pollLast()
        System.out.println("Removed Last Element: " + numbers.pollLast());

        System.out.println("TreeSet of numbers: " + numbers);
        System.out.println();


        /**
         ** 4. headSet(), tailSet() and subSet() Methods
         *
         ** booleanValue: default - false
         *      false: not including the specified element Which is pass to method
         *      true: including the specified element Which is pass to method
         * 
         * headSet(element, booleanValue : true) - returns all the elements of the set before the specified element
         * tailSet(element, booleanValue : false) - returns all the elements of the set after the specified element including the specified element
         * subSet(element1, booleanValue1 : true, element2, booleanValue2 : false) - returns all the elements between the element1 and element2 including element1
         */
        // Using headSet()
        System.out.println("Using headSet() without booleanValue (5): " + numbers.headSet(5));
        System.out.println("Using headSet() with booleanValue (5, true): " + numbers.headSet(5, true));
        
        // Using tailSet()
        System.out.println("Using tailSet() without booleanValue (5): " + numbers.tailSet(5));
        System.out.println("Using tailSet() with booleanValue (5, false): " + numbers.tailSet(5, false));
        
        // Using subSet()
        System.out.println("Using subSet() without booleanValue (4, 6): " + numbers.subSet(4, 6));
        System.out.println("Using subSet() with booleanValue (4, false, 6, true): " + numbers.subSet(4, false, 6, true));
        System.out.println();


        /**
         ** Other Methods of TreeSet
         * Method	    Description
         * clone()	    Creates a copy of the TreeSet
         * contains()	Searches the TreeSet for the specified element and returns a boolean result
         * isEmpty()	Checks if the TreeSet is empty
         * size()	    Returns the size of the TreeSet
         * clear()	    Removes all the elements from the TreeSet
         */


        /**
         *! Sorting the elements in TreeSet
         */
        TreeSet<String> sortedAnimals = new TreeSet<>(new CustomComparator());

        sortedAnimals.add("Dog");
        sortedAnimals.add("Zebra");
        sortedAnimals.add("Cat");
        sortedAnimals.add("Horse");

        System.out.println("Sorted TreeSet(DESC):" + sortedAnimals);
    }
}
