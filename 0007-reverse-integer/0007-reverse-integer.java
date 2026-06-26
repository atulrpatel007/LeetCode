class Solution {
    public int reverse(int n) {
        int ans=0;
        int temp = n;
        n = Math.abs(n);
        while(n>0){
            int last = n%10;
            n = n/10;
            if(ans>(Integer.MAX_VALUE-last)/10){
                return 0;
            }
            ans = (ans*10)+last;
        }
        if(temp<0){
            return -1*ans;
        }
        return ans;
    }
}