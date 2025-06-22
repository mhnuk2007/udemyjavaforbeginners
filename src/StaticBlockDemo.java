class Mobile1 {
    String brand;
    int price;
    static String name;

    static {
        name = "Phone";
        System.out.println("in Static Block");
    }

    public Mobile1(){
        brand = "";
        price = 200;
        System.out.println("in Constructor");
    }

    public void show() {
        System.out.println(brand + " :" + price + " : " + name);
    }
}

public class StaticBlockDemo {
    public static void main(String[] args) {
        Mobile1 obj = new Mobile1();
        obj.brand = "Apple";
        obj.price = 1500;
        Mobile1.name = "Smart Phone";

        Mobile1 obj1 = new Mobile1();
        obj1.brand = "Samsung";
        obj1.price = 1200;

        Mobile1 obj2 = new Mobile1();


        obj.show();
        obj1.show();
        obj2.show();
    }

}
