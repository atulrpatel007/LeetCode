class Solution {
    public int majorityElement(int[] nums) {
        int cnt = 0;
        int ele = 0;
        int n = nums.length;
        for(int i = n-1;i>=0;i--){
            if(cnt == 0){
                ele = nums[i];
                cnt++;
            } else if (ele == nums[i]) {
                cnt++;
            }
            else{
                cnt --;
            }
        }
        return ele;
    }
}