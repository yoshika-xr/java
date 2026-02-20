class java8 {
    public static void main(String[] args) {
        {//1
        int n=5;
            for (int i = 1; i <= n; i++) {
                for (int j = i; j <= n; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    }
}
