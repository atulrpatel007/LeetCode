class Solution {
    public void moveZeroes(int[] nums) {
        int FirstZero = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                FirstZero = i;
                count++;
                break;
            }
        }
        if(count == 0) return;
        for (int i = FirstZero+1; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[FirstZero];
                nums[FirstZero] = temp;
                FirstZero++;
            }
        }
    }
}