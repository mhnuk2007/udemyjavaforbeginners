// Class F implements Runnable and represents a task that prints "hi" messages
class F implements Runnable {
    public void run() {
        System.out.println("in X show");  // Identifies which thread is running
        for (int i = 0; i < 20; i++) {
            System.out.println("hi" + i);  // Print "hi" with index
            try {
                Thread.sleep(50);  // Pause for 50ms to simulate work
            } catch (InterruptedException e) {
                // Handle exception (if thread is interrupted)
            }
        }
        System.out.println("t1 completed");  // Indicate t1 task is done
    }
}

// Class G implements Runnable and represents a task that prints "hello" messages
class G implements Runnable {
    public void run() {
        System.out.println("in Y show");  // Identifies which thread is running
        for (int i = 0; i < 20; i++) {
            System.out.println("hello" + i);  // Print "hello" with index
            try {
                Thread.sleep(50);  // Pause for 50ms to simulate work
            } catch (InterruptedException e) {
                // Handle exception (if thread is interrupted)
            }
        }
        System.out.println("t2 completed");  // Indicate t2 task is done
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        F obj1 = new F();  // Create task object F
        G obj2 = new G();  // Create task object G

        Thread t1 = new Thread(obj1);  // Wrap obj1 in Thread t1
        Thread t2 = new Thread(obj2);  // Wrap obj2 in Thread t2

        // Print the default priorities of both threads (usually 5)
        System.out.println("Priority of t1 (F): " + t1.getPriority());
        System.out.println("Priority of t2 (G): " + t2.getPriority());

        // Start both threads
        t1.start();
        t2.start();

        // Wait for both threads to complete using join()
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // This line executes only after both t1 and t2 finish
        System.out.println("Main thread completed");
    }
}
