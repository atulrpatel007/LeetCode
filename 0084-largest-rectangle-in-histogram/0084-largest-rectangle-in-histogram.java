
class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int max = 0;
        for (int i = 0; i < heights.length; i++) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                int curr = st.pop();
                int pse = !st.empty() ? st.peek() : -1;
                int nse = i;
                max = Math.max(max, heights[curr] * (nse - pse - 1));
            }
            st.push(i);
        }
        while (!st.isEmpty()) {
            int curr = st.pop();
            int pse = !st.empty() ? st.peek() : -1;
            int nse = heights.length;
            max = Math.max(max, heights[curr] * (nse - pse - 1));
        }
        return max;
    }
}
