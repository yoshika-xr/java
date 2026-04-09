//custom class
class Data {

    public Integer num;
    public String name;

    Data(int _num, String _name) {
        this.num = _num;
        this.name = _name;
    }
}

public class no1 {

    public static void main(String[] args) {
        Data obj1 = new Data(9,"moha");
        Data obj2 = new Data( 1,"maya");
        obj1.name = "john";
        System.out.println(obj2.name);
    }
}
///john

