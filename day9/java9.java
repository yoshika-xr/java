
class java9 {

    public static void main(String[] args) {
        //1      //method1
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
        {
            //2         
            // int n = 4;
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
        }
          {
         //3
         int n=4;
            int start = 0;
            for (int i = 0; i <= n; i++) {
                if (i % 2 == 0) {
                    start = 1;
                } else {
                    start = 0;
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print(start + " ");
                    start = 1-start;
                }
            System.out.println();
            }
        }
        
    }
    }
//1
//    *
//   ***
//  *****
// *******
// *******
//  *****
//   ***
//    *

//2
// *
// **
// ***
// ****
// ******
// ****
// ***
// **
// *



//3
// 0 
// 1 0 
// 0 1 0 
// 1 0 1 0 
// 0 1 0 1 0