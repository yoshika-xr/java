
import java.util.Scanner;

class java3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //found count of the digit//
        {
               int a = sc.nextInt(); 
                int count = 0;
                for (int i = a; i > 0; i = i / 10) {
                    count++;
                }
                System.out.println(count);
        }
        //found divisor of given number//
        {
            int num = 60;
            for (int i = 2; i <= num/2; i++) {
                if (num % i == 0) {

                    System.out.print(i+" ");
                }
            }
        }
        
    }
}
