
class java6 {

    public static void main(String[] args) {
        //revise the given number//
        {
            // int num = 1534236469;
            // int sum = 0;
            // while (num != 0) {
            //     int n = num % 10;
            //     if (sum > Integer.MAX_VALUE / 10
            //             || (sum == Integer.MAX_VALUE / 10 && num > 7)) {
            //         System.out.println(0);
            //     }

            //     if (sum < Integer.MIN_VALUE / 10
            //             || (sum == Integer.MIN_VALUE / 10 && num < -8)) {
            //         System.out.println(0);
            //     }
            //     sum = sum * 10 + n;
            //     num /= 10;
            // }
            // System.out.println(sum);
        }
        {
            // for (int i = 0; i < 3; i++) {
            //     for (int j = 0; j < 3; j++) {
            //         for (int k = 0; k < 3; k++) {
            //             System.out.println("i = " + i + ", j = " + j);
            //         }
            //     }
            // }
        }
        {
            // int num = 123;
            // int count = 0;
            // for (int i = num; i > 0; i/= 10) {
            //     count++;
            // }
            // System.out.println(count);
        }
        {

            // for(int i=1;i<=5;i++){
            //     for(int j=1;j<=5;j++){
            //         System.out.print("*");
            //     }
            //     System.out.println();
            // }
        }
        {
            for (int i = 1; i <= 5; i++) {
                for (int j = 1; j <=5-i+1; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
        {
            //  for (int i = 1; i <= 5; i++) {
            //     for (int j = 1; j <= i; j++) {
            //         System.out.print(j);
            //     }
            //     System.out.println();
            // }
        }
    }

}
