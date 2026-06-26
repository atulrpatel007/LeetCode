class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        boolean flag = true;
        if(dividend<0 && divisor>0 ||  dividend>0 && divisor<0){
            flag = false;
        }
        long ans = 0;
        long n = Math.abs((long) dividend);
        long k = Math.abs((long) divisor);
        long res = 0;
        while(n>=k){
            int count = 0;
            while (n>= k<<count+1){
                count++;
            }
            ans += 1<<count;
            n-=k<<count;
        }
        if(flag&&ans>Integer.MAX_VALUE){
            ans = Integer.MAX_VALUE;
        }
        if(!flag&&ans>Integer.MAX_VALUE){
            ans = Integer.MIN_VALUE;
        }
        return flag ? (int) ans : (int)-ans;
    }
}