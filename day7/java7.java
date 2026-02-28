
class java7 {

    public static void main(String[] arg) {
        {//1

            // for(int i=1;i<=5;i++){
            //     for(int j=1;j<=5;j++){
            //         System.out.print("*");
            //     }
            //     System.out.println();
            // }
        }
        {//2
            // for (int i = 1; i <= 5; i++) {
            //     for (int j = 1; j <= i; j++) {
            //         System.out.print("*");
            //     }
            //     System.out.println();
            // }
        }
        {//3
            //  for (int i = 1; i <= 5; i++) {
            //     for (int j = 1; j <= i; j++) {
            //         System.out.print(j);
            //     }
            //     System.out.println();
            // }
        }
        {
            int n = 4;

            // Outer loop which will loop for the rows.
            for (int i = 0; i < n; i++) {

                //This loop will print the spaces
                for (int j = 0; j < i; j++) {
                    System.out.print("1");
                }

                // This loop will print asterisk.
                for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
                    System.out.print("*");
                }

                /* As soon as stars for each iteration are printed,
             move to the next row and give a line break */
                System.out.println();
            }
        }
    }
}

// ## 🔢 Pattern List
// ### 1. Solid Square
// ```
// *****
// *****
// *****
// *****
// *****
// ```
// ### 2. Right-Angled Triangle (Increasing)
// ```
// *
// **
// ***
// ****
// *****
// ```
//3.numbers triangle
// 1
// 12
// 123
// 1234
// 12345
