import java.util.Scanner;

class java4 {

    public static void main(String[] args) {

//print count of divisor//
        {
            int num = 60;
            int count = 0;
            int start = 2;
            while(start <= num / 2) {
                if (num % start == 0) {
                    count++;
                }
                start++;
            }
            System.out.print(count);
        }
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
