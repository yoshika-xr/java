
class mobile {

    String name;
    int cost;
    static String brand;

    public void show() {
        System.out.println(name + ":" + cost + ":" + brand);
    }
}

public class staticvariable {

    public static void main(String[] arg) {
        mobile obj = new mobile();
        mobile obj1 = new mobile();
        obj1.name = "samsung";
        obj1.cost = 20000;
        mobile.brand = "galaxy";

        mobile obj2 = new mobile();
        obj2.name = "vivo10pro";
        obj2.cost = 25000;
        mobile.brand = "vivo";

        mobile obj3 = new mobile();
        obj3.name = "oppo17plus";
        obj3.cost = 18000;
        mobile.brand = "phone";

        obj1.show();
        obj2.show();
        obj3.show();
    }
}

// samsung:20000:phone
// vivo10pro:25000:phone
// oppo17plus:18000:phone 
//it is because of static variable, it will take the last value assigned to it.