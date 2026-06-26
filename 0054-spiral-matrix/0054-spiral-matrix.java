class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();

        int top = 0, left = 0;
        int bottom = matrix.length - 1;
        int right = matrix[0].length - 1;

        while (left <= right && top <= bottom) {

            // left → right
            for (int i = left; i <= right; i++) {
                list.add(matrix[top][i]);
            }
            top++;

            // top → bottom
            for (int i = top; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }
            right--;

            // right → left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // bottom → top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }

        return list;
    }
}