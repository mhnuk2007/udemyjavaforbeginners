class A {
    public A() {
        System.out.println("object created");
    }

    public void show() {
        System.out.println("in A show");
    }
}

public class AnonymousObjectDemo {
    public static void main(String[] args) {

        A obj;
        obj = new A();
        obj.show();

        new A(); // Anonymous object

        new A().show(); // Anonymous object with method call


    }
}
