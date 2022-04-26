/**
 ** The LinkedBlockingQueue uses arrays as its internal storage.
 * 
 ** Note: It is compulsory to provide the size of the array.
 * 
 ** Why use LinkedBlockingQueue
 * It is considered as a thread-safe collection. Hence, it is generally used in multi-threading applications.
 * 
 * Suppose, one thread is inserting elements to the queue and another thread is removing elements from the queue.
 * 
 * Now, if the first thread is slower than the second thread, then the array blocking queue can make the second thread waits until the first thread completes its operations.
 * 
 */

import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueueDemo {
    public static void main(String[] args) {
        LinkedBlockingQueue<String> animals = new LinkedBlockingQueue<>(5);

        /**
         ** Add elements
         */
        // Using add()
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");
        animals.add("Mouse");
        System.out.println("LinkedBlockingQueue: " + animals);

        // Using offer()
        animals.offer("Bird");
        System.out.println("LinkedBlockingQueue: " + animals);
        

        /**
         ** Access elements
         */
        // Using peek()
        String peekElement = animals.peek();
        System.out.println("peekElement: " + peekElement);

        // Using Iterator
        System.out.println("Iterating");
        Iterator<String> iterate = animals.iterator();
        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }


        /**
         ** Remove elements
         */
        // Using remove
        System.out.println();
        String removedElement = animals.remove();
        System.out.println("removedElement: " + removedElement);
        
        // Using poll
        String polledElement = animals.poll();
        System.out.println("polledElement: " + polledElement);
        
        // Using clear
        animals.clear();
        System.out.println("Updated LinkedBlockingQueue: " + animals);


        /**
         ** put() and take() Method
         ** put() - Insert the element into the end of the queue
         ** take() - Remove and return the element from the front of the queue
         * In multi-threading processes, we can use put() and take() to block the operation of one thread to synchronize it with another thread. 
         * These methods will wait until they can be successfully executed.
         */
        try {
            // Add elements
            animals.put("Dog");
            animals.put("Cat");
            animals.put("Horse");
            animals.put("Mouse");
            // animals.put("Mouse"); // Wait for the queue has empty 
            // animals.put("Mouse");
            System.out.println("LinkedBlockingQueue: " + animals);
            
            // Remove top element
            animals.take();
            System.out.println("LinkedBlockingQueue(after take): " + animals);
        } catch (Exception exception) {
            exception.getStackTrace();
        }


        /**
         ** contains(element)
         */
        System.out.println("Has Dog? " + animals.contains("Dog"));
        
        
        /**
         ** toArray()
         */
        System.out.println("LinkedBlockingQueue(toArray): " + animals.toArray());
        
        
        /**
         ** toString()
         */
        System.out.println("LinkedBlockingQueue(toString): " + animals.toString() + " - size: " + animals.size());
    }
}
