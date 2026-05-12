class demo{
    String name;
    int cost;
    static String brand;

    public demo(){
        System.out.println(name+":"+cost+":"+brand);
    }
    public static void show(){
        System.out.println(name+":"+cost+":"+brand);
    }
}
public class staticmethod{
    public static void main(String[] args) {
        demo obj=new demo();
        obj.name="yash";
        obj.cost=1000;  
        obj.brand="phone";
        
    }
}