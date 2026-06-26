class Solution {
    public static long check(int n,int[] a){
        long h=0;
        for(int i:a){
            h+=(i+n-1)/n;
        }
        return h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = 0;
        for(int i:piles){
            r = Math.max(i,r);
        }
        int p = r;
        while(l<=r){
            int k = (l+r)/2;
            long hr = check(k,piles);
            if(hr<=h){
                p = k;
                r = k-1;
            }
            else{
                l = k+1;
            }
        }
        return p;
    }
}