class Solution {
    static void swap(int[] ar,int st,int end)
    {
        int temp=ar[st];
        ar[st]=ar[end];
        ar[end]=temp;
    }
    public void sortColors(int[] nums) {
        int low=0,mid=0,high=nums.length-1;

        while(mid<=high)
        {
            if(nums[mid]==2)
            {
                swap(nums,mid,high);
                high--;
            }
            else if(nums[mid]==1)
            {
                mid++;
            }
            else{
                swap(nums,low,mid);
                low++;
                mid++;
            }
        }
    }
}