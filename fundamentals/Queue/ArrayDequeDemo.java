import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<String> languages = new ArrayDeque<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("Golang");
        languages.add("NodeJS");
        languages.add("Flutter");

        System.out.println("Languages: " + languages);


        // remove elements from index 1
        String removedElement = languages.remove();
        System.out.println("Removed Element: " + removedElement);
        System.out.println("Updated LinkedList: " + languages);
        
        String removedFirstElement = languages.removeFirst();
        String removedLastElement = languages.removeLast();
        System.out.println("Removed Elements: " + removedFirstElement + " - " + removedLastElement);
        System.out.println("Updated LinkedList: " + languages);


        // Iterating
        System.out.println("Iterating using iterator");
        Iterator<String> iterate = languages.iterator();
        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }


        // Iterating using descendingIterator
        System.out.println("Iterating using descendingIterator");
        Iterator<String> descIterate = languages.descendingIterator();
        while(descIterate.hasNext()) {
            System.out.print(descIterate.next());
            System.out.print(", ");
        }


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
        languages.offerFirst("C++");
        System.out.println("LinkedList after offerFirst(): " + languages);


        /**
         ** STACK (LIFO) (Last In - First Out)
         */
        ArrayDeque<String> stack = new ArrayDeque<>();

        stack.push("Golang");
        stack.push("Python");
        stack.push("Java");
        System.out.println("Stack: " + stack);
        
        // Access the top element
        String topElement = stack.peek();
        System.out.println("Top Element Of Stack: " + topElement);
        
        stack.pop();
        System.out.println("Stack: " + stack);
    }
}
