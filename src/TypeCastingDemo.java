// Parent class
class A1 {
    public void show1() {
        System.out.println("in A1 show1()");
    }
}

// Child class
class B1 extends A1 {
    public void show2() {
        System.out.println("in B1 show2()");
    }
}

// Main class to demonstrate upcasting and downcasting
public class TypeCastingDemo {
    public static void main(String[] args) {

        // Creating object of parent class
        A1 obj = new A1();
        obj.show1();  // Output: in A1 show1()

        // Creating object of child class
        B1 obj1 = new B1();
        obj1.show1();  // inherited method
        obj1.show2();  // child method

        // Upcasting: child object referenced by parent type
        A1 obj2 = new B1();  // Upcasting is safe and implicit
        obj2.show1();        // Only parent method accessible

        // obj2.show2(); ❌ Not allowed: show2() not in A1

        // Downcasting: parent reference pointing to child object
        B1 obj3 = (B1) obj2; // Explicit cast (safe in this case)
        obj3.show1();        // Output: in A1 show1()
        obj3.show2();        // Output: in B1 show2()

        // ⚠️ Be careful: Downcasting is only safe when the actual object is of the subclass
        // A1 obj4 = new A1();
        // B1 obj5 = (B1) obj4; // ❌ This will throw ClassCastException at runtime
    }
}
