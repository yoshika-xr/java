
class java7 {

    public static void main(String[] arg) {
        int n = 4;
        {

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

        {
            //other way//
            int spaces = 2 * n - 2;

            // Outer loop to print the row.
            for (int i = 1; i <= 2 * n - 1; i++) {
                // Stars for first half
                int stars = i;

                // Stars for the second half.
                if (i > n) {
                    stars = 2 * n - i;
                }

                // For printing the stars
                for (int j = 1; j <= stars; j++) {
                    System.out.print("*");
                }

                // For printing the spaces
                for (int j = 1; j <= spaces; j++) {
                    System.out.print(" ");
                }

                // For printing the stars
                for (int j = 1; j <= stars; j++) {
                    System.out.print("*");
                }

                // Give a line break for new row.
                System.out.println();

                if (i < n) {
                    spaces -= 2;
                } else {
                    spaces += 2;
                }
            }
        }

    }
}
