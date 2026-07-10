public class Recursion4 {
    public int fab(int n){
        int a=0; 
        int b=1;
        int c=0;
        if(n==1){
            return a;
        }else{
        for(int i=1;i<n;i++){
            c=a+b;
            a=b;
            b=c;
        }
        return c;
        }
    }
    public static void main(String[] args) {
        Recursion4 f=new Recursion4();
        System.out.println(f.fab(3));
    }
}