package bit manipulation;

class Sum {
    public int getSum(int a, int b) {
        
        while(b!=0)
        {
            int carry=(a&b)<<1;
            int ans=a^b;
            a=ans;
            b=carry;
        } 
        return a;
    }
    public static void main(String[] args){
        Sum s=new Sum();
        int ans=s.getSum(2,5);
        System.out.println(ans);
    }
}
