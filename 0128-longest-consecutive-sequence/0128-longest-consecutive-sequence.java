class Solution {
    public int longestConsecutive(int[] nums) {

        int n = nums.length;

        if(n == 0) return 0;

        Arrays.sort(nums);

        int longest = 1;
        int prevSmallest = nums[0];
        int count = 1;

        for(int i = 1; i < n; i++) {

            if(nums[i] == prevSmallest + 1) {
                count++;
                prevSmallest = nums[i];
            }

            else if(nums[i] != prevSmallest) {
                count = 1;
                prevSmallest = nums[i];
            }

            longest = Math.max(count, longest);
        }

        return longest;
    }
}