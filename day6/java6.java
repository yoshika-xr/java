
class java6 {

    public static void main(String[] args) {
        //revise the given number//
        {
            int num = 8865765;
            int sum = 0;
            while (num != 0) {
                int n = num % 10;
                sum = sum * 10 + n;
                num /= 10;
            }
            System.out.println(sum);
        }
    }
}
