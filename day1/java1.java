
import java.util.Scanner;


class java1 {

    public static void main(String[] args) {
        int a=10;
        System.out.println("hello");
        Scanner sc=new Scanner(System.in);
        String name = sc.nextLine();
        int b=sc.nextInt();
        System.out.print("Hello " + name);
        System.out.print(a+b);
    }
}
