class Solution {
    public int[] getConcatenation(int[] nums) {
        int x = nums.length;
        int[] concatenation = new int[2*x];
        for(int i = 0; i < x; i++){
            concatenation[i] = nums[i];
            concatenation[i+x] = nums[i];
        }
        return concatenation;
    }
}