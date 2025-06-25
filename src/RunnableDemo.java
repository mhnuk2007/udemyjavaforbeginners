class F implements Runnable {
    public void run() {
        System.out.println("in X show");
        for (int i = 0; i < 20; i++) {
            System.out.println("hi" + i);
            try {
                Thread.sleep(100); // pause for 100ms between prints
            } catch (InterruptedException e) {
                // handle exception (optional logging)
            }
        }
    }
}

class G implements Runnable {
    public void run() {
        System.out.println("in Y show");
        for (int i = 0; i < 20; i++) {
            System.out.println("hello" + i);
            try {
                Thread.sleep(100); // pause for 100ms between prints
            } catch (InterruptedException e) {
                // handle exception (optional logging)
            }
        }
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        F obj1 = new F();
        G obj2 = new G();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        // Print default priorities (usually 5)
        System.out.println("Priority of t1 (F): " + t1.getPriority());
        System.out.println("Priority of t2 (G): " + t2.getPriority());


        // Start both threads
        t1.start();
        t2.start();
    }
}
