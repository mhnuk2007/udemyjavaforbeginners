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
        if (n2 == 0) {
            System.out.println("Error: Division by zero");
            return 0; // default or could throw an exception
        }
        return n1 / n2;
    }
}

// Multi-level inheritance with power functionality
class VeryAdvCalc extends AdvCalc {
    public double power(int n1, int n2) {
        return Math.pow(n1, n2);
    }
}

// Main class to demonstrate inheritance
public class InheritanceDemo {
    public static void main(String[] args) {

        // Using Calc class
        Calc basic = new Calc();
        System.out.println("=== Basic Calculator ===");
        System.out.println("Addition (5 + 4): " + basic.add(5, 4));
        System.out.println("Subtraction (5 - 4): " + basic.sub(5, 4));

        // Using AdvCalc class
        AdvCalc advanced = new AdvCalc();
        System.out.println("\n=== Advanced Calculator ===");
        System.out.println("Addition (5 + 4): " + advanced.add(5, 4));     // inherited
        System.out.println("Subtraction (5 - 4): " + advanced.sub(5, 4));  // inherited
        System.out.println("Multiplication (6 * 3): " + advanced.mul(6, 3));
        System.out.println("Division (6 / 3): " + advanced.div(6, 3));

        // Using VeryAdvCalc class
        VeryAdvCalc veryAdvanced = new VeryAdvCalc();
        System.out.println("\n=== Very Advanced Calculator ===");
        System.out.println("Addition (5 + 4): " + veryAdvanced.add(5, 4));     // from Calc
        System.out.println("Subtraction (5 - 4): " + veryAdvanced.sub(5, 4));  // from Calc
        System.out.println("Multiplication (6 * 3): " + veryAdvanced.mul(6, 3)); // from AdvCalc
        System.out.println("Division (6 / 3): " + veryAdvanced.div(6, 3));       // from AdvCalc
        System.out.println("Power (2^3): " + veryAdvanced.power(2, 3));          // from VeryAdvCalc
    }
}
