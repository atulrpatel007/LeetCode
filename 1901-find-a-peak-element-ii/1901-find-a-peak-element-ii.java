class Solution {
    public int[] findPeakGrid(int[][] mat) {
         int m = mat.length;
        int n = mat[0].length;

        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int maxRow = colMax(mat, mid);

            int left = (mid - 1 >= 0) ? mat[maxRow][mid - 1] : -1;
            int right = (mid + 1 < n) ? mat[maxRow][mid + 1] : -1;

            if (mat[maxRow][mid] > left && mat[maxRow][mid] > right) {
                return new int[]{maxRow, mid};
            }
            else if (left > mat[maxRow][mid]) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        return new int[]{-1, -1};
    }

    static int colMax(int[][] matrix, int col) {
        int maxVal = Integer.MIN_VALUE;
        int rowIndex = 0;

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][col] > maxVal) {
                maxVal = matrix[i][col];
                rowIndex = i;
            }
        }

        return rowIndex;
    }
}