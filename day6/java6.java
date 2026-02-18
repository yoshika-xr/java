
class java6 {

    public static void main(String[] args) {
        //revise the given number//
        {
            int num = 1534236469;
            int sum = 0;
            while (num != 0) {
                int n = num % 10;
                if (sum > Integer.MAX_VALUE / 10
                        || (sum == Integer.MAX_VALUE / 10 && num > 7)) {
                    System.out.println(0);
                }

                if (sum < Integer.MIN_VALUE / 10
                        || (sum == Integer.MIN_VALUE / 10 && num < -8)) {
                    System.out.println(0);
                }
                sum = sum * 10 + n;
                num /= 10;
            }
            System.out.println(sum);
        }
        {
          
        }
        {
            // int num = 123;
            // int count = 0;
            // for (int i = num; i > 0; i/= 10) {
            //     count++;
            // }
            // System.out.println(count);
        }
        {
            // Class containing the method to find string length
            class Solution {
                // Function to return length of a string

                public int findLength(String s) {
                    // Return length using built-in function
                    return s.length();
                }
            }
            // Driver class

            // Create object of Solution class
            Solution obj = new Solution();
            // Input string
            String s = "Hello World";
            // Call function and print result
            System.out.println(obj.findLength(s));
        }
    }

}
