class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int[] a:accounts) {
            int sum = 0;
            for (int b : a) {
                sum += b;
            }
            if(sum > max) {
                max = sum;
            }
        }
        return max;
    }
    }