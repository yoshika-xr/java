
class java10 {

    public static void main(String[] args) {
        int n = 5;
        {
            //1
            // for (int i = 1; i <= n; i++) {
            //     for (int j = 1; j <= i; j++) {
            //         System.out.print(j);
            //     }

            //     for (int j2 = 1; j2 <= n - i + 1; j2++) {
            //         System.out.print("*");
            //     }
            //     for (int k2 = 1; k2 <= n - i; k2++) {
            //         System.out.print("*");
            //     }
            //     for (int k = i; k >= 1; k--) {
            //         System.out.print(k);
            //     }
            //     System.out.println();
            // }
        }
        {
            //2
            // int n1=5;
            // int count=1;
            // for(int i=1;i<=n;i++){
            //     for(int j=1;j<=i;j++){
            //          System.out.print(count+" ");
            //          count++;
            //     }
            //     System.out.println();
            // }

        }
        {
            //3
            // for (int i = 1; i <= n; i++) {
            //     for (char ch = 'A'; ch < 'A'+i; ch++) {
            //         System.out.print(ch+" ");
            //     }
            //     System.out.println();
            // }
        }
        {
            //4
              for (int i = 1; i <= n; i++) {
                int ru='A'; 
                for (char ch = 'A'; ch < ru-i; ch++) {
                    System.out.print(ch+" ");
                }
                System.out.println();
            }
        }
    }
}

//1
// 1*********1
// 12*******21
// 123*****321
// 1234***4321
// 12345*54321


//2
// 1 
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15


//3
// A 
// A B
// A B C
// A B C D
// A B C D E
