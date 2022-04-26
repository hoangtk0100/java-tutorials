import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Sets cannot contain duplicate elements.
 * 
 * [ EnumSet, HashSet, LinkedHashSet, TreeSet ] implements SET
 * 
 * [ SortedSet, NavigableSet ] extends SET
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

public class SetInterface {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();

        // Add elements
        set1.add(2);
        set1.add(3);
        System.out.println("Set1: " + set1);
        
        Set<Integer> set2 = new HashSet<>();

        // Add elements
        set2.add(1);
        set2.add(2);
        System.out.println("Set2: " + set2);
        
        // Union of 2 sets
        set2.addAll(set1);
        System.out.println("Union: " + set2);
        
        // Intersection
        set2.retainAll(set1);
        System.out.println("Intersection: " + set2);
        
        // Subset
        set2.containsAll(set1);
        System.out.println("Subset: " + set2);
        

        // Access elements
        System.out.print("Iterating");
        Iterator<Integer> iterate = set2.iterator();
        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }
    }
}
