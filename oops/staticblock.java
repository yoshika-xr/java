
class mobliestore {

    String name;
    int cost;
    static String brand;

    static {
        brand = "phone";
        System.out.println("static block is executed");

    }

    public mobliestore() {
        name = "";
        cost = 10;
        System.out.println("constructor is executed");
    }

    public void show() {
        System.out.println(name + ":" + cost + ":" + brand);
    }
}

public class staticblock {

    public static void main(String[] arg) throws ClassNotFoundException {

            Class.forName("mobliestore");

            // mobliestore obj = new mobliestore();
            mobliestore obj1 = new mobliestore();
            obj1.name = "samsung";
            obj1.cost = 20000;
            mobliestore.brand = "galaxy";
            obj1.show();
        }
    }
