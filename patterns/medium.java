
class medium {

    public static void main(String[] args) {
        int n = 4;
        {
            // for (int i = 1; i <= n; i++) {
            //     for (int s = 1; s <= n - i; s++) {
            //         System.out.print(" ");
            //     }
            //     for (int j = 1; j <= i - 1; j++) {
            //         System.out.print("*");
            //     }
            //     for (int j1 = 1; j1 <= i; j1++) {
            //         System.out.print("*");
            //     }
            //     System.out.println();
            // }

            //    *
            //   ***
            //  *****
            // *******
        }
        {
            // for (int i = 1; i <= n; i++) {
            //     for (int sp = 1; sp <= i - 1; sp++) {
            //         System.out.print(" ");
            //     }
            //     for (int j = 1; j <= n - i + 1; j++) {
            //         System.out.print("*");
            //     }
            //     for (int k = 1; k <= n - i; k++) {
            //         System.out.print("*");
            //     }
            //     System.out.println();

            // *******
            //  *****
            //   ***
            //    *
        }
        {
            //1
            // for (int i = 1; i <= n; i++) {
            //     for (int j = 1; j <= i; j++) {
            //         System.out.print("*");
            //     }
            //     for (int sp = 1; sp <= n - i; sp++) {
            //         System.out.print(" ");
            //     }
            //     for (int sp = 1; sp <= n - i; sp++) {
            //         System.out.print(" ");
            //     }
            //     for (int k = 1; k <= i; k++) {
            //         System.out.print("*");
            //     }
            //     System.out.println();
            // }
            // for (int i = 1; i <= n - 1; i++) {
            //     for (int j = 1; j <= n - i; j++) {
            //         System.out.print("*");
            //     }
            //     for (int sp = 0; sp < i; sp++) {
            //         System.out.print(" ");
            //     }
            //     for (int sp = 0; sp < i; sp++) {
            //         System.out.print(" ");
            //     }
            //     for (int k = 1; k <= n - i; k++) {
            //         System.out.print("*");
            //     }
            //     System.out.println();
            // }

            // *        *
            // **      **
            // ***    ***
            // ****  ****
            // **********
            // ****  ****
            // ***    ***
            // **      **
            // *        *
        }
        {
            //2 
            // for (int i = 1; i <= n; i++) {
            //     for (int sp1 = 0; sp1 <= n - i; sp1++) {
            //         System.out.print("*");
            //     }
            //     for (int j1 = 1; j1 <= i-1; j1++) {
            //         System.out.print(" ");
            //     }
            //     for (int k1 = 1; k1 <= i - 1; k1++) {
            //         System.out.print(" ");
            //     }
            //     for (int l1 = 0; l1 <= n - i; l1++) {
            //         System.out.print("*");
            //     }
            //     System.out.println();

            // }
            // {
            //     for (int i2 = 1; i2 <= n; i2++) {
            //         for (int sp2 = 0; sp2 <= i2 - 1; sp2++) {
            //             System.out.print("*");
            //         }
            //         for (int j2 = 1; j2 <= n - i2; j2++) {
            //             System.out.print(" ");
            //         }
            //         for (int k2 = 1; k2 <= n - i2; k2++) {
            //             System.out.print(" ");
            //         }
            //         for (int l2 = 0; l2 <= i2 - 1; l2++) {
            //             System.out.print("*");
            //         }
            //         System.out.println();
            //     }
            // }
            // **********
            // ****  ****
            // ***    ***
            // **      **
            // *        *
            // *        *
            // **      **
            // ***    ***
            // ****  ****
            // **********
        }
        {
            // for (int i = 1; i <= n; i++) {
            //     for (int sp = 0; sp <= n - i - 1; sp++) {
            //         System.out.print(" ");
            //     }
            //     for (char ch1 = 'A'; ch1 < 'A' + i - 1; ch1++) {
            //         System.out.print(ch1);
            //     }
            //     char ex = (char) ('A' + i - 1);
            //     for (char ch2 = ex; ch2 >= 'A'; ch2--) {
            //         System.out.print(ch2);
            //     }
            //     System.out.println();
            // }

            //    A
            //   ABA
            //  ABCBA
            // ABCDCBA
        }
        {
            //method1
            {
                // int n = 2;
                // for (int i1 = 1; i1 <= n; i1++) {
                //     for (int sp1 = 1; sp1 <= n - i1; sp1++) {
                //         System.out.print(" ");
                //     }
                //     for (int j1 = 1; j1 <= i1; j1++) {
                //         System.out.print("*");
                //     }
                //     for (int k1 = 1; k1 <= i1 - 1; k1++) {
                //         System.out.print("*");
                //     }
                //     System.out.println();

                // }
                // {
                //     for (int i2 = 1; i2 <= n; i2++) {
                //         for (int sp2 = 1; sp2 <= i2 - 1; sp2++) {
                //             System.out.print(" ");
                //         }
                //         for (int j2 = 1; j2 <= n - i2 + 1; j2++) {
                //             System.out.print("*");
                //         }
                //         for (int k2 = 1; k2 <= n - i2; k2++) {
                //             System.out.print("*");
                //         }
                //         System.out.println();
                //     }
                // }
            }

            // method=2
            {
                //     int n = 4;
                //     for (int i = 0; i < n; i++) {

                //         for (int j = 0; j < n - i - 1; j++) {
                //             System.out.print(" ");
                //         }
                //         for (int j = 0; j < 2 * i + 1; j++) {
                //             System.out.print("*");
                //         }
                //         System.out.println();
                //     }
                // }
                // {
                //     int n = 4;
                //     for (int i = 0; i < n; i++) {
                //         for (int j = 0; j < i; j++) {
                //             System.out.print(" ");
                //         }
                //         for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
                //             System.out.print("*");
                //         }
                //         System.out.println();
                //     }
            }
            //    *
            //   ***
            //  *****
            // *******
            // *******
            //  *****
            //   ***
            //    *
        }
        {
            // {
            //     for (int i = 1; i <= n; i++) {
            //         for (int j = 1; j <= i; j++) {
            //             System.out.print("*");
            //         }
            //         System.out.println();
            //     }
            //     {
            //         for (int i = 1; i <= n; i++) {

            //             for (int k = 1; k <= n - i; k++) {
            //                 System.out.print("*");
            //             }
            //             System.out.println();
            //         }
            //     }
            // }
            // *
            // **
            // ***
            // ****
            // ******
            // ****
            // ***
            // **
            // *
        }
        {
            // int start = 0;
            // for (int i = 0; i <= n; i++) {
            //     if (i % 2 == 0) {
            //         start = 1;
            //     } else {
            //         start = 0;
            //     }
            //     for (int j = 1; j <= i; j++) {
            //         System.out.print(start + " ");
            //         start = 1 - start;
            //     }
            //     System.out.println();
            // }

            // 0 
            // 1 0 
            // 0 1 0 
            // 1 0 1 0 
            // 0 1 0 1 0
        }
        {
            // for (int i = 1; i <= n; i++) {
            //     for (int j = 1; j <= i; j++) {
            //         System.out.print(j);
            //     }

            //     for (int j2 = 1; j2 <= n - i + 1; j2++) {
            //         System.out.print(" ");
            //     }
            //     for (int k2 = 1; k2 <= n - i; k2++) {
            //         System.out.print(" ");
            //     }
            //     for (int k = i; k >= 1; k--) {
            //         System.out.print(k);
            //     }
            //     System.out.println();
            // }
            // 1       1
            // 12     21
            // 123   321
            // 1234 4321
        }
        {
            int n1=5;
            int count=1;
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                     System.out.print(count+" ");
                     count++;
                }
                System.out.println();
            }

            // 1 
            // 2 3
            // 4 5 6
            // 7 8 9 10
        }
    }
}
