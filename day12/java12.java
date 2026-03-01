
class java12 {

    public static void main(String[] args) {
        int n = 5;
        {
            //1
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                for (int sp = 1; sp <= n - i; sp++) {
                    System.out.print("1");
                }
                for (int sp = 1; sp <= n - i; sp++) {
                    System.out.print("1");
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i = 1; i <= n-1; i++) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print("*");
                }
                for (int sp = 0; sp < i; sp++) {
                    System.out.print("1");
                }
                for (int sp = 0; sp < i; sp++) {
                    System.out.print("1");
                }
                for (int k = 1; k <= n - i; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        {
            int spaces = 2*n-2;
        
        // Outer loop to print the row.
        for(int i = 1; i <= 2*n-1; i++){
            // Stars for first half
            int stars = i;
            
            // Stars for the second half.
            if(i > n) stars = 2*n - i;
            
            // For printing the stars
            for(int j = 1; j <= stars; j++){
                System.out.print("*");
            }
            
            // For printing the spaces
            for(int j = 1; j <= spaces; j++){
                System.out.print("1");
            }
            
            // For printing the stars
            for(int j = 1; j <= stars; j++){
                System.out.print("*");
            }
            
            // Give a line break for new row.
            System.out.println();
            
            if(i < n) spaces -= 2;
            else spaces += 2;
        }
        }
        {
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
        }
        {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n-1; j++) {
                    if (i == 1 || i == 5 ||j==1 ||j==n-1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        {

        }

    }
}

//1
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
