class no6{
    public static void main(String[] args) {
            //reverse the given number//
        {
            int num=1234;
            int sum=0;
            while(num !=0){
                int n=num%10;
                sum=sum*10+n;
                num=num/10;
            }
            System.out.println(sum);
        }
    }
}