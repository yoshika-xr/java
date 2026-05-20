
class student {

    int regno;
    String name;

//constructor
    public student() {
        regno = 123;
        name = "yash";
    }


//parameters constructor
    public student(int a, String b) {
        regno = a;
        name = b;
    }

    public void show() {
        System.out.println(regno + ":" + name);

    }

}

public class constructor {

    public static void main(String[] args) {
        student obj = new student();
        obj.show();
        student obj1 = new student(01, "maha");
        obj1.show();
    }
}
