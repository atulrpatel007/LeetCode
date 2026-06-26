class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < matrix[i].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = n-1; i >= 0; i--) {
            reverse(matrix,i,0,n-1);
        }
    }
    static void reverse(int[][] arr,int r,int i, int j) {
        while (i < j) {
            int temp = arr[r][j];
            arr[r][j] = arr[r][i];
            arr[r][i] = temp;
            i++;
            j--;
        }
    }
}