
class easy {

    public static void main(String[] args) {
        int n = 4;
        {

            // for(int i=1;i<=5;i++){
            //     for(int j=1;j<=5;j++){
            //         System.out.print("*");
            //     }
            //     System.out.println();
            // }
            // *****
            // *****
            // *****
            // *****
            // *****
        }
        {
            // int n = 5;
            // for (int i = 1; i <= 5; i++) {
            //     for (int j = 1; j <= n - i + 1; j++) {
            //         System.out.print(j);
            //     }
            //     System.out.println();
            // }

            // 12345
            // 1234        
            // 123
            // 12
            // 1
        }
        {
            // for (int i = 1; i <= 5; i++) {
            //     for (int j = 1; j <= i; j++) {
            //         System.out.print(j);
            //     }
            //     System.out.println();
            // }

            // 1
            // 12
            // 123
            // 1234
            // 12345
        }
        {

            // for (int i = 1; i <= 5; i++) {
            //     for (int j = 1; j <= i; j++) {
            //         System.out.print("*");
            //     }
            //     System.out.println();
            // }
            // *
            // **
            // ***
            // ****
            // *****
        }
        {

            // for (int i = 0; i < n; i++) {
            //     for (int j = 0; j < n - i; j++) {
            //         System.out.print(j + 1);
            //     }
            //     System.out.println();
            // }
            // 1234
            // 123
            // 12
            // 1
        }
        {

            for (int i = 0; i < n; i++) {
                char ch = (char) ('A' + i);
                for (int j = 0; j <= i; j++) {
                    System.out.print(ch);
                }
                System.out.println();
            }

            // A
            // BB
            // CCC
            // DDDD
        }
        {
            // for (int i = 1; i <= n; i++) {
            //     for (int j = 1; j <= n; j++) {
            //         if (i == 1 || i == n || j == 1 || j == n) {
            //             System.out.print(n);
            //         } else if (i == 2 || i == n - 1 || j == 2 || j == n - 1) {
            //             System.out.print(n - 1);
            //         } else {
            //             System.out.print(" ");
            //         }
            //     }
            //     System.out.println();

            // }
            // ****
            // *  *
            // *  *
            // *  *
            // ****
        }
        {

            // for(int i=1;i<=n;i++){
            //     for(char ch='A';ch<='A'+(n-i);ch++){
            //         System.out.print(ch);
            //     }
            //     System.out.println();
            // }
            // A
            // BB
            // CCC
            // DDDD 
            // EEEEE 
        }
        {

            // for (int i = 1; i <= n; i++) {
            //     char ex = (char) ('D'-i+1 );
            //     for (char ch = 'A'; ch <= ex; ch++) {
            //         System.out.print(ch);
            //     }
            //     System.out.println();
            // }
            // ABCD
            // ABC
            // AB
            // A
        }
        {
            
                for (int i = 1; i <= n; i++) {
                    for (char ch = 'A'; ch < 'A' + i; ch++) {
                        System.out.print(ch + " ");
                    }
                    System.out.println();
                }

            // A 
            // A B
            // A B C
            // A B C D
        }

    }
}
