class computer{
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public double add(double a,int b){
        return a+b;
    }
}
public class overloading{
    public static void main(String[] args) {
        computer obj=new computer();
        int res1=obj.add(10,5);
        int res2=obj.add(10,2,3);
        double res3=obj.add(10.5,5);
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }
}