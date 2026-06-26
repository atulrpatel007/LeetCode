class Solution {
    public String removeOuterParentheses(String s) {
         StringBuilder str = new StringBuilder();

        int cnt = 0;
        for (char ch: s.toCharArray()) {
            if(ch == '(') {
                if(cnt > 0) str.append(ch);
                cnt++;
            } else {
                cnt--;
                if(cnt > 0) str.append(ch);
            }
        }

        return str.toString();
    }
}
