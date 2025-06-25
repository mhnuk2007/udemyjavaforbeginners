public class RunnableDemoWithLambda {
    public static void main(String[] args) {
        // Create thread t1 using a lambda expression
        Thread t1 = new Thread(() -> {
            System.out.println("in X show");
            for (int i = 0; i < 20; i++) {
                System.out.println("hi" + i);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    // Optional: e.printStackTrace();
                }
            }
            System.out.println("t1 completed");
        });

        // Create thread t2 using a lambda expression
        Thread t2 = new Thread(() -> {
            System.out.println("in Y show");
            for (int i = 0; i < 20; i++) {
                System.out.println("hello" + i);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    // Optional: e.printStackTrace();
                }
            }
            System.out.println("t2 completed");
        });

        // Print default priorities
        System.out.println("Priority of t1: " + t1.getPriority());
        System.out.println("Priority of t2: " + t2.getPriority());

        // Start both threads
        t1.start();
        t2.start();

        // Wait for both threads to finish
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Main thread completed");
    }
}
