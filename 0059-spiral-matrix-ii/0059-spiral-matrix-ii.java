class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int top = 0, left = 0;
        int bottom = n - 1;
        int right = n - 1;
        int k =1;
        while (left <= right && top <= bottom) {

            // left → right
            for (int i = left; i <= right; i++) {
                matrix[top][i] = k;
                k++;
            }
            top++;

            // top → bottom
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = k;
                k++;
            }
            right--;

            // right → left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = k;
                    k++;
                }
                bottom--;
            }

            // bottom → top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left]=k;
                    k++;
                }
                left++;
            }
        }

        return matrix;
    }
}