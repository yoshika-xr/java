
import java.util.Scanner;

class no7 {
    //found the palindrome number//

    static int reverseNumber(int num) {
        int sum = 0;
        while (num != 0) {
            int n = num % 10;
            sum = sum * 10 + n;
            num = num / 10;
        }
        return (sum);
    
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num == reverseNumber(num)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }

}
