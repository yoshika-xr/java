
class student {

    private int regno;//encapsulation
    String name;

    public  void show(int a, String b){
        regno=a;
        name=b;
        System.out.println(regno+":"+name);
    }

}

public class encapsulation {

    public static void main(String[] args) {
        student obj = new student();
        obj.show(01,"john");

    }
}
