class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int min = Integer.MAX_VALUE;
            int max = 0;
            int k = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    k = j;
                }
            }
            for (int r = 0; r < matrix.length; r++) {
                max = Math.max(max, matrix[r][k]);
            }
            if (max == min) {
                list.add(max);
            }
        }
        return list;
    }
}