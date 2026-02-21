
class java8 {

    public static void main(String[] args) {
        // {//1
        // int n=4;
        //     for (int i = 0; i < n; i++) {
        //         for (int j = 0; j < n-i; j++) {
        //             System.out.print(j+1);
        //         }
        //         System.out.println();
        //     }
        // }
        {
            int n = 4;
            for (int i = 1; i <= n; i++) {
                for (int s = 1; s <= n - i; s++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i - 1; j++) {
                    System.out.print("*");
                }
                for (int j1 = 1; j1 <= i; j1++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
