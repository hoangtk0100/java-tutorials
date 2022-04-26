import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();

        // Add elements to stack
        animals.push("Dog");
        animals.push("Cat");
        animals.push("Pig");

        System.out.println("Stack: " + animals);
        
        // Remove element stack
        String element = animals.pop();
        System.out.println("Removed element: " + element);
        System.out.println("Stack: " + animals);

        // Access the top element without removing it
        String topElement = animals.peek();
        System.out.println("Top element: " + topElement);
        System.out.println("Get element: " + animals.get(1));
        System.out.println("ElementAt element: " + animals.elementAt(1));
        System.out.println("ElementAt element: " + animals.re(1));

        // Search, return position (# index)
        int position = animals.search("Dog");
        System.out.println("Position of Dog: " + position);

        // Check if stack is empty
        boolean isEmpty = animals.empty();
        System.out.println("Is stack empty? " + isEmpty);
    }
}
