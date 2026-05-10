
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
            mobliestore obj = new mobliestore();
            obj.name = "samsung";
            obj.cost = 20000;
            mobliestore.brand = "galaxy";
            obj.show();
        }
    }
