class Solution {
    public List<String> addOperators(String num, int target) {
            List<String> ans = new ArrayList<>();
            backtrack(num, target, 0, 0, 0, "", ans);
            return ans;
        }
        static void backtrack(String num,
                               int target,
                               int index,
                               long currValue,
                               long lastOperand,
                               String expr,
                               List<String> ans) {

            if (index == num.length()) {
                if (currValue == target) {
                    ans.add(expr);
                }
                return;
            }

            for (int i = index; i < num.length(); i++) {

                // Avoid numbers with leading zeros
                if (i > index && num.charAt(index) == '0') {
                    break;
                }

                String part = num.substring(index, i + 1);
                long value = Long.parseLong(part);

                if (index == 0) {

                    backtrack(
                            num,
                            target,
                            i + 1,
                            value,
                            value,
                            part,
                            ans
                    );

                } else {

                    // Addition
                    backtrack(
                            num,
                            target,
                            i + 1,
                            currValue + value,
                            value,
                            expr + "+" + part,
                            ans
                    );

                    // Subtraction
                    backtrack(
                            num,
                            target,
                            i + 1,
                            currValue - value,
                            -value,
                            expr + "-" + part,
                            ans
                    );

                    // Multiplication
                    backtrack(
                            num,
                            target,
                            i + 1,
                            currValue - lastOperand + lastOperand * value,
                            lastOperand * value,
                            expr + "*" + part,
                            ans
                    );
                }
            }
        }
}