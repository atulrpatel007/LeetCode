class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < num.length(); i++) {
            while (!stack.isEmpty() && (stack.peek() - '0' > num.charAt(i) - '0') && k > 0) {
                stack.pop();
                k--;
            }
            stack.push(num.charAt(i));
        }
        while(k>0 && !stack.isEmpty()){
            stack.pop();
            k--;
        }
        if(stack.isEmpty()){
            return "0";
        }
        String result = "";
        while(!stack.isEmpty()){
            result += stack.pop();
        }
        result = new StringBuilder(result).reverse().toString();
        while(!result.isEmpty() && result.charAt(0) == '0'){
            result = result.substring(1);
        }
        if(result.isEmpty()){
            return "0";
        }
        return result;
    }
}