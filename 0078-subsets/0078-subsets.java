class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        int total = 1<<n;
        for (int i = 0; i < total; i++) {
            for(int j = 0; j < n; j++) {
                if((i&(1<<j) ) != 0){
                    list.add(nums[j]);
                }
            }
            ans.add(new ArrayList<>(list));
            list.clear();
        }
        return ans;
    }
}