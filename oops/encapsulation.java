
class student {

    private int regno;//enapsulation
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
        // obj.regno = 01;
        // obj.name="john";
        obj.show(01,"john");

    }
}
