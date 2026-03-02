
class java3 {

    public static void main(String[] args) 
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
