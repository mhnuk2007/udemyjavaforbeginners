// Parent class
class A3 {
    public void show() {
        System.out.println(); // original method (empty line)
    }
}

// Main class demonstrating anonymous inner class
public class AnonymousInnerClassDemo {
    public static void main(String[] args) {

        // Creating an anonymous subclass of A3 and overriding show()
        A3 obj = new A3() {
            @Override
            public void show() {
                System.out.println("in new show"); // overridden implementation
            }
        };

        // Calling the overridden method
        obj.show(); // Output: in new show
    }
}
