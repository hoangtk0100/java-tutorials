/**
 * The BlockingQueue interface of the Java Collections framework extends the Queue interface. 
 * It allows any operation to wait until it can be successfully performed.
 * 
 ** ArrayBlockingQueue
 ** LinkedBlockingQueue
 */

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;

public class BlockingQueueDemo {
    public static void main(String[] args) {
        // Create a BlockingQueue using the ArrayBlockingQueue
        BlockingQueue<Integer> numbers = new ArrayBlockingQueue<>(5);

        try {
            // Insert elements into blocking queue
            numbers.put(2);
            numbers.put(1);
            numbers.put(3);
            System.out.println("BlockingQueue: " + numbers);
            
            
            // Remove elements
            int removedNumber = numbers.take();
            System.out.println("Removed element: " + removedNumber);
            System.out.println("BlockingQueue: " + numbers);
        } catch (Exception exception) {
            exception.getStackTrace();
        }
    }
}

/**
 ** Why BlockingQueue?
 *
 * In Java, BlockingQueue is considered as the thread-safe collection. It is because it can be helpful in multi-threading operations.
 * Suppose one thread is inserting elements to the queue and another thread is removing elements from the queue.
 * Now, if the first thread runs slower, then the blocking queue can make the second thread wait until the first thread completes its operation.
 */
