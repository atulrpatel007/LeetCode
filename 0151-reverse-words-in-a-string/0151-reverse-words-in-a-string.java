class Solution {
    public String reverseWords(String s) {
     int n = s.length() - 1;
        StringBuffer result = new StringBuffer();
        while (n >= 0) {
            while(n >= 0 && s.charAt(n) == ' ') {
                n = n - 1;
            }
            if (n < 0) break;
            int end = n;
            while(n >= 0 && s.charAt(n) != ' ') {
                n--;
            }
            String temp = s.substring(n + 1, end+1);
            if(result.length()>0)
                result.append(" ");
            result.append(temp);
        }
        return result.toString();
    }
}