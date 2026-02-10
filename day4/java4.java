class java4{
    public static void main(String[] args) {
        
//print count of divisor//
        {
            int num = 60;
            int count = 0;
            int start = 2;
            while(start <= num / 2) {
                if (num % start == 0) {
                    count++;
                }
                start++;
            }
            System.out.println(count);
        }
    }
}

