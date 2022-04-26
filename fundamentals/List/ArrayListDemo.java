import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Comparator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>(1);

        /**
         ** Add
         */

        // Add elements into ArrayList
        languages.add("Java");
        languages.add("Python");
        languages.add("Java");

        // Add elements at a specified position
        languages.add(1, "Golang");

        System.out.println("ArrayList(" + languages.size() + ") - " + languages);

        // Add all elements of a SET/MAP to an ArrayList
        HashSet<String> vowels = new HashSet<>(1);
        vowels.add("a");
        vowels.add("i");
        vowels.add("e");

        // Add elements at a specified position
        // ! Error: no suitable method found for add(int, String)
        // Because Set has not order
        // vowels.add(1, "d");

        System.out.println("HashSet(" + vowels.size() + ") - " + vowels);

        // Add all elements of set to ArrayList
        languages.addAll(vowels);
        System.out.println("ArrayList(" + languages.size() + ") - " + languages + "\n");

        /**
         ** Access (get, iterator)
         */
        System.out.println("ArrayList element at index 1: " + languages.get(1));
        //! error: cannot find symbol get(int)
        // System.out.println("ArrayList element at index 1: " + vowels.get(1)); 

        // Create a variable of Iterator
        // store the iterator returned by iterator()
        Iterator<String> iterate = languages.iterator();
        System.out.print("ArrayList: ");

        // loop through ArrayList till it has all elements
        // Use methods of Iterator to access elements
        while (iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }

        System.out.println();

        /**
         ** Sort(Comparator c)
         *
         * ASC - Comparator.naturalOrder()
         * DESC - Comparator.naturalOrder()
         */
        // sort the ArrayList in ASC
        languages.sort(Comparator.naturalOrder());
        System.out.println("Sorted languages (ASC): " + languages);
        
        // sort the ArrayList in DESC
        languages.sort(Comparator.reverseOrder());
        System.out.println("Sorted languages (DESC): " + languages);

        System.out.println();


        /**
         ** trimToSize()
         * (Remove unassigned space and change the capacity of array list equal to the number of elements in the arraylist)
         * 
         * When the internal array is full, a new array is created with 1.5 times more capacity than the current array. 
         * And, all elements are moved to the new array
         * 
         * suppose the internal array is full and we have to add only 1 element. 
         * Here, the ArrayList will expand with the same ratio (i.e. 1.5 times the previous array)
         * 
         * In this case, there will be some unassigned space in the internal array. 
         * Hence, the trimToSize() method removes the unassigned space and changes the capacity of arraylist equal to the number of elements in the arraylist.
         */
        // trim capacity to 3
        languages.trimToSize();
        System.out.println("Size of ArrayList: " + languages.size());


        /**
         ** removeIf(Predicate<E> filter)
         *
         * returns true if an element is removed from the arraylist.
         */
        languages.removeIf(e -> e.contains("Java"));
        System.out.println("ArrayList(" + languages.size() + ") - " + languages + "\n");


        /**
         ** clone()
         *
         * returns a copy of the ArrayList object
         */
        ArrayList<String> languageClone = (ArrayList<String>)languages.clone();
        System.out.println("languageClone(" + languageClone.size() + ") - " + languageClone + "\n");
        
        
        /**
         ** retainAll(Collection c)
         *
         * collection -only those elements present in collection are retained in the arraylist.
         * returns true if an element is removed from the arraylist.
         */
        ArrayList<String> language2 = new ArrayList<>();
        language2.add("Java");
        language2.add("Golang");
        languages.retainAll(language2);
        System.out.println("ArrayList(" + languages.size() + ") - " + languages + "\n");


        System.out.println("languageClone after retainAll(" + languageClone.size() + ") - " + languageClone + "\n");


        /**
         ** Convert ArrayList to Array
         */
        System.out.println("ArrayList to Array: " + languageClone.toArray());


        /**
         ** Convert Array to ArrayList
         */
        String[] arrStrings = {"Java", "Python"};
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(arrStrings));
        System.out.println("Array to ArrayList: " + languageClone.toArray());
    }
}
