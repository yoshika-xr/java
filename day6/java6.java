
class java6 {

    public static void main(String[] args) {
        //revise the given number//
        {
            // int num = 8865765;
            // int sum = 0;
            // while (num != 0) {
            //     int n = num % 10;
            //     sum = sum * 10 + n;
            //     num /= 10;
            // }
            // System.out.println(sum);
        }
        {
            int num = 123;
            int count = 0;
            for (int i = num; i > 0; i/= 10) {
                count++;
            }
            System.out.println(count);
        }
    }
}
