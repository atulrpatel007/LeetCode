class Solution {
    public int minBitFlips(int start, int goal) {
        if (start == goal) {
            return  0;
        }
        int count = 0;
        int num = start ^ goal;
        for (int i = 0; i < 32; i++) {
            if ((num & (1 << i)) != 0) {
                count++;
            }
        }
        return count;
    }
}