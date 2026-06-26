class Solution {
    public int shipWithinDays(int[] weights, int days) {
         int total = 0;
        int n = weights.length;
        int heaviest=0;
        for(int weight: weights){
            total += weight;
            if(weight>heaviest) heaviest = weight;
        }
        int left = Math.max(heaviest,(total-1)/ days+1);
        int right = heaviest*((n-1)/days+1);
        while(left<right){
            int mid = left+(right-left)/2;
            boolean suffecient= isSufficient(mid, weights, days, n);
            if(suffecient) right = mid;
            else left =mid+1;
        }
        return right;
    }
    public static boolean isSufficient(int mid, int [] weights, int days, int n){
        int w =0;
        int time=0;
        for(int i =0; i<n; i++){
            if(mid<weights[i]) return false;
            w+=weights[i];
            if(w>mid){
                if(++time==days) return false;
                w=weights[i];
            }
        }
        return true;
    }
}