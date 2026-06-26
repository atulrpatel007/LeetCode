class Solution {
    public List<List<String>> solveNQueens(int n) {
     List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        int[] row = new int[n];
        int[] lower = new int[2 * n - 1];
        int[] upper = new int[2 * n - 1];
        answer(ans, board, row, lower, upper, 0, n);
        return ans;

    }
    static void answer(List<List<String>> ans,char [][]  board,int [] row,int [] lower ,int [] upper,int col,int n ) {
        if(col == n){
            List<String> temp = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                temp.add(new String(board[i]));
            }
            ans.add(temp);
            return;
        }
        for(int i = 0; i < n; i++){
            if(row[i] != 1 && lower[i+col]!=1 && upper[n-i+col-1]!=1){
                row[i] = 1;
                lower[i+col] = 1;
                upper[n-i+col-1] = 1;
                board[i][col] = 'Q';
                answer(ans,board,row,lower ,upper,col+1,n);
                row[i] = 0;
                lower[i+col] = 0;
                upper[n-i+col-1] = 0;
                board[i][col] = '.';
            }
        }
    }
}