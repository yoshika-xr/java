
class student {

    int regno;
    String name;

//constructor
    public student() {
        regno = 123;
        name = "yash";
    }

    public void show() {
        System.out.println(regno + ":" + name);

    }

}

public class constructor {

    public static void main(String[] args) {
        student obj = new student();
        obj.show();
    }
}
