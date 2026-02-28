
class java12 {

    public static void main(String[] args) {
        int n = 5;
        {
            //1
            // for(int i=1;i<=n;i++){
            //     for(int j=0;j<=n-i;j++){
            //         System.out.print("*");
            //     }
            //     for(int sp=1;sp<)
            //     System.out.println();
            // }
        }
        {
            for (int i1 = 1; i1 <= n; i1++) {
                for (int sp1 = 0; sp1 <= n - i1; sp1++) {
                    System.out.print("*");
                }
                for (int j1 = 1; j1 <= i1-1; j1++) {
                    System.out.print(" ");
                }
                for (int k1 = 1; k1 <= i1 - 1; k1++) {
                    System.out.print(" ");
                }
                for (int l1 = 0; l1 <= n - i1; l1++) {
                    System.out.print("*");
                }
                System.out.println();

            }
            {
                for (int i2 = 1; i2 <= n; i2++) {
                    for (int sp2 = 0; sp2 <= i2 - 1; sp2++) {
                        System.out.print("*");
                    }
                    for (int j2 = 1; j2 <= n - i2; j2++) {
                        System.out.print(" ");
                    }
                    for (int k2 = 1; k2 <= n - i2; k2++) {
                        System.out.print(" ");
                    }
                    for (int l2 = 0; l2 <= i2 - 1; l2++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
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