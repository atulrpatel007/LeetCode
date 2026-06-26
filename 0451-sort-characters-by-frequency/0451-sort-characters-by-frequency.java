class Solution {
    public String frequencySort(String s) {
        int[] freq = new int[128];
        char[] charArray = s.toCharArray();
        for (char c: charArray) {
            freq[c]++;
        }

        char[] result = new char[s.length()];
        int idx = 0;
        while (idx < s.length()) {
            int maxFreq = 0;
            int maxChar = 0;
            for (int i = 0; i < 128; i++) {
                if (freq[i] > maxFreq) {
                    maxFreq = freq[i];
                    maxChar = i;
                }
            }
            while (maxFreq-- > 0) {
                result[idx++] = (char) maxChar;
            }
            freq[maxChar] = 0;
        }
        return new String(result);
    }
}