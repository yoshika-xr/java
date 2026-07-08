
public class recursion3 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4,5};
        int n=5;
        int[] res = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            res[n - i - 1] = arr[i];
        }
        for (int i = 0; i < n; i++) {
            arr[i] = res[i];
        System.out.println(arr[i]);
        }
    }
}
