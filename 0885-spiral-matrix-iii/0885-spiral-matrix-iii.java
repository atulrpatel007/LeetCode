class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        
        int[][] result = new int[rows * cols][2];

        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};

        int r = rStart, c = cStart;
        int idx = 0;
        int step = 1;

        result[idx++] = new int[]{r, c};

        while (idx < rows * cols) {

            for (int d = 0; d < 4; d++) {

                for (int i = 0; i < step; i++) {

                    r += dr[d];
                    c += dc[d];

                    if (r >= 0 && r < rows && c >= 0 && c < cols) {
                        result[idx++] = new int[]{r, c};
                    }
                }

                if (d == 1 || d == 3) {
                    step++;
                }
            }
        }

        return result;
    }
}