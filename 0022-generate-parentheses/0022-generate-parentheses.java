import java.util.ArrayList;
import java.util.List;

class Solution {
    List<String> ans = new ArrayList<>();

    public void rec(StringBuilder str , int opened, int closed, int n){
        if(str.length() == 2*n){
            ans.add(str.toString());
            return;
        }
        if(opened < n){
            str.append("(");
            rec(str, opened+1, closed, n);
            str.deleteCharAt(str.length()-1);
        }
        if(closed < opened){
            str.append(")");
            rec(str, opened, closed+1, n);
            str.deleteCharAt(str.length()-1);
        }
    }

    public List<String> generateParenthesis(int n) {
        rec(new StringBuilder(), 0, 0, n);
        return ans;
    }
}