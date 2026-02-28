
class java11 {

    public static void main(String[] args) {
        int n = 4;
        {
            //1
            // for (int i = 0; i < n; i++) {
            //     char ch = (char) ('A' + i);
            //     for (int j = 0 ;j <= i; j++) {
            //         System.out.print(ch);
            //     }
            //     System.out.println();
            // }
        }
        {
                // for(int i=1;i<=n;i++){
                //     for(char ch='A';ch<='A'+(n-i);ch++){
                //         System.out.print(ch);
                //     }
                //     System.out.println();
                // }
        }
        {
            //3
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
        }
        {
            //4
            for (int i = 1; i <= n; i++) {
                char ex = (char) ('D'-1 );
                for (char ch = ex; ch >= 'D'; ch--) {
                    System.out.print(ch);
                }

                System.out.println();
            }
        }
    }
}

//1:
// A
// BB
// CCC
// DDDD
// EEEEE


//2
// ABCD
// ABC
// AB
// A



//3
//    A
//   ABA
//  ABCBA
// ABCDCBA

