class Solution {
    public int maximalRectangle(char[][] matrix) {
        int n =  matrix.length;
        int m = matrix[0].length;
        int[][] temp = new int[n][m];
        int max = 0;
        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += 1;
                if(matrix[j][i]=='0'){
                    sum = 0;
                }
                temp[j][i]=sum;
            }
        }
        for (int i = 0; i < n; i++) {
            max = Math.max(max, largestRectangleArea(temp[i]));
        }
        return max;
    }
    static int largestRectangleArea(int [] heights) {
        Stack<Integer> st = new Stack<>();
        int max = 0;
        for (int i = 0; i < heights.length; i++) {
            while (!st.isEmpty() && heights[i] <= heights[st.peek()]) {
                int top = st.peek();
                st.pop();
                int pse = st.isEmpty() ? -1 :  st.peek();
                int nse = i;
                max = Math.max(max, heights[top] * (nse - pse - 1));
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            int top = st.peek();
            st.pop();
            int pse = st.isEmpty() ? -1 :  st.peek();
            int nse = heights.length;
            max = Math.max(max, heights[top] * (nse - pse - 1));
        }
        return max;
    }
}