
class demo {

    String name;
    int cost;
    static String brand;

    public demo() {
        System.out.println("it is constructor");
    }

    public static void show(demo obj) {
        System.out.println(obj.name + ":" + obj.cost + ":" + brand);
    }
}

public class staticmethod {

    public static void main(String[] args) {
        demo obj = new demo();
        obj.name = "yash";
        obj.cost = 1000;
        obj.brand = "phone";
        obj.show(obj);

    }
}
