




class no8 {

    public static void main(String args[]) {
        //Amstrogam number
        int num=153;
        int count=count(num);
        int temp=num;
        int ans=0;
        while(num!=0){
            int last=num%10;
            ans=ans+(int)Math.pow(last,count);
            num/=10;
        }
        System.out.println(ans);
    }
    public static  int count(int num){
        int count=0;
        for(int i=num;i>=0;i=i/10){
            count++;
        }
        return(count);
    }
}