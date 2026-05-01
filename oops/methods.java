class opertion{
    public void  getSound(){
        System.out.println("Playing music...");
    }
    public String getPen(int cost){
        if (cost>=10)
            return "Take it..";
        else
            return "Nothing..";
    }
}
public class methods{
    public static void main(String[] args) {
        opertion obj=new opertion();
        obj.getSound();
        String result=obj.getPen(10);
        System.out.println(result);
    }
    }

