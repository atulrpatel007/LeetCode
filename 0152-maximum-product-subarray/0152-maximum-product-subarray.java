class Solution {

    public int maxProduct(int[] nums) {

        int prefix = 1;
        int suffix = 1;

        int max = Integer.MIN_VALUE;

        int n = nums.length;

        for (int i = 0; i < n; i++) {

            prefix *= nums[i];

            suffix *= nums[n - i - 1];

            max = Math.max(max, Math.max(prefix, suffix));

            prefix = prefix == 0 ? 1 : prefix;

            suffix = suffix == 0 ? 1 : suffix;
        }

        return max;
    }
}