class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = 0;
        int [] ans = {-1,-1};
        start = searchExtremeElement(nums,target,true);
        end = searchExtremeElement(nums,target,false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }
    int searchExtremeElement(int[] nums, int target,boolean findFirst) {
        int ans = -1;
        int start = 0;
        int end = nums.length-1;
        while (start <= end) {
            int mid = start + (end-start)/2;
            if (nums[mid] > target){
                end = mid-1;
            }
            else if (nums[mid] < target){
                start = mid+1;
            }
            else {
                ans = mid;
                if (findFirst) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
    }
