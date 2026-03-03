
class java13 {

    static void reverseNumber(int num) {
        int sum = 0;
        while (num != 0) {
            int n = num % 10;
            sum = sum * 10 + n;
            num = num / 10;
        }
        System.out.println(sum);

    }

    public static void main(String[] args) {
        int num = 1234;
        int obj=reverseNumber(num);
        if(num==obj){
            System.out.println(".()");
        }
        System.out.println(num);
    }
}
