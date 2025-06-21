class Mobile {
    String brand;
    int price;
    String name;

    public void show() {
        System.out.println(brand + " :" + price + " : " + name);
    }
}

public class StaticVeriableDemo {
    public static void main(String[] args) {
        Mobile obj = new Mobile();
        obj.brand = "Apple";
        obj.price = 1500;
        obj.name = "Smart Phone";

        Mobile obj1 = new Mobile();
        obj1.brand = "Samsung";
        obj1.price = 1200;
        obj1.name = "Smart Phone";

        obj.show();
        obj1.show();
    }

}
