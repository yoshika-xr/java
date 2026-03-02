
class java3 {

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        //found count of the digit//
        {
            int a = 0;
            if (a == 0) {
                System.out.println(1);
            } else {
                int count = 0;
                while (a > 0) {
                    a = a / 10;
                    count++;
                }
                System.out.println(count);
            }
            // for (int i = a; i >= 0; i = i / 10) {
            //     count++;
            // }
        }
        //found divisor of given number//
        {
            int num = 60;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {

                    System.out.print(i + " ");
                }
            }
        }

    }
}
