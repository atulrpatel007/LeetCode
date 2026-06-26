class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = -1;
        for (int j = n - 2; j >= 0; j--) {
            if (nums[j] < nums[j + 1]) {
                i =  j;
                break;
            }
        }
        if (i == -1) {
            reverse(nums, 0, n - 1);
            return;
        }
        for(int j = n-1;j>=0;j--){
            if(nums[j]>nums[i]){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                break;
            }
        }
        reverse(nums, i+1, n-1);
    }
    static void reverse(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
}
}