class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> list = new ArrayList<>();

        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int mid = i + 1;
            int right = n - 1;

            while (mid < right) {

                int sum = nums[i] + nums[mid] + nums[right];

                if (sum == 0) {

                    list.add(Arrays.asList(nums[i], nums[mid], nums[right]));

                    mid++;
                    right--;

                    // Skip duplicates
                    while (mid < right && nums[mid] == nums[mid - 1]) {
                        mid++;
                    }

                    while (mid < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                }

                else if (sum < 0) {
                    mid++;
                }

                else {
                    right--;
                }
            }
        }

        return list;
    }
}