public class WrapperClassDemo {
    public static void main(String[] args) {
        // Primitive int value
        int num = 7;

        // Autoboxing: automatically converts primitive int to Integer object
        Integer num1 = num;

        // Printing primitive and its wrapper object
        System.out.println(num);   // Output: 7
        System.out.println(num1);  // Output: 7 (Integer object)

        // Unboxing: automatically converts Integer object to primitive int
        int num2 = num1;
        System.out.println(num2);  // Output: 7

        // Manual boxing using Integer.valueOf (recommended over new Integer)
        int num3 = 8;
        // Integer num4 = new Integer(num3); // Deprecated since Java 9
        Integer num4 = Integer.valueOf(num3); // Boxing
        System.out.println(num4);  // Output: 8

        // Manual unboxing using intValue() method
        int num5 = num4.intValue();
        System.out.println(num5);  // Output: 8

        // Converting String to int using parseInt (returns primitive int)
        String str = "12";
        int num6 = Integer.parseInt(str);
        System.out.println(num6);  // Output: 12

        // Converting String to Integer object using parseInt (auto-boxed)
        Integer num7 = Integer.parseInt(str);
        System.out.println(num7);  // Output: 12

        // Converting Integer object to String using toString()
        String str1 = num7.toString();
        System.out.println(str1);  // Output: "12"
    }
}
