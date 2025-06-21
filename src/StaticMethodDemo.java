public class StaticMethodDemo {
    static class Mobile {
        String brand;
        int price;
        static String name;

        public void show() {
            System.out.println(brand + " :" + price + " : " + name);
        }

        public static void show1(Mobile obj) {
            System.out.println(obj.brand + " :" + obj.price + " : " + name);
        }
    }

    public static void main(String[] args) {
        Mobile obj = new Mobile();
        obj.brand = "Apple";
        obj.price = 1500;
        Mobile.name = "Smart Phone";

        Mobile obj1 = new Mobile();
        obj1.brand = "Samsung";
        obj1.price = 1200;
        Mobile.name = "Smart Phone";

        obj.show();
        Mobile.show1(obj1);
    }
}
