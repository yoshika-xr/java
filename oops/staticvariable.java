
class mobile {

    String name;
    int cost;
    String brand;

    public void show() {
        System.out.println(name + " " + cost + " " + brand);
    }
}

public class staticvariable {

    public static void main(String[] arg) {
        mobile obj = new mobile();
        mobile obj1 = new mobile();
        obj1.name = "samsung";
        obj1.cost = 20000;
        obj1.brand = "galaxy";

        mobile obj2 = new mobile();
        obj2.name = "viva";
        obj2.cost = 25000;
        obj2.brand = "galaxy";

        mobile obj3 = new mobile();
        obj3.name = "oppo";
        obj3.cost = 18000;
        obj3.brand = "galaxy";
        obj.show();
        obj1.show();
        obj2.show();
        obj3.show();
    }
}
