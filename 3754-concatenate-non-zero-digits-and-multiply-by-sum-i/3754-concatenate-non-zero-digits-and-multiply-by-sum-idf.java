class Solution {
    public long sumAndMultiply(int n) {
        long sum=0;
        long d=0;
        long temp=0;
        long x=0;
        while(n>0){
            d=n%10;
            if (d!=0){
                sum=sum+d;
                temp=temp*10+d;
            }
            n=n/10;
        }
        while(temp!=0){
           long val=temp%10;
            x=(x*10)+val;
            temp/=10;
        }
        return x*sum;
    }
}