
import java.util.Scanner;

class java2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int age=sc.nextInt();
        System.out.println("My name is "+name);
        System.out.println("My age is "+age);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=a*b*c;
        System.out.println("multi:"+d);
        int e=a+b+c;
        System.out.println("add:"+e);
        System.out.println("divide:"+(d/e));


    }
}