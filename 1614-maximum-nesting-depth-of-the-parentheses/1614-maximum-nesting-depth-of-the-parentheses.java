class Solution {
    public int maxDepth(String s) {
        int curr = 0 ;
        int max = 0;

        for(char p : s.toCharArray()){

            if(p == '('){
                curr++;
                max = Math.max(max , curr);
            }else if (p == ')'){
                curr--;
            }
        }
        return max;
    }
}