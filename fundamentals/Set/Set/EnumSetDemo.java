/**
 ** The EnumSet class of the Java collections framework provides a set implementation of elements of a single enum.
 *
 * EnumSet -> implements Set -> extends Collection
 * 
 * Unlike other set implementations, the enum set does not have public constructors. We must use the predefined methods to create an enum set.
 */
import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetDemo {
    enum Size {
        SMALL, MEDIUM, LARGE, EXTRA_LARGE,
    }
    public static void main(String[] args) {
        /**
         ** Create EnumSet
         */
        // Using allOf() - full EnumSet of Size elements
        EnumSet<Size> sizes = EnumSet.allOf(Size.class);
        System.out.println("EnumSet: " + sizes);
        
        // Using noneOf() - An empty EnumSet
        EnumSet<Size> emptySizes = EnumSet.noneOf(Size.class);
        System.out.println("Empty EnumSet: " + emptySizes);

        // Using range(e1, e2) - Contains range elements
        EnumSet<Size> rangeSizes = EnumSet.range(Size.MEDIUM, Size.EXTRA_LARGE);
        System.out.println("Range EnumSet: " + rangeSizes);
        
        // Using of(e1, e2) - Contains the specified elements
        EnumSet<Size> specifiedSizes = EnumSet.of(Size.SMALL, Size.LARGE);
        System.out.println("Specified EnumSet: " + specifiedSizes);


        /**
         ** Insert Elements to EnumSet
         * 
         * add() - inserts specified enum values to the enum set
         * addAll() inserts all the elements of the specified collection to the set
         */
        // Using add()
        emptySizes.add(Size.SMALL);
        System.out.println("Using add(): " + emptySizes);
        
        // Using addAll()
        emptySizes.addAll(sizes);
        System.out.println("Using addAll(): " + emptySizes);


        /**
         ** Access EnumSet Elements
         */
        System.out.println("Iterating:");
        Iterator<Size> iterate = sizes.iterator();
        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }


        /**
         ** Remove EnumSet Elements
         *
         * remove() - removes the specified element from the enum set
         * removeAll() - removes all the elements from the enum set
         */
        // Using remove()
        boolean value1 = sizes.remove(Size.MEDIUM);
        System.out.println("Is MEDIUM removed? " + value1);

        // Using removeAll()
        boolean value2 = sizes.removeAll(sizes);
        System.out.println("Are all elements removed? " + value2);
    }
}
