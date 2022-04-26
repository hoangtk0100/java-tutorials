import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> languages = new LinkedList<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("Golang");
        languages.add("Golang");

        System.out.println("Languages: " + languages);

        // get the element from the linked list
        String str = languages.get(1);
        System.out.println("Element at index 1: " + str);
        System.out.println("Element at index 0: " + languages.getFirst());

        // add() method with the index parameter
        languages.add(1, "C++");
        System.out.println("Updated LinkedList: " + languages);

        // change elements at index 3
        languages.set(3, "Kotlin");
        System.out.println("Updated LinkedList: " + languages);

        // remove elements from index 1
        String removedElement = languages.remove(1);
        System.out.println("Removed Element: " + removedElement);

        System.out.println("Updated LinkedList: " + languages);


        /**
         ** QUEUE
         */
        // access the first element
        String str1 = languages.peek();
        System.out.println("Accessed Element: " + str1);
        
        // access and remove the first element
        String str2 = languages.poll();
        System.out.println("Removed Element: " + str2);
        System.out.println("LinkedList after poll(): " + languages);
        
        // add element at the end
        languages.offer("C#");
        System.out.println("LinkedList after offer(): " + languages);



        /**
         ** DEQUEUE
         */
        // access the first element
        String str3 = languages.peekLast();
        System.out.println("Accessed Element(DE): " + str3);
        
        // access and remove the first element
        String str4 = languages.pollFirst();
        System.out.println("Removed Element: " + str4);
        System.out.println("LinkedList after pollFirst(): " + languages);
        
        // add element at the end
        languages.offerFirst("C#");
        System.out.println("LinkedList after offerFirst(): " + languages);
    }
}
