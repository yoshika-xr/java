
class demo {

    private int a;
    private String name;

    public void setname(String name) {
        this.name= name;
    }

    public String getname() {
        return name;
    }

    public void seta(int a) {
        this.a=a;
    }

    public int geta() {
        return a;
    }
}

public class thiskey{
    public static void main(String[] args) {
        demo obj=new demo();
        obj.setname("yosh");
        obj.seta(10);
        System.out.println(obj.getname()+":"+obj.geta());
    }
}
