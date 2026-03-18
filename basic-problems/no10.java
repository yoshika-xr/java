
class no10 {

    public int[] divisor(int n) {
        int[] ans = new int[n];
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                ans[count++] = i;
            }
        }
        return (ans);
    }

    public static void main(String[] args) {
        no10 obj = new no10();
        int[] resu=obj.divisor(10);
        for (int i = 0; i < resu.length; i++) {
            if (resu[i] != 0) {
                System.out.print(resu[i] + " ");
            }
        }
    }
}
