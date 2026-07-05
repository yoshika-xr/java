public class tailrecursion{
   static  int count=0;
       static void func(){
            if(count==4){
                return;
            }
            func();
            System.out.println("maya");
            count++;
        }
    public static void main(String[] args) {
        tailrecursion r=new tailrecursion();
        r.func();
     
    }
}
