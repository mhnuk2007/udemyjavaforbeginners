class X extends Thread {
    public void run() {
        System.out.println("in X show");
        for (int i = 0; i < 200; i++) {
            System.out.println("hi" + i);
            try {
                Thread.sleep(100); // pause for 100ms between prints
            } catch (InterruptedException e) {
                // handle exception (optional logging)
            }
        }
    }
}

class Y extends Thread {
    public void run() {
        System.out.println("in Y show");
        for (int i = 0; i < 200; i++) {
            System.out.println("hello" + i);
            try {
                Thread.sleep(100); // pause for 100ms between prints
            } catch (InterruptedException e) {
                // handle exception (optional logging)
            }
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        X obj1 = new X();
        Y obj2 = new Y();

        // Print default priorities (usually 5)
        System.out.println("Priority of obj1 (X): " + obj1.getPriority());
        System.out.println("Priority of obj2 (Y): " + obj2.getPriority());

        // Increase priority of obj2 to MAX
//        obj2.setPriority(Thread.MAX_PRIORITY);
//        System.out.println("Updated priority of obj2 (Y): " + obj2.getPriority());

        // Start both threads
        obj1.start();
        obj2.start();
    }
}
