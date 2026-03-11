class no3{
    public static void main(String[] args) {
        
//print count of divisor//
        {
            int num = 6;
            int count = 0;
            int start = 1;
            while(start <= num) {
                if (num % start == 0) {
                    count++;
                }
                start++;
            }
            System.out.print(count);
        }
    }
}