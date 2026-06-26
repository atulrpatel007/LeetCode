class Solution {
    public int minDays(int[] bloom, int m, int k) {
        int max=Integer.MIN_VALUE;
        for(int i:bloom){
            max=Math.max(max,i);
        }
        int l=1,r=max,ans=-1;
        while(l<=r){
            int mid=(l+r)/2;
            boolean temp=check(bloom,m,k,mid);
            if(temp){
                ans=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
        
    }
   boolean check(int[] bloom, int m, int k, int days) {

    int flowers = 0;
    int bouquets = 0;

    for(int x : bloom) {

        if(x <= days) {

            flowers++;

            if(flowers == k) {
                bouquets++;
                flowers = 0;
            }

        } else {
            flowers = 0;
        }
    }

    return bouquets >= m;
}
}