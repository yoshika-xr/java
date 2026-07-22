
public class hashing {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 7, 8, 8};
        int[] hash = new int[10];
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
            System.out.println(arr[i] + "->" + hash[arr[i]]);
            hash[10] = 0;
        }
    }
}
