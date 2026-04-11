//get and set methods
class Data {

    private Integer num;
    private String name;

    Data(int _num, String _name) {
        this.num = _num;
        this.name = _name;
    }
    public void setnum(int _num){
        this.num=_num;
    }
    public void setname(String _name){
        this.name=_name;
    }
    public  int getnum(){
        return(num);
    }
    public String getname(){
        return(name);
    }

}
public class  no2{
    public static void main(String[] args) {
        Data obj1=new Data(1,"maya");
        Data obj2=new Data(2,"john");
        System.out.println(obj1.getnum());
    }
}
