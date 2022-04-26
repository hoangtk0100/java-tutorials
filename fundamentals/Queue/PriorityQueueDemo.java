import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

/**
 ** PriorityQueue is a queue with the top element has the smallest value (ASC) (can be DESC by using the Comparator)
 ** After removing the top element, the PriorityQueue will re-order and the top element is the element having smallest value
 */
public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> numbers = new PriorityQueue<>();


        // Using add() method - if the queue is full, throws an exception
        numbers.add(4);
        numbers.add(2);
        numbers.add(9);
        numbers.add(3);
        System.out.println("PriorityQueue(ASC): " + numbers);


        // Using offer() method - if the queue is full, return false
        numbers.offer(1);
        System.out.println("Updated PriorityQueue: " + numbers);
        
        
        // Accessing the head element
        // Using peek()
        System.out.println("Access element: " + numbers.peek());
        

        // remove() - Remove the specified element
        boolean isSuccessfulRemoving = numbers.remove(2);
        System.out.println("\nIs the element 2 removed: " + isSuccessfulRemoving);
        
        
        // poll() - Return and remove the head of queue
        int headElement = numbers.poll();
        System.out.println("Removed top element: " + headElement);


        // Iterating over the queue
        System.out.print("PriorityQueue using iterator(): ");
        Iterator<Integer> iterate = numbers.iterator();
        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }

        System.out.println();


        // Re-order the elements in the queue (DESC)
        // Creating a priority queue
        PriorityQueue<Integer> descNumbers = new PriorityQueue<>(new CustomComparator());
        descNumbers.add(4);
        descNumbers.add(2);
        descNumbers.add(1);
        descNumbers.add(3);
        System.out.print("PriorityQueue(DESC): " + descNumbers);
    }
}

class CustomComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer number1, Integer number2) {
        int value = number1.compareTo(number2);
        
        // Elements are sorted in reverse order
        if (value > 0) {
            return -1;
        } else if (value < 0) {
            return 1;
        }

        return 0;
    }
}