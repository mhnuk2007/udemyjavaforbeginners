// Base class with basic arithmetic methods
class Calc {
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int sub(int n1, int n2) {
        return n1 - n2;
    }
}

// Derived class that extends Calc and adds more features
class AdvCalc extends Calc {
    public int mul(int n1, int n2) {
        return n1 * n2;
    }

    public int div(int n1, int n2) {
        return n1 / n2;
    }
}

// Main class to demonstrate inheritance
public class InheritanceDemo {
    public static void main(String[] args) {

        // Using Calc class
        Calc basic = new Calc();
        int sum = basic.add(5, 4);
        int diff = basic.sub(5, 4);

        System.out.println("=== Basic Calculator ===");
        System.out.println("Addition (5 + 4): " + sum);
        System.out.println("Subtraction (5 - 4): " + diff);

        // Using AdvCalc class (inherits from Calc)
        AdvCalc advanced = new AdvCalc();
        int advSum = advanced.add(5, 4);  // inherited
        int advDiff = advanced.sub(5, 4); // inherited
        int product = advanced.mul(6, 3); // own method
        int quotient = advanced.div(6, 3);// own method

        System.out.println("\n=== Advanced Calculator ===");
        System.out.println("Addition (5 + 4): " + advSum);
        System.out.println("Subtraction (5 - 4): " + advDiff);
        System.out.println("Multiplication (6 * 3): " + product);
        System.out.println("Division (6 / 3): " + quotient);
    }
}
