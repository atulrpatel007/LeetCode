class Solution {
    public void reverseString(char[] s) {
        for(int j=0;j<s.length/2;j++){
            int n = s.length;
            char temp = s[j];
            s[j] = s[n-j-1];
            s[n-j-1] = temp;
        }
    }
}