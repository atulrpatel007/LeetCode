class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1,n=nums.length,high=max(nums);
        while(low<=high){
            int mid=low+((high-low)/2);
            if(calculate(nums,mid,n)<=threshold)
            high=mid-1;
            else
            low=mid+1;
        }
        return low;
    }
    public int max(int[] nums){
        int max=Integer.MIN_VALUE;
        for(int val:nums)
        {
            if(val>max)
            max=val;
        }
        return max;
    }
    public int calculate(int[] nums,int k,int n){
        int total=0;
        for(int i=0;i<n;i++){
            total+=(nums[i]+k-1)/k;
        }
        return total;
    }
}