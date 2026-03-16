
class no9 {

    public static void main(String[] args) {
        int num = 7;
        int div = 2;
        boolean isprime = true;
        while (div < num / 2) {
            if (num % div == 0) {
                isprime = false;
                break;
            }
            div++;
        }
        if (isprime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not prime");
        }
    }
}
