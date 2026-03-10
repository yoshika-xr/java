import java.util.Scanner;
class no4{
    public static void main(String[] args) {
         //find the common divisible of 3 and 5 upto 100//
        {
            Scanner sc = new Scanner(System.in);
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            for (int i = 1; i <= 100; i++) {
                if (i % num1 == 0 && i % num2 == 0) {
                    System.out.print(i + " ");
                }
            }

        }
    }
}