class no1{
    public static void main(String[] args) {
          {
            //found the count of given digit//
            int a = 0;
            if (a == 0) {
                System.out.println(1);
            } else {
                int count = 0;
                while (a > 0) {
                    a = a / 10;
                    count++;
                }
                System.out.println(count);
            }
        }
    }
}