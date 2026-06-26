class Solution {
    public int findNumbers(int[] nums) {
        int n=nums.length;
        int c=0;
        for(int i=0;i<n;i++){
            if(((int)(Math.log10(nums[i])+1))%2==0)
            c++;
        }
        return c;
    }
}